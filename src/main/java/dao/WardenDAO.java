package dao;

import java.sql.SQLException; 
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import database.ConnectToDB;
import entity.All1;
import entity.Wardens;

public class WardenDAO {
	
	public static List<Wardens> selectTableWarden() throws SQLException{
		var ps=ConnectToDB.getConn().prepareStatement("select * from Wardens");
		var rs=ps.executeQuery();
		List<Wardens> list=new ArrayList<>();
		while(rs.next()) {
			list.add(new Wardens(rs.getInt("warden_id"),rs.getString("first_name"),rs.getString("last_name"),(rs.getDate("date_of_birth")).toLocalDate(),rs.getString("gender"),rs.getString("phone_number"),rs.getString("email"),rs.getString("address"),rs.getString("position"),rs.getDate("start_date").toLocalDate(),rs.getInt("day_off"),rs.getBoolean("is_Working"),rs.getDouble("salary"),rs.getInt("shift_number")));
		}
		return  list;
	}
	
	
	public static boolean checkExistWardenId(int wardenId) {
	    try {
	        List<Wardens> wardens = selectTableWarden();
	        
	        for (Wardens warden : wardens) {
	            if (warden.getWardenId() == wardenId) {
	                return true;
	            }
	        }
	        return false;
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return false;
	    }
	}
	
	public int countWard() {
		int count = 0;
		try (
				var con = ConnectToDB.getConn();
				var cs = con.prepareCall("{call countWard}");
				var rs= cs.executeQuery();
		){
			while(rs.next()) {
				count = rs.getInt(1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return count;
	}
	
	public List<Wardens> getListWard(int pageNumber, int rowofPage){
		List<Wardens> list = new ArrayList<>();
		try(
				var con = ConnectToDB.getConn();
		){
			var cs = con.prepareCall("{call selWard(?,?)}");
			cs.setInt(1,pageNumber);
			cs.setInt(2, rowofPage);
			var rs= cs.executeQuery();
			while(rs.next()) {
				var ward = new Wardens();
				ward.setWardenId(rs.getInt("warden_id"));
				ward.setFirstName(rs.getString("first_name"));
				ward.setLastName(rs.getString("last_name"));
				ward.setDateOfBirth(rs.getDate("date_of_birth").toLocalDate());
				ward.setIsMale(rs.getString("gender"));
				ward.setPhoneNumber(rs.getString("phone_number"));
				ward.setEmail(rs.getString("email"));
				ward.setAddress(rs.getString("address"));
				ward.setPosition(rs.getString("position"));
				ward.setStartDate(rs.getDate("start_date").toLocalDate());
				ward.setDay_off(rs.getInt("day_off"));
				ward.setIs_Working(rs.getBoolean("is_Working"));
				ward.setSalary(rs.getDouble("salary"));
				ward.setShift_number(rs.getInt("shift_number"));
				list.add(ward);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static void insertWard(All1 ward) {
		try(
			var con = ConnectToDB.getConn();
			var cs = con.prepareStatement("INSERT INTO Wardens (warden_id, first_name, last_name, date_of_birth, gender, phone_number, email, address, position,start_date, day_off, is_Working, salary) values(?,?,?,?,?,?,?,?,?,?,?,?,?)"
		);)
				{
			cs.setInt(1, ward.getWardenId());
			cs.setString(2, ward.getFirstName());
			cs.setString(3, ward.getLastName());
			cs.setDate(4, java.sql.Date.valueOf(ward.getDateOfBirth()));
			cs.setString(5, ward.getIsMale());
			cs.setString(6, ward.getPhoneNumber());
			cs.setString(7, ward.getEmail());
			cs.setString(8, ward.getAddress());
			cs.setString(9, ward.getPosition());
			cs.setDate(10, java.sql.Date.valueOf(ward.getStartDate()));
			cs.setInt(11, ward.getDay_off());
			cs.setBoolean(12, ward.getIs_Working());
			cs.setDouble(13, ward.getSalary());
			
			if(cs.executeUpdate()>0) {
				JOptionPane.showMessageDialog(null, "Success", " info", JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void deleteWard(Wardens warden) {
		try (
				var con = ConnectToDB.getConn();
				var cs = con.prepareCall("DELETE FROM Wardens WHERE warden_id=?");
		){
			cs.setInt(1, warden.getWardenId());
			if(cs.executeUpdate()>0) {
				JOptionPane.showMessageDialog(null, "success", "info", JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void updateWard(All1 ward) {
	    try (
	        var con = ConnectToDB.getConn();
	        var cs = con.prepareCall("UPDATE Wardens SET first_name=?, last_name=?, date_of_birth=?, gender=?, phone_number=?, email=?, address=?, position=?, start_date=?, day_off=?, is_Working=?, salary=? WHERE warden_id=?");
	    ) {
	    	cs.setInt(13, ward.getWardenId());
			cs.setString(1, ward.getFirstName());
			cs.setString(2, ward.getLastName());
			cs.setDate(3, java.sql.Date.valueOf(ward.getDateOfBirth()));
			cs.setString(4, ward.getIsMale());
			cs.setString(5, ward.getPhoneNumber());
			cs.setString(6, ward.getEmail());
			cs.setString(7, ward.getAddress());
			cs.setString(8, ward.getPosition());
			cs.setDate(9, java.sql.Date.valueOf(ward.getStartDate()));
			cs.setInt(10, ward.getDay_off());
			cs.setBoolean(11, ward.getIs_Working());
			cs.setDouble(12, ward.getSalary());

	        if (cs.executeUpdate() > 0) {
	            JOptionPane.showMessageDialog(null, "Success");
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}

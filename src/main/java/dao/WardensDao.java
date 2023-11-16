package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import database.ConnectToDB;
import entity.All1;
import entity.Prisoners;
import entity.Wardens;

public class WardensDao {
	private static PreparedStatement ps=null;
	private static ResultSet rs=null;
	
	public static void insertWard(All1 ward) {
		try(
			var con = ConnectToDB.getConn();
			var cs = con.prepareStatement("INSERT INTO Wardens (warden_id, first_name, last_name, date_of_birth, gender, phone_number, email, address, position,start_date, day_off, is_Working, salary, shift_number) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)"
		))
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
			cs.setInt(14, ward.getShift_number());
			if(cs.executeUpdate()>0) {
				JOptionPane.showMessageDialog(null, "Success", " info", JOptionPane.INFORMATION_MESSAGE);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static List<All1> selectTableWardens() throws SQLException{
		ps=ConnectToDB.getConn().prepareStatement("SELECT\r\n"
				+ "Wardens.*,\r\n"
				+ "WorkShiftsByWarden.*,\r\n"
				+ "Areas.* \r\n"
				+ "FROM\r\n"
				+ "Wardens\r\n"
				+ "INNER JOIN WorkShiftsByWarden\r\n"
				+ "ON\r\n"
				+ "Wardens.shift_number =WorkShiftsByWarden.shift_number\r\n"
				+ "INNER JOIN\r\n"
				+ "Areas\r\n"
				+ "ON\r\n"
				+ "WorkShiftsByWarden.area_id =Areas.area_id\r\n");
		rs=ps.executeQuery();
		List<All1> list=new ArrayList<>();
		while(rs.next()) {
			list.add(new All1(rs.getInt("warden_id"),rs.getString("first_name"),rs.getString("last_name"),(rs.getDate("date_of_birth")).toLocalDate(),rs.getString("gender"),rs.getString("phone_number"),rs.getString("email"),rs.getString("address"),rs.getString("position"),rs.getDate("start_date").toLocalDate(),rs.getInt("day_off"),rs.getBoolean("is_Working"),rs.getInt("salary"),rs.getInt("shift_number"),
								rs.getString("shift_type"),rs.getDate("shift_date").toLocalDate(),rs.getTime("start_time"),rs.getTime("end_time"),rs.getInt("area_id"),rs.getString("area_name"),rs.getString("description"),rs.getString("areas_location_description")));
		}
		return list;
	}
	
	public static void updateWard(All1 ward) {
	    try (
	        var con = ConnectToDB.getConn();
	        var cs = con.prepareCall("UPDATE Wardens SET first_name=?, last_name=?, date_of_birth=?, gender=?, phone_number=?, email=?, address=?, start_date=?, day_off=?, is_Working=?, salary=? WHERE warden_id=?");
	    ) {
	    	cs.setInt(12, ward.getWardenId());
			cs.setString(1, ward.getFirstName());
			cs.setString(2, ward.getLastName());
			cs.setDate(3, java.sql.Date.valueOf(ward.getDateOfBirth()));
			cs.setString(4, ward.getIsMale());
			cs.setString(5, ward.getPhoneNumber());
			cs.setString(6, ward.getEmail());
			cs.setString(7, ward.getAddress());
			cs.setDate(8, java.sql.Date.valueOf(ward.getStartDate()));
			cs.setInt(9, ward.getDay_off());
			cs.setBoolean(10, ward.getIs_Working());
			cs.setDouble(11, ward.getSalary());

	        if (cs.executeUpdate() > 0) {
	            JOptionPane.showMessageDialog(null, "Success");
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public static void updateWardA(All1 ward) {
	    try (
	        var con = ConnectToDB.getConn();
	        var cs = con.prepareCall("UPDATE Wardens SET shift_number=? WHERE warden_id=?");
	    ) {
	    	cs.setInt(2, ward.getWardenId());
			cs.setInt(1,ward.getShift_number());

	        if (cs.executeUpdate() > 0) {
	            JOptionPane.showMessageDialog(null, "Success");
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	public static void updateWardP(All1 ward) {
	    try (
	        var con = ConnectToDB.getConn();
	        var cs = con.prepareCall("UPDATE Wardens SET position=? WHERE warden_id=?");
	    ) {
	    	cs.setInt(2, ward.getWardenId());
			cs.setString(1,ward.getPosition());

	        if (cs.executeUpdate() > 0) {
	            JOptionPane.showMessageDialog(null, "Success");
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	public static boolean checkExistWardenId(int wardenId) {
	    try {
	        List<All1> wardens = selectTableWardens();
	        
	        for (All1 warden : wardens) {
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

}

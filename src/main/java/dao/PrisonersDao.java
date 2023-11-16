package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import database.ConnectToDB;
import entity.P_C_A;
import entity.Prisoners;
import entity.Wardens;

public class PrisonersDao {
	private static PreparedStatement ps=null;
	private static ResultSet rs=null;
	
	public static void insertPrisoner(Prisoners pr) throws SQLException {	
		ps=ConnectToDB.getConn().prepareStatement(
				"INSERT INTO Prisoners (prisoner_id,first_name,last_name,date_of_birth,nationality,gender,date_of_entry,release_date,cell_id,conviction,punishment,religion,image) "
				+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
		ps.setInt(1,pr.getId());
		ps.setString(2,pr.getFirstName());
		ps.setString(3,pr.getLastName());
		ps.setDate(4, java.sql.Date.valueOf(pr.getDateOfBirth())); 
		ps.setString(5,pr.getNationality());
		ps.setString(6,pr.getIsMale());
		ps.setDate(7, java.sql.Date.valueOf(pr.getDateOfEntry())); 
		ps.setDate(8, java.sql.Date.valueOf(pr.getReleaseDate())); 
		ps.setInt(9,pr.getCellId());
		ps.setString(10,pr.getConviction());
		ps.setString(11,pr.getPunishment());
		ps.setString(12,pr.getReligion());
		ps.setString(13,pr.getImage());
		
		ps.executeUpdate();
		ConnectToDB.getConn().close();	
	}
	
	public static List<Prisoners> selectTablePrisoners() throws SQLException{
		ps=ConnectToDB.getConn().prepareStatement("select * from Prisoners");
		rs=ps.executeQuery();
		List<Prisoners> list=new ArrayList<>();
		while(rs.next()) {
			list.add(new Prisoners(rs.getInt("prisoner_id"),rs.getString("first_name"),rs.getString("last_name"),(rs.getDate("date_of_birth")).toLocalDate(),rs.getString("nationality"),rs.getString("gender"),rs.getDate("date_of_entry").toLocalDate(),rs.getDate("release_date").toLocalDate(),rs.getInt("cell_id"),rs.getString("conviction"),rs.getString("punishment"),rs.getString("religion"),rs.getString("image")));
		}
		return  list;
	}
	public static void updatePrioners(Prisoners pr) throws SQLException {
		ps=ConnectToDB.getConn().prepareStatement("UPDATE Prisoners SET "
				+ "first_name =?,"
				+ "last_name =?,"
				+ "date_of_birth =?,"	
				+ "nationality =?,"
				+ "gender =?,"
				+ "date_of_entry =?,"
				+ "release_date =?,"
				+ "cell_id =?,"
				+ "conviction =?,"
				+ "punishment =?,"
				+ "religion =?,"
				+ "image =?"
				+ " WHERE prisoner_id=?");
		
		 	ps.setString(1, pr.getFirstName());
		    ps.setString(2, pr.getLastName());
		    ps.setDate(3, java.sql.Date.valueOf(pr.getDateOfBirth()));
		    ps.setString(4, pr.getNationality());
		    ps.setString(5, pr.getIsMale());
		    ps.setDate(6, java.sql.Date.valueOf(pr.getDateOfEntry()));
		    ps.setDate(7, java.sql.Date.valueOf(pr.getReleaseDate()));
		    ps.setInt(8, pr.getCellId());
		    ps.setString(9, pr.getConviction());
		    ps.setString(10, pr.getPunishment());
		    ps.setString(11, pr.getReligion());
		    ps.setString(12, pr.getImage());
		    ps.setInt(13, pr.getId());
		ps.executeUpdate();
		ConnectToDB.getConn().close();
	}
	public static void changeCell(Prisoners pr) throws SQLException {
		ps=ConnectToDB.getConn().prepareStatement("UPDATE Prisoners SET cell_id=? where prisoner_id=?");
		ps.setInt(1, pr.getCellId());
		ps.setInt(2, pr.getId());
		ps.executeUpdate();
		ConnectToDB.getConn().close();
	}
	public static List<Prisoners> countPrisoner(int id) throws SQLException {
		ps=ConnectToDB.getConn().prepareStatement("select Prisoners.prisoner_id,CellsByPrisoner.cell_id\r\n"
				+ "  from Prisoners\r\n"
				+ "  inner Join CellsByPrisoner\r\n"
				+ "  on Prisoners.cell_id=CellsByPrisoner.cell_id\r\n"
				+ "  where CellsByPrisoner.cell_id="+id);
		rs=ps.executeQuery();
		List<Prisoners> list=new ArrayList<>();
		while(rs.next()) {
			list.add(new Prisoners(rs.getInt("prisoner_id"),rs.getInt("cell_id")));
		}
		return  list;
	}
public static List<P_C_A> selectTablePrioners1() throws SQLException{
		
		ps=ConnectToDB.getConn().prepareStatement("SELECT\r\n"
				+ "Prisoners.*,\r\n"
				+ "CellsByPrisoner.*,\r\n"
				+ "Areas.*\r\n"
				+ "FROM\r\n"
				+ "Prisoners\r\n"
				+ "INNER JOIN CellsByPrisoner\r\n"
				+ "ON\r\n"
				+ "Prisoners.cell_id=CellsByPrisoner.cell_id\r\n"
				+ "INNER JOIN\r\n"
				+ "Areas\r\n"
				+ "ON\r\n"
				+ "CellsByPrisoner.area_id =Areas.area_id");
		rs=ps.executeQuery();
		List<P_C_A> list=new ArrayList<>();
		while(rs.next()) {
			list.add(new P_C_A(rs.getInt("prisoner_id"),rs.getString("first_name"),rs.getString("last_name"),(rs.getDate("date_of_birth")).toLocalDate(),rs.getString("nationality"),rs.getString("gender"),rs.getDate("date_of_entry").toLocalDate(),rs.getDate("release_date").toLocalDate(),rs.getInt("cell_id"),rs.getString("conviction"),rs.getString("punishment"),rs.getString("religion"),rs.getString("image"),
					rs.getInt("cell_number"),rs.getString("status"),rs.getString("status"),rs.getString("size"),rs.getInt("Floor_N"),rs.getInt("area_id"),rs.getString("area_name"),rs.getString("description"),rs.getString("areas_location_description")));
		}
		return list;
		
	}
	public static List<P_C_A> selectTablePrionersForUser() throws SQLException{
		
		ps=ConnectToDB.getConn().prepareStatement("SELECT Wardens.warden_id, Prisoners.*, CellsByPrisoner.*, Areas.* FROM Wardens\r\n"
				+ "INNER JOIN WorkShiftsByWarden ON Wardens.shift_number = WorkShiftsByWarden.shift_number\r\n"
				+ "INNER JOIN Areas ON WorkShiftsByWarden.area_id = Areas.area_id\r\n"
				+ "INNER JOIN CellsByPrisoner ON Areas.area_id = CellsByPrisoner.area_id\r\n"
				+ "INNER JOIN Prisoners ON CellsByPrisoner.cell_id = Prisoners.cell_id");
		rs=ps.executeQuery();
		List<P_C_A> list=new ArrayList<>();
		while(rs.next()) {
			list.add(new P_C_A(rs.getInt("prisoner_id"),rs.getString("first_name"),rs.getString("last_name"),(rs.getDate("date_of_birth")).toLocalDate(),rs.getString("nationality"),rs.getString("gender"),rs.getDate("date_of_entry").toLocalDate(),rs.getDate("release_date").toLocalDate(),rs.getInt("cell_id"),rs.getString("conviction"),rs.getString("punishment"),rs.getString("religion"),rs.getString("image"),
					rs.getInt("cell_number"),rs.getString("status"),rs.getString("status"),rs.getString("size"),rs.getInt("Floor_N"),rs.getInt("area_id"),rs.getString("area_name"),rs.getString("description"),rs.getString("areas_location_description"),rs.getInt("warden_id")));
		}
		return list;
		
	}

}

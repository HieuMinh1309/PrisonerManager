package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.ConnectToDB;
import entity.Account;
import entity.HealthByPrisoner;
import entity.P_C_A;
import entity.Prisoners;

public class HealthDao {
	private static PreparedStatement ps=null;
	private static ResultSet rs=null;
	
	public static void insertHealth(HealthByPrisoner hp) throws SQLException {
		ps=ConnectToDB.getConn().prepareStatement(
				"INSERT INTO HealthByPrisoner (prisoner_id,medical_history,current_conditions,allergies) "
				+ "values(?,?,?,?)");
		ps.setInt(1,hp.getId());
		ps.setString(2,hp.getMedicalHistory());
		ps.setString(3,hp.getCurrentConditions());
		ps.setString(4,hp.getAllergies() ); 
		
		ps.executeUpdate();
		ConnectToDB.getConn().close();	
	}
	public static List<P_C_A> selectTablehHealth() throws SQLException {
		ps=ConnectToDB.getConn().prepareStatement("select Prisoners.prisoner_id,CellsByPrisoner.cell_number,CellsByPrisoner.Floor_N,Areas.area_name,HealthByPrisoner.*\r\n"
				+ "  from Prisoners\r\n"
				+ "  inner join HealthByPrisoner\r\n"
				+ "  on HealthByPrisoner.prisoner_id=Prisoners.prisoner_id\r\n"
				+ "  inner join CellsByPrisoner\r\n"
				+ "  on CellsByPrisoner.cell_id=Prisoners.cell_id\r\n"
				+ "  inner join Areas\r\n"
				+ "  on Areas.area_id=CellsByPrisoner.area_id\r\n"
				+ "  order by Prisoners.prisoner_id asc");
		rs=ps.executeQuery();
		List<P_C_A> list=new ArrayList<>();
		while(rs.next()) {
			list.add(new P_C_A(rs.getInt("prisoner_id"),rs.getInt("health_id"),rs.getString("medical_history"),rs.getString("current_conditions"),rs.getString("allergies"),rs.getInt("cell_number"),rs.getInt("Floor_N"),rs.getString("area_name")));
		}
		return  list;
	}
	public static void updateHealth(HealthByPrisoner hp) throws SQLException {
		ps=ConnectToDB.getConn().prepareStatement("UPDATE HealthByPrisoner SET "
				+ "medical_history =?,"
				+ "current_conditions =?,"
				+ "allergies =?"	
				+ " WHERE health_id=?");
		
		 	ps.setString(1, hp.getMedicalHistory());
		    ps.setString(2, hp.getCurrentConditions());
		    ps.setString(3, hp.getAllergies());
		    ps.setInt(4, hp.getHealthId());
		    
		ps.executeUpdate();
		ConnectToDB.getConn().close();
	}
}

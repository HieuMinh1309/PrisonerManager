package dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.ConnectToDB;
import entity.Areas;
import entity.HealthByPrisoner;
import entity.Prisoners;
import entity.Wardens;
public class AreasDAO {

	private static PreparedStatement ps=null;
	private static ResultSet rs=null;
	
	public static void insertAreas(Areas pr) throws SQLException {	
		ps=ConnectToDB.getConn().prepareStatement(
				"INSERT INTO Areas (area_name,description,areas_location_description) "
				+ "values(?,?,?)");
		ps.setString(1,pr.getAreaName());
		ps.setString(2,pr.getDescription());
		ps.setString(3,pr.getAreasLocationDescription());
		ps.executeUpdate();
		ConnectToDB.getConn().close();	
	}
	
	public static List<Areas> selectTableAreas() throws SQLException{
		ps=ConnectToDB.getConn().prepareStatement("select * from Areas");
		rs=ps.executeQuery();
		List<Areas> list=new ArrayList<>();
		while(rs.next()) {
			list.add(new Areas(rs.getInt("area_id"),rs.getString("area_name"),rs.getString("description"),rs.getString("areas_location_description")));
		}
		return list;
	}
	public static void updateAreas(Areas ar) throws SQLException {
		ps=ConnectToDB.getConn().prepareStatement("UPDATE Areas SET "
				+ "area_name =?,"
				+ "description =?,"
				+ "areas_location_description =?"	
				+ " WHERE area_id=?");
		
		 	ps.setString(1, ar.getAreaName());
		    ps.setString(2, ar.getDescription());
		    ps.setString(3, ar.getAreasLocationDescription());
		    ps.setInt(4, ar.getAreaId());
		    
		ps.executeUpdate();
		ConnectToDB.getConn().close();
	}
}

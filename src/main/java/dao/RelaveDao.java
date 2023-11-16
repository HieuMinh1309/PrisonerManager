package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.ConnectToDB;
import entity.Areas;
import entity.P_C_A;
import entity.RelativesByPrisoner;

public class RelaveDao {
	private static PreparedStatement ps=null;
	private static ResultSet rs=null;
	
	public static void inserRela(RelativesByPrisoner rl) throws SQLException {	
		ps=ConnectToDB.getConn().prepareStatement(
				"INSERT INTO RelativesByPrisoner (prisoner_id,relative_name,contact_info,relationship,CCCD,image) "
				+ "values(?,?,?,?,?,?)");
		ps.setInt(1,rl.getId());
		ps.setString(2,rl.getRelativeName());
		ps.setString(3,rl.getContactInfo());
		ps.setString(4,rl.getRelationship());
		ps.setInt(5,rl.getCCCD());
		ps.setString(6,rl.getImage());
		
		ps.executeUpdate();
		ConnectToDB.getConn().close();	
	}
	
	public static List<RelativesByPrisoner> selectTableRela() throws SQLException{
		ps=ConnectToDB.getConn().prepareStatement("select * from RelativesByPrisoner");
		rs=ps.executeQuery();
		List<RelativesByPrisoner> list=new ArrayList<>();
		while(rs.next()) {
			list.add(new RelativesByPrisoner(rs.getInt("relative_id"),rs.getInt("prisoner_id"),rs.getString("relative_name"),rs.getString("contact_info"),rs.getString("relationship"),rs.getInt("CCCD"),rs.getString("image")));
		}
		return  list;
	}
	public static List<P_C_A> selectTableRela1() throws SQLException{
		ps=ConnectToDB.getConn().prepareStatement("select Prisoners.prisoner_id,CellsByPrisoner.cell_number,CellsByPrisoner.Floor_N,Areas.area_name,RelativesByPrisoner.*\r\n"
				+ "  from Prisoners\r\n"
				+ "  inner join RelativesByPrisoner\r\n"
				+ "  on RelativesByPrisoner.prisoner_id=Prisoners.prisoner_id\r\n"
				+ "  inner join CellsByPrisoner\r\n"
				+ "  on CellsByPrisoner.cell_id=Prisoners.cell_id\r\n"
				+ "  inner join Areas\r\n"
				+ "  on Areas.area_id=CellsByPrisoner.area_id\r\n"
				+ "  order by Prisoners.prisoner_id asc");
		rs=ps.executeQuery();
		List<P_C_A> list=new ArrayList<>();
		while(rs.next()) {
			list.add(new P_C_A(rs.getInt("prisoner_id"),rs.getInt("cell_number"),rs.getInt("Floor_N"),rs.getString("area_name"),rs.getInt("relative_id"),rs.getString("relative_name"),rs.getString("contact_info"),rs.getString("relationship"),rs.getInt("CCCD"),rs.getString("image")));
		}
		return  list;
	}
	public static void updateRela(RelativesByPrisoner r) throws SQLException {
		ps=ConnectToDB.getConn().prepareStatement("UPDATE RelativesByPrisoner SET "
				+ "relative_name =?,"
				+ "contact_info =?,"
				+ "relationship =?,"
				+ "CCCD=?,"
				+ "image=?"	
				+ " WHERE relative_id =?");
		
		 	ps.setString(1, r.getRelativeName());
		    ps.setString(2, r.getContactInfo());
		    ps.setInt(4, r.getCCCD());
		    ps.setString(3, r.getRelationship());
		    ps.setString(5, r.getImage());
		    ps.setInt(6, r.getRelativeId());
		    
		    
		ps.executeUpdate();
		ConnectToDB.getConn().close();
	}
}

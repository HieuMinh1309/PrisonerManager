package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import database.ConnectToDB;
import entity.Admin;
import entity.Areas;

public class AdminDao {
	private static PreparedStatement ps=null;
	private static ResultSet rs=null;
	
	public static void insertAdmin(Admin ad) throws SQLException {	
		ps=ConnectToDB.getConn().prepareStatement(
				"INSERT INTO Admin (username,password,email,key) "
				+ "values(?,?,?)");
		ps.setString(1,ad.getUsername());
		ps.setString(2,ad.getPassword());
		ps.setString(3,ad.getEmail());
		ps.setInt(4,ad.getKey());
		ps.executeUpdate();
		ConnectToDB.getConn().close();	
	}
	
	public static List<Admin> selectTableAdmin() throws SQLException{
		ps=ConnectToDB.getConn().prepareStatement("select * from Admin");
		rs=ps.executeQuery();
		List<Admin> list=new ArrayList<>();
		while(rs.next()) {
			list.add(new Admin(rs.getString("username"),rs.getString("password"),rs.getString("email"),rs.getInt("key")));
		}
		return list;
	}
	public static void updatePass(Admin ad) throws SQLException {
		ps=ConnectToDB.getConn().prepareStatement("UPDATE Admin SET password=? WHERE username='admin'");	
		 	ps.setString(1, ad.getPassword());
		ps.executeUpdate();
		ConnectToDB.getConn().close();
	}
	public static void updateKey(Admin ad) throws SQLException {
		ps=ConnectToDB.getConn().prepareStatement("UPDATE Admin SET key=? WHERE username='admin'");	
		 	ps.setInt(1, ad.getKey());
		ps.executeUpdate();
		ConnectToDB.getConn().close();
	}
	
}

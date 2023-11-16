package dao;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import database.ConnectToDB;
import entity.Areas;
import entity.CellsByPrisoner;

public class CellDao {

	private static PreparedStatement ps=null;
	private static ResultSet rs=null;
	
	public static void addCellsPri(CellsByPrisoner cells) throws SQLException {
		ps =ConnectToDB.getConn().prepareStatement("INSERT INTO CellsByPrisoner (cell_number, status, size, area_id, Floor_N) VALUES (?, ?, ?, ?, ?)");

	        if (isAreaIdValid(ConnectToDB.getConn(), cells.getAreaId())) {
	            ps.setInt(1, cells.getCellNumber());
	            ps.setString(2, cells.getStatus());
	            ps.setString(3, cells.getSize());
	            ps.setInt(5, cells.getFloor_N());
	            ps.setInt(4, cells.getAreaId());
	            if (ps.executeUpdate() > 0) {
	                JOptionPane.showMessageDialog(null, "Insert success CellsByPrisoner");
	            }
	        } else {
	            JOptionPane.showMessageDialog(null, "Invalid area_id. Please provide a valid area_id.");
	        }
	}
	
	public static List<CellsByPrisoner> selectTableCell() throws SQLException{
		ps=ConnectToDB.getConn().prepareStatement("select * from CellsByPrisoner");
		rs=ps.executeQuery();
		List<CellsByPrisoner> list=new ArrayList<>();
		while(rs.next()) {
			list.add(new CellsByPrisoner(rs.getInt("cell_id"),rs.getInt("cell_number"),rs.getString("status"),rs.getString("size"),rs.getInt("area_id"),rs.getInt("Floor_N")));
		}
		return list;
	}
	private static boolean isAreaIdValid(Connection con, int areaId) {
	    try (var areaQuery = con.prepareStatement("SELECT COUNT(*) FROM Areas WHERE area_id = ?")) {
	        areaQuery.setInt(1, areaId);
	        try (var rs = areaQuery.executeQuery()) {
	            if (rs.next()) {
	                int count = rs.getInt(1);
	                return count > 0;
	            }
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return false;
	}
	public static void updateCellsPri(CellsByPrisoner cells) throws SQLException {
			ps=ConnectToDB.getConn().prepareStatement("UPDATE CellsByPrisoner SET cell_number = ?, status = ?, size = ?,area_id = ?, Floor_N = ? WHERE cell_id=?");
	    	ps.setInt(6, cells.getCellId());
	    	ps.setInt(1, cells.getCellNumber());
	        ps.setString(2, cells.getStatus());
	        ps.setString(3, cells.getSize());
	        ps.setInt(5, cells.getFloor_N());
	        ps.setInt(4, cells.getAreaId());

	        if (ps.executeUpdate() > 0) {
	            JOptionPane.showMessageDialog(null, "Update success CellsByPrisoner");}
	}
}

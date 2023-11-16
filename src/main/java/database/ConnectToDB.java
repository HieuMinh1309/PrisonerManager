package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectToDB {
	private static Connection con=null;
	private static Statement stmt=null;
	private static final String url = "jdbc:sqlserver://";
	private static final String serverName = "LAPTOP-35QMNA7J";
	private static final String portNumber = "1433";
	private static final String databaseName = "TuNhan";
	private static final String user = "sa";
	private static final String password = "Hieu1309";
	
	
	//trả về chuỗi kết nối
	public static String getConnectURL() {
		return url+serverName+":"+portNumber
				+"; databaseName="+databaseName
				+"; user="+user
				+"; password="+password;
	}
	
	
	
	//Connection
	public static Connection getConn() throws SQLException {
		return DriverManager.getConnection(getConnectURL());
	}
	//Statement
	public static Statement getSta() throws SQLException { 
		return getConn().createStatement();	
	}
}

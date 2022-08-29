package com.cmc.bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionBDD {
	public static Connection connect(String host, int port, String user, String pwd, String database){
		String connectionUrl = "jdbc:sqlserver://"+host+":"+port
				+"; database="+database
				+"; user="+user
				+"; password="+pwd
				+"; encrypt=false"
				+"; trustServerCertificate=false"
				+"; loginTimeout=10;";
		Connection con = null;
		try {
			con = DriverManager.getConnection(connectionUrl);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
}

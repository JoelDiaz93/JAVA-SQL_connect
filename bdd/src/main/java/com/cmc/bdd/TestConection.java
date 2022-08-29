package com.cmc.bdd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConection {

	public static void main(String[] args) {
		String connectionUrl = "jdbc:sqlserver://localhost:1450;"
				+"database=cmc;"
				+"user=sa;"
				+"password=saPwd2022*;"
				+"encrypt=false;"
				+"trustServerCertificate=false;"
				+"loginTimeout=10;";
		
		try {
			Connection con = DriverManager.getConnection(connectionUrl);
			System.out.println("Conexion exitosa");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}

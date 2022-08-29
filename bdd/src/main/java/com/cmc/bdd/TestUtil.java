package com.cmc.bdd;

import java.sql.Connection;

public class TestUtil {
	public static void main(String[] args) {
		Connection con = ConnectionBDD.connect("localhost", 1450, "sa", "saPwd2022*", "cmc");
		if(con!=null){
			System.out.println("Conexion exitosa");
		}
	}
}

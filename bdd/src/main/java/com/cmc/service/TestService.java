package com.cmc.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cmc.bdd.ConnectionBDD;
import com.cmc.entities.Test;

public class TestService {
	public void insertar(Test test){
		Connection con = ConnectionBDD.connect("localhost", 1450, "sa", "saPwd2022*", "cmc");
		String sql="EXEC sp_test @i_operacion = ?, @i_codigo = ?, @i_nombre = ?";
		if(con!=null){
			System.out.println("Conexion exitosa");
			try {
				PreparedStatement ps = con.prepareCall(sql);
				//Colocamos los valores en el orden que se encuentra la sentecia sql
				ps.setString(1, "I");
				ps.setInt(2, test.getCodigo());
				ps.setString(3, test.getNombre());
				ps.execute();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public ArrayList<Test> search(){
		ArrayList<Test> lista = new ArrayList<Test>();
		Connection con = ConnectionBDD.connect("localhost", 1450, "sa", "saPwd2022*", "cmc");
		String sql="EXEC sp_test @i_operacion = ?";
		if(con!=null){
			System.out.println("Conexion exitosa");
			try {
				PreparedStatement ps = con.prepareCall(sql);
				//Colocamos los valores en el orden que se encuentra la sentecia sql
				ps.setString(1, "S");
				ResultSet rs = ps.executeQuery();
				Test test = null;
				while(rs.next()){
					test = new Test(rs.getString(2),rs.getInt(1));
					lista.add(test);
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		return lista;
	}
}

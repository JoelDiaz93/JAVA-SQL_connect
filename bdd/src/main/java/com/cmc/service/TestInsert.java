package com.cmc.service;

import com.cmc.entities.Test;

public class TestInsert {

	public static void main(String[] args) {
		TestService ts = new TestService();
		ts.insertar(new Test("Lili", 8));
		System.out.println("Ejecucion exitosa!!!");
	}

}

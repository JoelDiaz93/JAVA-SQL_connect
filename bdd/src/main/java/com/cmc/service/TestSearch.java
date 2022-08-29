package com.cmc.service;

import java.util.ArrayList;

import com.cmc.entities.Test;

public class TestSearch {

	public static void main(String[] args) {
		TestService ts = new TestService();
		ArrayList<Test> lista = ts.search();
		System.out.println(lista);
	}

}

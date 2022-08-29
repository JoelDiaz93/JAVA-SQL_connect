package com.cmc.entities;

public class Test {
	private String nombre;
	private int codigo;

	public Test(String nombre, int codigo) {
		super();
		this.nombre = nombre;
		this.codigo = codigo;
	}

	public Test() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Test [nombre=" + nombre + ", codigo=" + codigo + "]";
	}

}

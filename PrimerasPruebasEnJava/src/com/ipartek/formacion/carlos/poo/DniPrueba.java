package com.ipartek.formacion.carlos.poo;

public class DniPrueba {

	public static void main(String[] args) {
		Dni d = new Dni("12345678A");
		
		Persona p = new Persona();
		
		p.setDni(d);
		
		System.out.println(p);
	}

}

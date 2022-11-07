package com.ipartek.formacion.carlos.poo.ejercicioLibro;

//Escribe un programa para probar el funcionamiento de la clase Libro.

public class LibroPrueba {

	public static void main(String[] args) {
	
		Libro libro1 = new Libro("La catedral del mar", "J. J. Abrams", 5 ,3);
		Libro libro2 = new Libro("El silencio de los corderos", "Stephen King", 7 ,1);
		
		libro1.getTitulo();
		libro2.getAutor();
					

	}

}

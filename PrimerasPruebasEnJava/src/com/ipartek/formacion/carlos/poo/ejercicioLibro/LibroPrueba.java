package com.ipartek.formacion.carlos.poo.ejercicioLibro;

import java.util.Scanner;

//Escribe un programa para probar el funcionamiento de la clase Libro.

public class LibroPrueba {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String titulo, autor;
		int ejemplares;
		
        //se crea el objeto libro1 utilizando el constructor con parámetros
        Libro libro1 = new Libro("El quijote", "Cervantes", 1, 0);
        Libro libro3 = new Libro("La catedral del mar", "J. J. Abrams", 5 ,3);
		Libro libro4 = new Libro("El silencio de los corderos", "Stephen King", 7 ,1);
        //se crea el objeto libro2 utilizando el constructor por defecto
        Libro libro2 = new Libro();
		
        System.out.print("Introduce titulo: ");
        titulo = sc.nextLine();
        System.out.print("Introduce autor: ");
        autor = sc.nextLine();
        System.out.print("Numero de ejemplares: ");
        ejemplares = sc.nextInt();

        //se asigna a libro2 los datos pedidos por teclado.
        //para ello se utilizan los métodos setters
        libro2.setTitulo(titulo);
        libro2.setAutor(autor);
        libro2.setEjemplares(ejemplares);
        
        //se muestran por pantalla los datos del objeto libro1
        //se utilizan los métodos getters para acceder al valor de los atributos
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Ejemplares: " + libro1.getEjemplares());
        System.out.println("Prestados: " + libro1.getPrestados());
        System.out.println();
		
        //se realiza un préstamo de libro1. El método devuelve true si se ha podido
        //realizar el préstamo y false en caso contrario
        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");         
        }
        
        //se realiza una devolución de libro1. El método devuelve true si se ha podido
        //realizar la devolución y false en caso contrario
        if (libro1.devolucion()) {
            System.out.println("Se ha devuelto el libro " + libro1.getTitulo());
        } else {
            System.out.println("No hay ejemplares del libro " + libro1.getTitulo() + " prestados");
        }
        
        //se realiza otro préstamo de libro1
        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");
        }
        
        //se realiza otro préstamo de libro1. En este caso no se podrá realizar ya que
        //solo hay un ejemplar de este libro y ya está prestado. Se mostrará por
        //pantalla el mensaje No quedan ejemplares del libro…
        if (libro1.prestamo()) {
            System.out.println("Se ha prestado el libro " + libro1.getTitulo());
        } else {
            System.out.println("No quedan ejemplares del libro " + libro1.getTitulo() + " para prestar");         
        }
        
        //mostrar los datos del objeto libro1
        System.out.println("Libro 1:");
        System.out.println("Titulo: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Ejemplares: " + libro1.getEjemplares());
        System.out.println("Prestados: " + libro1.getPrestados());
        System.out.println();
        
        //mostrar los datos del objeto libro2
        System.out.println("Libro 2:");
        System.out.println("Titulo: " + libro2.getTitulo());
        System.out.println("Autor: " + libro2.getAutor());
        System.out.println("Ejemplares: " + libro2.getEjemplares());
        System.out.println("Prestados: " + libro2.getPrestados());
        System.out.println();
        
        //mostrar los datos del objeto libro3
        System.out.println("Libro 3:");
        System.out.println("Titulo: " + libro3.getTitulo());
        System.out.println("Autor: " + libro3.getAutor());
        System.out.println("Ejemplares: " + libro3.getEjemplares());
        System.out.println("Prestados: " + libro3.getPrestados());
        System.out.println();
        
        //mostrar los datos del objeto libro4
        System.out.println("Libro 4:");
        System.out.println("Titulo: " + libro4.getTitulo());
        System.out.println("Autor: " + libro4.getAutor());
        System.out.println("Ejemplares: " + libro4.getEjemplares());
        System.out.println("Prestados: " + libro4.getPrestados());
        System.out.println();
        
        sc.close();
					

	}

}

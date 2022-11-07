package com.ipartek.formacion.carlos.poo.ejercicioLibro;

/*Crea una clase llamada Libro que guarde la información de cada uno de los libros de una biblioteca. La clase debe guardar el título del libro, autor, número de ejemplares del libro
 *y número de ejemplares prestados. La clase contendrá los siguientes métodos:
Constructor por defecto.
Constructor con parámetros.
Métodos Setters/getters
Método préstamo que incremente el atributo correspondiente cada vez que se realice un préstamo del libro. No se podrán prestar libros de los que no queden ejemplares disponibles para
 prestar. Devuelve true si se ha podido realizar la operación y false en caso contrario.
Método devolución que decremente el atributo correspondiente cuando se produzca la devolución de un libro. No se podrán devolver libros que no se hayan prestado. Devuelve true si se 
ha podido realizar la operación y false en caso contrario.
Método toString para mostrar los datos de los libros. Este método se heredada de Object y lo debemos modificar (override) para adaptarlo a la clase Libro.
Escribe un programa para probar el funcionamiento de la clase Libro.*/

public class Libro {

	String titulo, autor;
	int numEjemLibro, numEjemPrest;
	
	public Libro() {
		
	}
	
	public Libro(String titulo, String autor, int numEjemLibro, int numEjemPrest) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.numEjemLibro = numEjemLibro;
		this.numEjemPrest = numEjemPrest;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getNumEjemLibro() {
		return numEjemLibro;
	}

	public void setNumEjemLibro(int numEjemLibro) {
		this.numEjemLibro = numEjemLibro;
	}

	public int getNumEjemPrest() {
		return numEjemPrest;
	}

	public void setNumEjemPrest(int numEjemPrest) {
		this.numEjemPrest = numEjemPrest;
	}
	//Método préstamo que incremente el atributo correspondiente cada vez que se realice un préstamo del libro. No se podrán prestar libros de los que no queden ejemplares 
	//disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en caso contrario.

	public boolean Prestamo() {
		boolean prestado = false;
		
		if (numEjemLibro > numEjemPrest) {
			numEjemPrest++;
			prestado = true;
		}
		
		return prestado;
	}
	
	//Método devolución que decremente el atributo correspondiente cuando se produzca la devolución de un libro. No se podrán devolver libros que no se hayan prestado. Devuelve true si se 
	//ha podido realizar la operación y false en caso contrario.
	
	public boolean devolucion() {
		boolean devuelto = true;
		if(numEjemPrest == 0) {
			devuelto = false;
		}else{
			numEjemPrest--;
		}
		return devuelto;
	}

	//Método toString para mostrar los datos de los libros. Este método se heredada de Object y lo debemos modificar (override) para adaptarlo a la clase Libro.
	@Override
	public String toString() {
		return "Libro [titulo=" + titulo + ", autor=" + autor + ", numEjemLibro=" + numEjemLibro + ", numEjemPrest="
				+ numEjemPrest + "]";
	}	

}

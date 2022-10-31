package com.ipartek.formacion.carlos.ejercicios;

/*Ejercicio básico inicial 5
  Escribe un programa java que declare una variable A de tipo entero y asígnale un valor. A continuación muestra un mensaje indicando si A es par o impar. Utiliza el operador 
  condicional ( ? : ) dentro del println para resolverlo. Si por ejemplo A = 14 la salida será 15 es impar 
 */

public class Ejercicio1 {

	public static void main(String[] args) {
	
		int a = 12;
		boolean par = a%2==0;
		boolean impar = a%2>0;
		
		System.out.println(a + (a%2==0 ? " es par " : " es impar ")); 
		System.out.println(par ? true : false);
		System.out.println(impar ? true : false);
		

	}

}


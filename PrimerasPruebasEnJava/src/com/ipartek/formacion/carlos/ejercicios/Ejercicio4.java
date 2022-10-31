package com.ipartek.formacion.carlos.ejercicios;

import java.util.Scanner;

/*EJERCICIOS BÁSICOS RESUELTOS CON ESTRUCTURA SECUENCIAL
  1.Programa Java que lea dos números enteros por teclado y los muestre por pantalla.
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		
	int n1, n2;	
	
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca un número: ");
    n1 = sc.nextInt();
    
    System.out.println("Introduzca otro número: ");
    n2 = sc.nextInt();
    
    System.out.println("Los números son " + n1 + " y " + n2);
    sc.nextLine();
	
	
//Programa Java que lea un nombre y muestre por pantalla:
	
	String nombre;
	
	System.out.println("Escriba un nombre: ");
	nombre = sc.nextLine();
	System.out.println("El nombre es " + nombre);
	
	//Escribe un programa Java que lee un número entero por teclado y obtiene y muestra por pantalla el doble y el triple de ese número.
	
	int num;
	
	System.out.println("Introduzca un número: ");
	num = sc.nextInt();
	System.out.println("El doble de " + num + " es " + (num*2) + " y el triple es " + (num*3));
	sc.close();
    }
}

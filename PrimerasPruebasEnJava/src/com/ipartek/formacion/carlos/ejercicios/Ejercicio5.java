package com.ipartek.formacion.carlos.ejercicios;

import java.util.Scanner;

/*Programa que lea una cantidad de grados centígrados y la pase a grados Fahrenheit.
La fórmula correspondiente para pasar de grados centígrados a fahrenheit es:
F = 32 + ( 9 * C / 5)
 */

public class Ejercicio5 {

	public static void main(String[] args) {
		double gradosC, gradosF; 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una cantidad en grados Centigrados: ");
		gradosC = sc.nextDouble();
		System.out.println(gradosC + " grados Centigrados son " + (gradosF = 32+(9*gradosC/5)) + " grados Fahrenheit");
		
// Programa que lee por teclado el valor del radio de una circunferencia y calcula y muestra por pantalla la longitud y el área de la circunferencia. 		
// Longitud de la circunferencia = 2*PI*Radio, Area de la circunferencia = PI*Radio^2	
		
		double radio, longitud, area;
		
		System.out.println("Introduce el radio de una circunferencia: ");
		radio = sc.nextDouble();
		longitud = 2 * Math.PI * radio;
		area = Math.PI * Math.pow(radio, 2);
		
		System.out.println("La longitud es " + longitud + " y el área es " + area);
		
// Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado.
		
		double velocidadKmh, velocidadMs;
		System.out.println("Introduzca una velocidad en kmh: ");
		velocidadKmh = sc.nextDouble();
		velocidadMs = velocidadKmh * 5 / 18;
		System.out.println(velocidadKmh + "kmh son " + velocidadMs + "ms");
		
//Programa lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud de la hipotenusa según el teorema de Pitágoras.		
//Hipotenusa = raiz cuadrada de cateto1^2 + cateto2^2	
		
		double cateto1, cateto2, hipotenusa;
		System.out.println("Introduce la longitud del primer cateto: ");
		cateto1 = sc.nextDouble();
		System.out.println("Introduce la longitud del segundo cateto: ");
		cateto2 = sc.nextDouble();
		hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		System.out.println("La hipotenusa es " + hipotenusa);
		
	}

}

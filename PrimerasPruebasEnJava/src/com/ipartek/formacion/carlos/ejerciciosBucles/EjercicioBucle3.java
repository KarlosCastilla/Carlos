package com.ipartek.formacion.carlos.ejerciciosBucles;

import java.util.Scanner;

/*Programa que pida que se introduzcan dos números enteros A y B por teclado y muestre los números pares que hay entre A y B. A debe ser menor que B. Si no es así se mostrará 
un mensaje indicándolo y se vuelven a introducir.
Solución
Para resolver este ejercicio seguiremos los siguientes pasos:
1.Introducir los dos números por teclado. Como A debe ser menor que B se utilizará una estructura repetitiva do .. while para repetir la lectura mientras A sea mayor o igual que B.
2.Mostrar los números pares desde A hasta B. Para ello utilizaremos la estructura repetitiva for.
A continuación se muestra el código Java del ejercicio resuelto:
 */

public class EjercicioBucle3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		boolean esPar, esImpar;
		
		do {
		   System.out.println("Introduzca un número entero: ");
		   num1 = sc.nextInt();
		   System.out.println("Introduzca otro número entero: ");
		   num2 = sc.nextInt();
		   if(num1 == num2 || num1 > num2) {
		   	   System.out.println("El primer número debe ser menor que el segundo");
		   }
		}while(num1 == num2 || num1 > num2); 
		
		esPar = num1 % 2==0 ? true : false;
			
		if(esPar) {
		   for(int i = num1; i <= num2; i +=2) {
			   System.out.print(i + " ");
		   }
		}else {
			for(int i = (num1 +1); i <= num2; i +=2) {
				   System.out.print(i + " ");
			}	   
		}   
	}

}

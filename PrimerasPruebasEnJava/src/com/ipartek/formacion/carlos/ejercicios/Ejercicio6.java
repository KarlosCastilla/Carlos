package com.ipartek.formacion.carlos.ejercicios;

import java.util.Scanner;

//Programa Java que lea un número entero de 3 cifras y muestre por separado las cifras del número.


public class Ejercicio6 {

	public static void main(String[] args) {
		
		int num, centenas = 0, decenas = 0, unidades = 0;
		Scanner sc = new Scanner(System.in);
			
			System.out.println("Introduce un número de 3 cifras: ");
			num = sc.nextInt();
			while(num < 100 || num > 999) {
			System.out.println(" El número introducido no es correcto ");
			System.out.println("Introduce un número de 3 cifras: ");
			num = sc.nextInt();
			}
			centenas = (num/100);
			decenas = (num/10)%10;
			unidades = (num%10);
			System.out.println("Las centenas son " + centenas + " las decenas son "+ decenas + " y las unidades " + unidades);	
			
			
/*Programa que lea un número entero N de 5 cifras y muestre sus cifras igual que en el ejemplo.
Por ejemplo para un número N = 12345   La salida debe ser:
1
12
123
1234
12345 		
*/
			int num5, ud, dc, ct, um, dm;
			System.out.println("Introduce un número de 5 cifras: ");
			num5 = sc.nextInt();
			ud = num5 /10000;
			dc = num5 /1000;
			ct = num5 /100;
			um = num5 /10;
			dm = num5;
			System.out.println(ud);
			System.out.println(dc);
			System.out.println(ct);
			System.out.println(um);
			System.out.println(dm);		
			
/*Programa Java que lea un número entero N de 5 cifras y muestre sus cifras igual que en el ejemplo.
Por ejemplo para un número N = 12345    La salida debe ser:
5
45
345
2345
12345		
 */			
			ud = num5 %10;
			dc = num5 %100;
			ct = num5 %1000;
			um = num5 %10000;
			dm = num5;
			
			System.out.println(ud);	
			System.out.println(dc);
			System.out.println(ct);
			System.out.println(um);
			System.out.println(dm);
			
/*Programa que pida por teclado la fecha de nacimiento de una persona (dia, mes, año) y calcule su número de la suerte.
El número de la suerte se calcula sumando el día, mes y año de la fecha de nacimiento y a continuación sumando las cifras obtenidas en la suma.
Por ejemplo:
Si la fecha de nacimiento es 12/07/1980 
Calculamos el número de la suerte así: 12+7+1980 = 1999  1+9+9+9 = 28
Número de la suerte: 28 			
 */
	        int dia, mes, año, suerte, suma, cifra1, cifra2, cifra3, cifra4;                                          
	        System.out.println("Introduzca fecha de nacimiento");
	        System.out.print("día: ");
	        dia = sc.nextInt();
	        System.out.print("mes: ");
	        mes = sc.nextInt();
	        System.out.print("año: ");
	        año = sc.nextInt();
	        suma = dia + mes + año;
	        cifra1 = suma/1000;      //obtiene la primera cifra
	        cifra2 = suma/100%10;    //obtiene la segunda cifra
	        cifra3 = suma/10%10;     //obtiene la tercera cifra
	        cifra4 = suma%10;        //obtiene la última cifra
	        suerte = cifra1 + cifra2 + cifra3 + cifra4;
	        System.out.println("Su número de la suerte es: " + suerte);  		
			
	        sc.close();
	}
	
}

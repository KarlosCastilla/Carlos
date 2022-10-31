package com.ipartek.formacion.carlos.ejerciciosBucles;

import java.util.Scanner;

/*Programa que pida que se introduzcan dos números enteros por teclado y muestre los números desde el menor hasta el mayor de los números introducidos. Los dos números introducidos 
 deben ser distintos. Si son iguales se mostrará un mensaje indicándolo y se vuelven a introducir.
Solución
Para resolver este ejercicio seguiremos los siguientes pasos:
1. Introducir los dos números por teclado. Como los números deben ser distintos utilizaremos una estructura repetitiva do .. while para repetir la lectura mientras los números que 
se introducen sean iguales.
2. Calculamos cuál es el mayor y cuál es el menor.
3. Finalmente se muestran por pantalla los números desde el menor hasta el mayor. Para ello utilizaremos la estructura repetitiva for.
A continuación se muestra el código Java de este ejercicio resuelto:
 */

public class EjercicioBucle2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, numMayor, numMenor;
		
		do {
		   System.out.println("Introduzca un número: ");
		   num1 = sc.nextInt();
		   System.out.println("Introduzca otro número: ");
		   num2 = sc.nextInt();
		   if(num1 == num2) {
		   	   System.out.println("Los números son iguales");
		   }
			   if(num1 < num2) {
			   	   numMayor = num2;
				   numMenor = num1;
			   }else {
				   numMayor = num1;
				   numMenor = num2;
			   }	   
		}while(num1 == num2); 
		
		   if(num1 < num2) {
		   	   numMayor = num2;
			   numMenor = num1;
		   }else {
			   numMayor = num1;
			   numMenor = num2;
		   }
				
	     System.out.println("\nNúmeros desde " + numMenor + " hasta " + numMayor + " : ");
	     for (int i = numMenor; i <= numMayor; i++) {
	         System.out.print(i + " ");
	     }   
		//con while   
		while(numMenor <= numMayor) {
			System.out.print(numMenor + " ");
			numMenor++;
		}
		
		sc.close();
		

	}

}

package com.ipartek.formacion.carlos.ejerciciosBucles;

import java.util.Scanner;

/*Se trata de mostrar los números desde el 1 hasta el 100 utilizando las instrucciones repetitivas while, do while y for.
1. Ejemplo de uso de while: Programa Java que muestre los números del 1 al 100 utilizando la instrucción while.
 */

public class EjercicioBucle1 {

	public static void main(String[] args) {
		
		int num = 1;
		
		while(num <= 100){
			System.out.print(num + " ");
			num ++;
		}
		
//2. Ejemplo de uso de do-while. Programa Java que muestre los números del 1 al 100 utilizando la instrucción do..while.

		int numero = 1;
		System.out.println();
		
		do {
			System.out.print(numero + " ");
			numero ++;	
			
		}while(numero <= 100);
		
//3. Ejemplo de uso de for. Programa Java que muestre los números del 1 al 100 utilizando la instrucción for.
		
		System.out.println();
		int num1 = 0;
		for(int i=0;i<100;i++) {
		num1 ++;
		System.out.print(num1 + " ");
		}
	
//4. Ejemplo de uso de while. Programa Java que muestre los números del 100 al 1 utilizando la instrucción while.	
		System.out.println();
		int num2 = 100;
		
		while(num2 >= 1){
			System.out.print(num2 + " ");
			num2 --;
		}
		
//5. Ejemplo de uso de do-while. Programa Java que muestre los números del 100 al 1 utilizando la instrucción do..while.		
		int num3 = 100;
		System.out.println();
		
		do {
			System.out.print(num3 + " ");
			num3 --;	
			
		}while(num3 >= 1);
		
//6. Ejemplo de for. Programa Java que muestre los números del 100 al 1 utilizando la instrucción for.
		System.out.println();
		int num4 = 101;
		for(int i=100;i>=1;i--) {
		num4 --;
		System.out.print(num4 + " ");
		}
		
/*Escribe un programa Java que pida por teclado el valor de un número N y muestre por pantalla todos los números desde 1 hasta N. Resuelve este ejercicio de tres formas distintas:
1.      Utilizando la estructura for
2.      Utilizando la estructura while
3.      Utilizando la estructura do .. while 	
 */
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Introduce un numero n: ");
	  	n = sc.nextInt();
	//for  		
		for(int i = 1; i <= n; i++) {
			
			System.out.print(i + " ");
		}	
		
	//while	
			int a = 0;
			System.out.println();
			while(n > a){
				a++;
				System.out.print(a + " ");
			}	
			
			
	//do while	
			int b = 0;
			System.out.println();
		do {
			b++;
			System.out.print(b + " ");
		}while(n > b);	
		
		sc.close();
		
	}
	
	

}

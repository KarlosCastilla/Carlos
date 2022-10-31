package com.ipartek.formacion.carlos.ejerciciosArrays;

import java.util.Arrays;
import java.util.Scanner;

/*Desarrollar el juego la cámara secreta, que consiste en abrir una cámara mediante su combinación secreta, que está formada por una combinación de dígitos del uno al cinco.
 * El jugador especificará cual es la longitud de la combinación, a mayor longitud mayor será la dificultad del juego. La aplicación genera, de forma aleatoria, una combinación 
 * secreta que el usuario tendrá que acertar. En cada intento se muestra como pista, para cada dígito de la combinación introducido por el jugador, si es mayor, menor o igual 
 * que el correspondiente de la combinación secreta.
 */

public class EjercicioArrays1 {
	//La aplicación genera de forma aleatoria la combinación secreta, que se solicita al usuario. El juego termina cuando la combinación secreta coincide con la introducida.

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Longitud de la combinación secreta: ");
		int longitud = sc.nextInt();
		int combSecreta[] = new int[longitud]; //tabla con la combinación secreta
		int combJugador[] = new int[longitud]; //combinación introducida por el jugador
		
		generaCombinacion(combSecreta); //generamos aleatoriamente la combinación secreta
		System.out.println("Escriba una combinación");
		leeTabla(combJugador); //volvemos a pedir otra combinación
		
		while (!Arrays.equals(combSecreta, combJugador)) { //terminamos cuando sean iguales
			muestraPistas(combSecreta, combJugador); //mostramos las pistas del juego
			System.out.println("Escriba una combinación: ");
			leeTabla(combJugador); //volvemos a pedir otra combinación	
		}
		System.out.println("¡La cámara está abierta!");
		sc.close();
	}	
		
	// Esta función iniciliza los valores de la tabla pasada como parámetro con valores aleatorios. La constante MAX determina el valor máximo que ssxe asigna a un elemento,
	// estando comprendido en el rango 1..MAX
	static void generaCombinacion(int t[]) {
			
		final int MAX = 5; //cada dígito de la combinación en el rango 1..MAX
		for(int i = 0; i < t.length; i++) {
			t[i]= (int) (Math.random()*MAX+1); //número aleatorio de 1 a MAX
			//t referencia a la tabla combSecreta del programa principal. Por ese motivo asignar un valor a t[i] es lo mismo que hacerlo a combSecreta[i]			
		}
	}
		
	// Recorre la tabla pasada como parámetro y asigna a cada elemento el valor leído
	static void leeTabla(int t[]) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < t.length; i++) { //Recorremos para leer
			t[i] = sc.nextInt();
		}
		sc.close();
	}
		
	//Recorre las dos tablas, secret y jug, e indica para cada elemento de la combinación introducida por el usuario si es mayor, menor o igual que el equivalente en la 
	//combinación secreta
	static void muestraPistas(int secret[], int jug[]) { //recorremos ambas tablas con el bucle
		for (int i = 0; i < jug.length; i++) {
			System.out.print(jug[i]);
			if (secret[i] > jug[i]) { //Comparamos el i-ésimo elemento de ambas tablas
				System.out.println(" mayor");
			}else if (secret[i] < jug [i]) {
				System.out.println(" menor");	
			}else {
				System.out.println(" igual");
			}
		}
		
	}
}

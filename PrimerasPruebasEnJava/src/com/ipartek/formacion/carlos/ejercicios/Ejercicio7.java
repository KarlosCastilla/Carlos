package com.ipartek.formacion.carlos.ejercicios;

import java.util.Scanner;

/*Programa que calcule el precio de venta de un producto conociendo el precio por unidad (sin IVA) del producto, el número de productos vendidos y el porcentaje 
de IVA aplicado. Los datos anteriores se leerán por teclado. 
*/
public class Ejercicio7 {

	public static void main(String[] args) {
		double precioUnidad, cantidad, iva, precioSinIva, totalIva;
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el precio sin IVA: ");
		precioUnidad = sc.nextDouble();
		System.out.println("Número de productos: ");
		cantidad = sc.nextDouble();
		System.out.println("Porcentaje de IVA a aplicar: ");
		iva = sc.nextDouble();
		precioSinIva = precioUnidad * cantidad;
		totalIva = precioSinIva * iva / 100;
		System.out.println(precioSinIva + totalIva);
		sc.close();

	}

}

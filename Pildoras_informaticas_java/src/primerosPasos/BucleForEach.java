package primerosPasos;

import javax.swing.JOptionPane;

public class BucleForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String paises[] = {"España", "México", "Colombia", "Peru", "Chile", "Argentina", "Ecuador", "Venezuela"};
		String paises[] = new String[8];
		for(int i=0;i<8;i++) {
			paises[i]= JOptionPane.showInputDialog("Introduce país " + (i+1));
		}	
		
		//En el bucle foreach le indico una variable del mismo tipo que el Array para que en cada iteración obtenga el valor que
		// haya en la posición del array
		for(String pais:paises) {
			System.out.println(pais);
		}	

	}

}
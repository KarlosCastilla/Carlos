package graficos;

import java.awt.GraphicsEnvironment;

import javax.swing.*;

public class PruebasEstilosLetra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String fuente=JOptionPane.showInputDialog("Introduce fuente");
		
		boolean estalafuente = false;
		
		String[] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		for(String nombreFuente : nombresDeFuentes) {
		System.out.println(nombreFuente);
				
		}
					
		for(String nombreFuente : nombresDeFuentes) {
			if(nombreFuente.equals(fuente)) {
				
				estalafuente = true;
			}
				
		}
		
		if(estalafuente) {
			System.out.println("Fuente instalada");	
		}else {
			System.out.println("No está instalada la fuente");
		}
	}

}

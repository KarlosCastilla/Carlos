package graficos;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.swing.*;
import javax.imageio.*;


public class PruebaImagenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoImagen miMarco = new MarcoImagen();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoImagen extends JFrame{
	
	public MarcoImagen() {
		
		setTitle("Marco Con Imagen");
		
		setBounds(200, 200, 400, 300);
		
		LaminaConImagen miLamina = new LaminaConImagen();
		
		add(miLamina);
		
	}	
	
	
}


class LaminaConImagen extends JPanel{
	
	public void paintComponent(Graphics g) {		
		
		super.paintComponent(g);
		
		//File miImagen = new File("src/graficos/coche.png");
		
		try {
			imagen = ImageIO.read(new File("src/graficos/coche.png"));
		} catch (IOException e) {
			System.out.println("La imagen no se encuentra");
		}
		
		g.drawImage(imagen, 5, 5, null);
	}
	
	private Image imagen;
	
}
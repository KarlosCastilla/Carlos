package graficos;

import java.awt.*;
import java.io.File;
import java.io.IOException;

import javax.swing.*;
import javax.imageio.*;


public class PruebaImagenes2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoImagen2 miMarco = new MarcoImagen2();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class MarcoImagen2 extends JFrame{
	
	public MarcoImagen2() {
		
		setTitle("Marco Con Imagen");
		
		setBounds(50, 50, 1800, 1300);
		
		//LaminaConImagen2 miLamina = new LaminaConImagen2();
		
		LaminaConImagen2 miLamina2 = new LaminaConImagen2();
		add(miLamina2);
		
	}	
	
	
}


class LaminaConImagen2 extends JPanel{
	
		
		public LaminaConImagen2() {
			//La clase File permite trabajar con archivos que se encuentren en nuestro ordenador
			//File miImagen = new File("src/graficos/coche.png");
			//El metodo read busca una imagen dentro de una carpeta
			try {//ImageIO permite rescatar o capturar imagenes que se encuentren fuera del programa, una carpeta o url
				imagen = ImageIO.read(new File("src/graficos/bola.png"));//Instanciamos un objeto invocando al constructor File en la variable imagen
			} catch (IOException e) {
				System.out.println("La imagen no se encuentra");
			}
			
		}
		//Este metodo tiene la particularidad de que es invocado automáticamente por el contenedor, en este caso miLamina2
		public void paintComponent(Graphics g) {	
			super.paintComponent(g);
		
			int anchuraImagen = imagen.getWidth(this);
			int alturaImagen = imagen.getHeight(this);

		
			g.drawImage(imagen, 5, 5, null);
		
			for(int i = 0; i < 1800; i++) {
			
				for(int j=0; j < 1300; j++) {
				
					if(i+j>0) {//Para que no repita la primera bola en la primera posicion
					
						g.copyArea(5, 5, anchuraImagen, alturaImagen, i*anchuraImagen, j*alturaImagen);
					}
				
				}
			}
		
		}
	
	private Image imagen;
	
}

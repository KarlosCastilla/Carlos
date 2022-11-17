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
	//Este metodo tiene la particularidad de que es invocado automáticamente por el contenedor, en este caso miLamina
	public void paintComponent(Graphics g) {//El objeto gráfico que pasamos por parámetro es lo que haya dibujado en la lamina en ese 
		//momento, si redimensionamos, minimizamos, etc volvemos a llamar a paintComponent pasándole por parámetro lo que tengamos dibujado
		super.paintComponent(g);
		//La clase File permite trabajar con archivos que se encuentren en nuestro ordenador
		//File miImagen = new File("src/graficos/coche.png");
		//El metodo read busca una imagen dentro de una carpeta
		try {//ImageIO permite rescatar o capturar imagenes que se encuentren fuera del programa, una carpeta o url
			imagen = ImageIO.read(new File("src/graficos/coche.png"));//Instanciamos un objeto invocando al constructor File en la variable imagen
		} catch (IOException e) {
			System.out.println("La imagen no se encuentra");
		}
		
		g.drawImage(imagen, 5, 5, null);
	}
	
	private Image imagen;
	
}
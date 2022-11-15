package graficos;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class TrabajandoColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConColor miMarco = new MarcoConColor();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
		

	}

}

class MarcoConColor extends JFrame{
	
	public MarcoConColor() {
		
		setTitle("Prueba con colores");
		
		setSize(400,400);
		
		LaminaConColor miLamina = new LaminaConColor();
		
		add(miLamina);
		
		miLamina.setBackground(Color.PINK);//Le damos color a la lamina
		//miLamina.setBackground(SystemColor.window);//Para establecer un color igual que el que usa nuestro sistema(Windows en mi caso)
	}
	
}

class LaminaConColor extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		Graphics2D g2 = (Graphics2D) g;
		// dibujo rectangulo
		
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		g2.setPaint(Color.BLUE);//Selecciono un color para el marco del rectangulo
		g2.draw(rectangulo);//Dibujo el borde del rectangulo con ese color
		//Cojo otro color 
		g2.setPaint(Color.RED);//Podemos rellenar con un color predefinido como una constante de la clase Color
		
		g2.fill(rectangulo);//Relleno el interior del rectangulo
		
		// dibujo elipse
		Ellipse2D elipse = new Ellipse2D.Double();
		
		elipse.setFrame(rectangulo);//Utilizamos nuestro objeto rectangulo para que la elipse se dibuje dentro de el
		
		//Puedo instanciar un color personalizado y luego utilizarlo en el metodo setPain cuando quiera utilizarlo
		//Color miColor = new Color(125,189,200);
		//g2.setPaint(miColor);
				
		g2.setPaint(new Color(109,172,59).brighter());//Podemos personalizar el color creando una nueva instancia de La Clase Color
		// el brighter o el darker le aplica brillo o oscuridad respectivamente
		g2.fill(elipse);//Este método dibuja el contorno
		
	}
}
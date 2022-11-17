package graficos;

import java.awt.*;
import javax.swing.*;

public class TrabajandoConFuentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConFuentes miMarco = new MarcoConFuentes();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);
		

	}

}

class MarcoConFuentes extends JFrame{
	
	public MarcoConFuentes() {
		
		setTitle("Prueba con Fuentes");
		
		setSize(400,400);
		
		LaminaConFuentes miLamina = new LaminaConFuentes();
		
		add(miLamina);
		
		miLamina.setForeground(Color.CYAN);//Con este metodo establezco el color de todo lo que haya en la lámina
		
		
	}
	
}

class LaminaConFuentes extends JPanel{
	//Este metodo tiene la particularidad de que es invocado automáticamente por el contenedor, en este caso miLamina
	public void paintComponent(Graphics g) {//El objeto gráfico que pasamos por parámetro es lo que haya dibujado en la lamina en 
		super.paintComponent(g);//ese momento, si redimensionamos, minimizamos, etc volvemos a llamar a paintComponent pasándole 
								//por parámetro lo que tengamos dibujado
		Graphics2D g2 = (Graphics2D) g;
		// dibujo rectangulo
		
		Font mifuente = new Font("Courier New", Font.BOLD, 26);
		g2.setFont(mifuente);
		//g2.setColor(Color.BLUE);//Comento el color pq le damos un color comun a toda la lamina en el constructor MarcoConFuentes()
		
		g2.drawString("Carlos", 100, 100);
		
		g2.setFont(new Font("Arial", Font.ITALIC,24));
		//g2.setColor(new Color(128,90,50).brighter());//Comento el color pq le damos un color comun a toda la lamina en el constructor MarcoConFuentes()
		
		g2.drawString("Curso de Java", 100, 200);
		
	}
}
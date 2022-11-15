package graficos;

import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConTexto miMarco = new MarcoConTexto();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Que acabe el programa al cerrar la ventana

	}

}


class MarcoConTexto extends JFrame{
	
	public MarcoConTexto() {
		
		setVisible(true);//Hacerlo visible
		
		setSize(600, 450);//Ancho 500 pixeles y alto 450 pixeles
		
		setLocation(400, 200);// Posición en pantalla
		
		setTitle("primer texto");//Titulo
		
		Lamina miLamina = new Lamina(); //Instanciamos una lamina
		
		add(miLamina);//Añadimos miLamina
	}
	
}

class Lamina extends JPanel{
	
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);//LLama al metodo paintComponent de la clase JComponent para que primero haga su trabajo
		
		g.drawString("Estamos aprendiendo Swing", 100, 100);// y ademas de eso me dibujas después un texto con unas coordenadas
		
		
	}
}
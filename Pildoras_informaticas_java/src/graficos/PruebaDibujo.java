package graficos;

import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConDibujos miMarco = new MarcoConDibujos();
		
		miMarco.setVisible(true);
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoConDibujos extends JFrame{
	
	public MarcoConDibujos() {//Constructor para crear un marco/Frame
		
		setTitle("prueba de Dibujo");//Le damos un título
		
		setSize(400,400);//Le damos un tamaño
		
		LaminaConFiguras miLamina = new LaminaConFiguras(); //Instanciamos una lámina para dibujar en el interior del marco
		
		add(miLamina);//añadimos la lámina al marco
	}
}

class LaminaConFiguras extends JPanel{
	
	public void paintComponent(Graphics g) {//metodo sobrecargado de la clase JPanel
		
		super.paintComponent(g);//Llama al método paintComponent(g) de la clase padre
		
		
		//METODOS DE LA CLASE Graphics
		//g.drawRect(50, 50, 200, 200);//Distancia de 50 pixeles con la esquina superior izquierda. Cuadrado de 200 pixeles
		
		//g.drawLine(100, 100, 300, 200);//Dibujar una línea
		
		//g.drawArc(50, 100, 100, 200, 120, 150);//Dibujar un arco, pide cordenadas, ancho y alto, angulo inicial y arco de ángulo
		
		//Clase Graphics2d
		Graphics2D g2 = (Graphics2D) g;//Convertimos nuestro objeto de la clase Graphics en uno de la clase Graphics2D
		
		//Como la clase Rectangle2D.Double hereda de Rectangle2D podemos instanciarlo de esta forma ya que la clase Rectangle2D es
		//una clase abstracta.
		Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);//Principio de sustitución Es un...
		
		//Le pasamos por parámetro un objeto de tipo Shape, como la clase Rectangle2D implementa la interfaz Shape le pasamos rectangulo
		g2.draw(rectangulo);
		
		Ellipse2D elipse = new Ellipse2D.Double();//Principio de sustitución Es un...
		
		elipse.setFrame(rectangulo);//Utilizamos nuestro objeto rectangulo para que la elipse se dibuje dentro de el
		g2.draw(elipse);//Este método dibuja el contorno
		
		//Instanciamos una linea directamente dentro del metodo draw que es otra forma de hacer:
		//Line2D linea = new Line2D.Double(100,100,300,250);
		//g2.draw(linea);
		g2.draw(new Line2D.Double(100,100,300,250));
		
		//Dibujar un circulo que englobe a todo lo demás
		double centroEnX = rectangulo.getCenterX();//Obtenemos el centro del eje X
		double centroEnY = rectangulo.getCenterY();//Obtenemos el centro del eje Y
		double radio = 125;//Obtenemos el radio
		
		Ellipse2D circulo = new Ellipse2D.Double();//Principio de sustitución Es un...
		
		// Método heredado de la clase RectangularShape del paquete java.awt.geom 
		//Ellipse2D.Double hereda de Ellipse2D que a su vez hereda de RectangularShape que contiene el método setFramefromCenter
		circulo.setFrameFromCenter(centroEnX, centroEnY, centroEnX+radio, centroEnY+radio);//
		g2.draw(circulo);//Este método dibuja el contorno
		
		
		
		
	}
}


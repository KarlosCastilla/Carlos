package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;

//1. Crear un mapa de entrada es decirle a nuestro programa cual va a ser el objeto u objetos donde tiene que incidir la combinación de teclas
//2. Crear combinación de teclas. Decirle al programa que la combinación de teclas sera CTRL + A, CTRL + B, CTRL + R
//3. Asignar combinaciones de teclas a un objeto. No se puede asignar una combinación de teclas a una acción. Se necesita crear un objeto para 
//   realizar ese paso intermedio. Ejemplo: fondo_amarillo
//4. Asignar ese objeto a la acción correspondiente. Es decir, este objeto que tiene la combinación de teclas ya asociada, lo asocias a la
//   acción accionAmarillo

//Resumen: Le decimos al programa que el objeto que tiene el foco es el botón, hacer que la combinación de teclas incida en los 3 botones y 
// luego ya que cada botón maneje el color de fondo que tenga que poner dependiendo de la acción asignada a cada tecla.

public class PruebaAcciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoAccion marco = new MarcoAccion();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setVisible(true);

	}

}

class MarcoAccion extends JFrame {
	
	public MarcoAccion() {
		
		setTitle("Prueba Acciones");
		
		setBounds(600,350,600,300);
		
		PanelAccion lamina = new PanelAccion();
		
		add(lamina);
		
	}
	
}

class PanelAccion extends JPanel{
	
	public PanelAccion() {
		
		AccionColor accionAmarillo = new AccionColor("Amarillo", new ImageIcon("src/graficos/bola_amarilla.png"), Color.yellow);
		AccionColor accionAzul = new AccionColor("Azul", new ImageIcon("src/graficos/bola_azul.png"), Color.blue);
		AccionColor accionRojo = new AccionColor("Rojo", new ImageIcon("src/graficos/bola_roja.png"), Color.red);
		
		add(new JButton(accionAmarillo));
		add(new JButton(accionAzul));
		add(new JButton(accionRojo));
		
		//Creamos un mapa de entrada
		InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		//Creamos una combinación de teclas. KeyStroke representa una Accion con una combinación de nuestro teclado
		KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl A");
		//Asignamos la combinación de teclas al objeto correspondiente.Creamos un vínculo entre la combinación de teclas y la acción
		mapaEntrada.put(teclaAmarillo, "fondo_amarillo");
		
		//mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo_amarillo");Los 2 pasos anteriores simplificados en 1. Es lo mismo
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_azul");
		//mapaEntrada.put(KeyStroke.getKeyStroke("ctrl T"), "fondo_azul");Podemos asignar mas combinaciones de teclas a una misma acción
		mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_rojo");
		
		//Asignar el objeto a la acción. Creamos la variable objeto perteneciente a ActionMap. GetActionMap asocia la combinacion de teclas 
		//con la acción en si misma
		ActionMap mapaAccion = getActionMap();
		//Con el metodo put para asignar ese objeto a la combinación de teclas
		mapaAccion.put("fondo_amarillo", accionAmarillo);
		mapaAccion.put("fondo_azul", accionAzul);
		mapaAccion.put("fondo_rojo", accionRojo);
				
	}

	private class AccionColor extends AbstractAction{
		
		public AccionColor(String nombre, Icon icono, Color color_boton) {
			
			putValue(Action.NAME, nombre);
			
			putValue(Action.SMALL_ICON, icono);
			
			putValue(Action.SHORT_DESCRIPTION, "Poner la lamina de color " + nombre);
			
			putValue("color_de_fondo", color_boton);
			
		}		

		@Override
		public void actionPerformed(ActionEvent e)  {
			
			Color c = (Color)getValue("color_de_fondo");
			
			setBackground(c);
			
			System.out.println("Nombre: " + getValue(Action.NAME) + " Descripción: " + getValue(Action.SHORT_DESCRIPTION));
						
		}		
		
	}
		
}



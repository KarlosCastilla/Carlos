package graficos;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class MarcoSlider {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame_Slider miMarco = new Frame_Slider();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Frame_Slider extends JFrame{
	
	public Frame_Slider() {
		
		setBounds(550,400,550,350);
		
		Lamina_Slider miLamina = new Lamina_Slider();
		
		add(miLamina);
		
		setVisible(true);
		
	}
	
}

class Lamina_Slider extends JPanel{
	
	public Lamina_Slider(){
		
		setLayout(new BorderLayout());
		
		rotulo = new JLabel("En un lugar de la Mancha de cuyo nombre...");
		
		add(rotulo, BorderLayout.CENTER);
		
		control = new JSlider(8,50,12);//Iniciamos el JSlider con un valor mínimo para la letra de 8, máximo de 50 e inicial 12
		
		control.setMajorTickSpacing(20);//Agregamos las marcas mayores de 25 en 25
		
		control.setMinorTickSpacing(5);//Agregamos las marcas menores de 5 en 5
		
		control.setPaintTicks(true);//Le decimos que imprima las marcas
		
		control.setPaintLabels(true);//Le decimos que imprima los rótulos
		
		control.setFont(new Font("Serif", Font.ITALIC,10));//Cambiamos el tipo de letra para los rótulos instanciando un objeto de tipo Font
		
		control.addChangeListener(new EventoSlider());//Ponemos el JSlider a la escucha, nos pide un parámetro de tipo ChangeListener con lo que
		// instanciamos un objeto de tipo EventoSlider que hereda de la interfaz ChangeListener
		
		JPanel laminaSlider = new JPanel();//Creamos una segunda lámina
		
		laminaSlider.add(control);//Agregamos el control a la segunda lámina
		
		add(laminaSlider, BorderLayout.NORTH);//Agregamos esta segunda lámina en la parte norte de la lámina principal
		
	}
	
	private class EventoSlider implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent e) {//Este método es el que se va a ejecutar cada vez que movamos el JSlider a la derecha o izquierda
			// TODO Auto-generated method stub
		
			//System.out.println("estas manipulando el deslizante: " + control.getValue());//Prueba para obtener el valor de control en cada punto
			
			rotulo.setFont(new Font("Serif", Font.PLAIN, control.getValue()));//Le cambiamos el tamaño de la fuente al rótulo en función del valor
			//del JSlider pasándole una nueva fuente y el valor de JSlider en el tercer parámetro
			
		}
		
	}
	
	private JLabel rotulo;
	
	private JSlider control;
	
	private static int contador;
	
}

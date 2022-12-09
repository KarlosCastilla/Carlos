package graficos;

import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class MarcoSliders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Frame_Sliders miMarco = new Frame_Sliders();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Frame_Sliders extends JFrame{
	
	public Frame_Sliders() {
		
		setBounds(550,400,500,350);
		
		Lamina_Sliders miLamina = new Lamina_Sliders();
		
		add(miLamina);
		
		setVisible(true);
		
	}
	
}

class Lamina_Sliders extends JPanel{
	
	Lamina_Sliders(){
		
		JSlider control = new JSlider(0, 100, 50);//Instanciamos un JSlider
		//JSlider control = new JSlider(SwingConstants.VERTICAL, 0, 100, 50); //Podemos decirle que la orientación sea vertical u horizontal
		//control.setOrientation(SwingConstants.VERTICAL);//Podemos decirle a posteriori que lo queremos horizontal con el método SwingConstants
		
		control.setMajorTickSpacing(25);//Le decimos que las marcas mayores del JSlider iran de 25 en 25
		control.setMinorTickSpacing(5);//Le decimos que las marcas menores del JSlider iran de 5 en 5
		
		control.setPaintTicks(true);//Le decimos que imprima las marcas
		
		control.setPaintLabels(true);//Le decimos que nos imprima los rótulos
		
		control.setFont(new Font("Serif", Font.ITALIC, 12));//Le decimos las caracteristicas de los rótulos instanciando un objeto tipo Font
		
		control.setSnapToTicks(true);//Para que no se quede en puntos intermedios, el puntero va automáticamente a la marca más cercana		
		
		add(control);
		
		
	}
	
}

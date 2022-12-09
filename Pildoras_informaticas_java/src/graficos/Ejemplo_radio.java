package graficos;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Ejemplo_radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Marco_radio miMarco = new Marco_radio();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

class Marco_radio extends JFrame{
	
	public Marco_radio() {
		
		
		setBounds(550,300,500,350);
		
		Lamina_radio miLamina = new Lamina_radio();
		
		add(miLamina);
		
		setVisible(true);
	}
	
}

class Lamina_radio extends JPanel{
	
	public Lamina_radio() {
		
		setLayout(new BorderLayout());//Le decimos a la lamina principal que tendrá una distribución de BorderLayout;
		
		texto = new JLabel("En un lugar de la Mancha de cuyo nombre...");
		
		add(texto, BorderLayout.CENTER);
		
		ButtonGroup miGrupo = new ButtonGroup();
		
		boton1 = new JRadioButton("Pequeño", false);//Creamos 3 radiobutton con un texto y un estado(activado o desactivado)
		boton2 = new JRadioButton("Mediano", true);
		boton3 = new JRadioButton("Grande", false);
		boton4 = new JRadioButton("Muy Grande", false);
		
		JPanel laminaRadio = new JPanel();//Creamos una segunda lámina
		
		miGrupo.add(boton1);//Agrupamos los 4 botones
		miGrupo.add(boton2);
		miGrupo.add(boton3);
		miGrupo.add(boton4);
		
		laminaRadio.add(boton1);//Agregamos a la lamina principal esta segunda lámina y lo haces en la zona SUR
		laminaRadio.add(boton2);
		laminaRadio.add(boton3);
		laminaRadio.add(boton4);
		
		add(laminaRadio, BorderLayout.SOUTH);//Añadimos la lámina en la zona sur
		
		Evento_radio miEvento = new Evento_radio();//Creamos una instancia de tipo Evento
		boton1.addActionListener(miEvento);//Ponemos los botones a la escucha
		boton2.addActionListener(miEvento);
		boton3.addActionListener(miEvento);
		boton4.addActionListener(miEvento);
		
	}
	
	private class Evento_radio implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			if(e.getSource()==boton1){//Este método getSource nos devuelve el objeto que desencadena el evento, lo comparamos con los botones
				// y en funcion del boton pulsado se le dara un tamaño al texto
				texto.setFont(new Font("Serif", Font.PLAIN, 10));
				
			}else if(e.getSource()==boton2){
				
				texto.setFont(new Font("Serif", Font.PLAIN, 12));
				
			}else if(e.getSource()==boton3){
				
				texto.setFont(new Font("Serif", Font.PLAIN, 18));
				
			}else if(e.getSource()==boton4){
				
				texto.setFont(new Font("Serif", Font.PLAIN, 24));
					
			}
		}	
	}
	
	private JLabel texto;
	
	private JRadioButton boton1, boton2, boton3, boton4;
		
}
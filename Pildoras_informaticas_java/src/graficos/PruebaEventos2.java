package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

//Misma funcionalidad que el ejercicio PruebaEventos pero con otra manera de plantearlo

public class PruebaEventos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoBotones2 miMarco = new MarcoBotones2();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class MarcoBotones2 extends JFrame{
	
	public MarcoBotones2() {
		
		setTitle("Botones y eventos");
		
		setBounds(700,300,500,300);
		
		LaminaBotones2 miLamina = new LaminaBotones2();
		
		add(miLamina);
	}
	
}
//La lámina tiene que implementar la interfaz ActionListener porque es la propia lámina la que va a recibir el evento
class LaminaBotones2 extends JPanel {
	//Creamos un botón dentro de la lámina
	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");
	
	public LaminaBotones2() {
		//En el constructor agregamos el botón
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		
		ColorFondo Azul = new ColorFondo(Color.blue);
		ColorFondo Amarillo = new ColorFondo(Color.yellow);
		ColorFondo Rojo = new ColorFondo(Color.red);
		//Le decimos a ese botón que va a desencadenar un evento de tipo click
		botonAzul.addActionListener(Azul);
		botonAmarillo.addActionListener(Amarillo);
		botonRojo.addActionListener(Rojo);//Y el objeto que tiene que estar a la escucha es "this", es decir, la propia clase donde nos encontramos(La lámina)
	}//addActionListener es lo mismo que decirle "Al hacer click"
	//Estamos obligados a construir el metodo actionPerformed al implementar la interfaz ActionListener
	
	private class ColorFondo implements ActionListener{
		
		public ColorFondo(Color c) {
			
			colorDeFondo=c;
			
		}
			
		public void actionPerformed(ActionEvent e) {
			
			setBackground(colorDeFondo);
		}
		
		private Color colorDeFondo;
		
	}

}


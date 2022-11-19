package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class PruebaEventos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoBotones miMarco = new MarcoBotones();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}


class MarcoBotones extends JFrame{
	
	public MarcoBotones() {
		
		setTitle("Botones y eventos");
		
		setBounds(700,300,500,300);
		
		LaminaBotones miLamina = new LaminaBotones();
		
		add(miLamina);
	}
	
}
//La lámina tiene que implementar la interfaz ActionListener porque es la propia lámina la que va a recibir el evento
class LaminaBotones extends JPanel implements ActionListener {
	//Creamos un botón dentro de la lámina
	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");
	
	public LaminaBotones() {
		//En el constructor agregamos el botón
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		//Le decimos a ese botón que va a desencadenar un evento de tipo click
		botonAzul.addActionListener(this);
		botonAmarillo.addActionListener(this);
		botonRojo.addActionListener(this);//Y el objeto que tiene que estar a la escucha es "this", es decir, la propia clase donde nos encontramos(La lámina)
	}//addActionListener es lo mismo que decirle "Al hacer click"
	//Estamos obligados a construir el metodo actionPerformed al implementar la interfaz ActionListener
	public void actionPerformed(ActionEvent e) {//Cuando tenga lugar el evento de hacer click en un botón, se creará un objeto de tipo Event,
	//concretamente de tipo ActionEvent y ese objeto viaja a ActionPerformed y se almacena en la e.
		Object botonPulsado = e.getSource();//Utilizando el método getSource perteneciente a ActionEvent podemos saber quien es el desencadenante de la acción
		
		if(botonPulsado==botonAzul){
			setBackground(Color.blue);
		}
		else if(botonPulsado==botonAmarillo) {
			setBackground(Color.yellow);
		}
		else {
			setBackground(Color.red);
		}
		
	}
	
}
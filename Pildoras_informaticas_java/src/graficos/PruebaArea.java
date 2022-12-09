package graficos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PruebaArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoPruebaArea miMarco = new MarcoPruebaArea();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);

	}

}


class MarcoPruebaArea extends JFrame{
	
	public MarcoPruebaArea() {
		
		setTitle("Probando Area de texto");
		
		setBounds(500,300,500,350);
		
		setLayout(new BorderLayout());
		
		laminaBotones = new JPanel();
		
		botonInsertar = new JButton("Insertar");
		
		botonInsertar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				areaTexto.append("En un lugar de la Mancha de cuyo nombre no quiero acordarme...");
				
			}		
		});
		
		laminaBotones.add(botonInsertar);//Agregamos el botón a la lámina
		
		botonSaltoLinea = new JButton("Salto línea");
		
		botonSaltoLinea.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//Hay que detectar si nuestro area de texto tiene saltos de línea o no. En el caso de que los tenga al pulsar el botón los quita
				//y en el caso de que no los tenga los pone
				//Almacenamos dentro de la variable saltar lo contrario de lo que haya en el area de texto
				boolean saltar = !areaTexto.getLineWrap();//Este método detecta si hay saltos de línea.
				//Si no detecta saltos de línea, saltar es true(con ! es lo contrario) por lo que a continuacion se añade un salto de línea
				areaTexto.setLineWrap(saltar);//Si saltar llega con un false lo que hace setLineWrap es quitar un salto de línea
				
				/*if(saltar) {
					
					botonSaltoLinea.setText("Quitar salto");
					
				}else {
					
					botonSaltoLinea.setText("Salto línea");
					
				}*/
				
				botonSaltoLinea.setText(saltar ? "Quitar salto" : "Salto línea");//Utilizamos un operador ternario pero el if tb es válido
				
			}
		});
		
		laminaBotones.add(botonSaltoLinea);
		
		add(laminaBotones, BorderLayout.SOUTH);//Añadimos la lamina a la parte sur de nuestro marco
		
		areaTexto = new JTextArea(8,20);//Iniciamos el area de texto de 8 filas y 20 columnas
		
		laminaConBarras = new JScrollPane(areaTexto);//Para tener barras de desplazamiento agregamos area de texto a la lámina tipo JScrollPane
		
		add(laminaConBarras, BorderLayout.CENTER);//Añadimos la lámina con barras a la parte central
		
	}
	
	private JPanel laminaBotones;
	
	private JButton botonInsertar, botonSaltoLinea;
	
	private JTextArea areaTexto;
	
	private JScrollPane laminaConBarras;
	
	
}
package graficos;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCalculadora mimarco = new MarcoCalculadora();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class MarcoCalculadora extends JFrame{
	
	public MarcoCalculadora() {
		
		setTitle("Calculadora");
		
		setBounds(500, 300, 450, 300);//Eje X, eje Y, dimensión ancho, dimensión alto
		
		LaminaCalculadora miLamina = new LaminaCalculadora();
		
		add(miLamina);
		//pack();// Se adapta al tamaño por defecto de lo que hay en su interior
		
	}
	
}

class LaminaCalculadora extends JPanel{
	
	public LaminaCalculadora() {
		
		principio = true;//Iniciamos la variable principio a true para que la primera vez que ejecute el programa no tenga en cuenta el 0 inicial
		
		setLayout(new BorderLayout());
		
		pantalla = new JButton("0");
		
		pantalla.setEnabled(false);//Desactivamos el botón del display para que no pueda clicarlo el usuario
		
		add(pantalla, BorderLayout.NORTH);//La lámina con el boton display tiene un BorderLayout alineado arriba
		
		miLamina2=new JPanel();//Creamos una segunda lámina para agregar los botones de la calculadora
		miLamina2.setLayout(new GridLayout(4,4));//Le damos un GridLayout de 4 filas y 4 columnas
		
		ActionListener insertar = new InsertaNumero();
		
		ActionListener orden = new AccionOrden();
		
		ponerBoton("7", insertar);//Creamos todos los botones con un método creado para ello
		ponerBoton("8", insertar);
		ponerBoton("9", insertar);
		ponerBoton("/", orden);
		ponerBoton("4", insertar);
		ponerBoton("5", insertar);
		ponerBoton("6", insertar);
		ponerBoton("*", orden);
		ponerBoton("1", insertar);
		ponerBoton("2", insertar);
		ponerBoton("3", insertar);
		ponerBoton("+", orden);
		ponerBoton("0",insertar);
		ponerBoton(".", insertar);
		ponerBoton("=", orden);
		ponerBoton("-", orden);
		
		add(miLamina2, BorderLayout.CENTER);//Añadimos la segunda lámina a la lámina principal en la zona central
		
		ultimaOperacion = "=";
			
	}
	//En el segundo argumento le pasamo un parametro de tipo evento
	private void ponerBoton(String rotulo, ActionListener oyente) {
		
		JButton boton = new JButton(rotulo);//Creamos el botón
		
		boton.addActionListener(oyente);//Ponemos el boton a la escucha, cuando el usuario haga click encima del botón, se construye un objeto 
		//de tipo evento(ActionListener) y ese objeto se almacena dentro de la variable objeto(oyente)
		miLamina2.add(boton);
		
	}
	
	private class InsertaNumero implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {//Este metodo recibe un objeto de tipo evento que se almacena en la variable e
			// TODO Auto-generated method stub
			
			//Almacenamos dentro de la variable de tipo String el texto del botón que ha desencadenado el evento
			String entrada = e.getActionCommand();
			
			if(principio) {
				
				pantalla.setText("");
				
				principio = false;
			}
			
			pantalla.setText(pantalla.getText() + entrada);//Establecemos ese texto en pantalla concatenado con lo que ya haya en la pantalla
			
		}
					
	}
	
	private class AccionOrden implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			String operacion = e.getActionCommand();//Almacenamos un String en la variable operacion que corresponde al texto del botón
			
			calcular(Double.parseDouble(pantalla.getText()));//Parseamos a Double el valor del número en el display y lo pasamos como parámetro
			
			ultimaOperacion = operacion;
						
			principio = true;
			
		}
		
		public void calcular(double x) {
			
			if(ultimaOperacion.equals("+")) {
				
				resultado += x;
				
			}
			else if(ultimaOperacion.equals("-")) {
				
				resultado -= x;
				
			}
			else if(ultimaOperacion.equals("*")) {
				
				resultado *= x;
				
			}
			else if(ultimaOperacion.equals("/")) {
				
				resultado /= x;
				
			}
			else if(ultimaOperacion.equals("=")) {
				
				resultado = x;
				
			}
			
			pantalla.setText("" + resultado);//Concatenamos resultado con una cadena vacia para convertirlo en String ya que es un Double
		}
		
		
		
	}
	
			
	private JPanel miLamina2;
	
	private JButton pantalla;
	
	private boolean principio;
	
	private double resultado;
	
	private String ultimaOperacion;
	
}





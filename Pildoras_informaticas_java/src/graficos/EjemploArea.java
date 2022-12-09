package graficos;

import javax.swing.*;

import java.awt.event.*;

public class EjemploArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MarcoArea miMarco = new MarcoArea();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoArea extends JFrame{
	
	public MarcoArea() {
				
		setBounds(500,300,500,350);
		
		LaminaArea miLamina = new LaminaArea();
		
		add(miLamina);
		
		setVisible(true);		
		
	}
	
}

class LaminaArea extends JPanel{
	
	public LaminaArea() {
		
		miArea = new JTextArea(8,20);//Creamos un textArea con un tamaño en filas y columnas determinado
		
	    JScrollPane laminaBarras = new JScrollPane(miArea);//Hacemos que nuestro Area tenga scroll cuando llegamos a la parte de abajo, también
	    //tiene desplazamiento horizontal pero como le hemos dicho que salte de línea no lo hace
		
		miArea.setLineWrap(true);//Método para que cuando escribimos hasta el borde derecho del Area, el cursor salte a la siguiente línea
		
		add(laminaBarras);
		
		JButton miBoton = new JButton("Dale");//Creamos un botón con el texto "Dale"
		
		miBoton.addActionListener(new GestionaArea());//Ponemos el boton a la escucha del evento click
		
		add(miBoton);//Agregamos el botón para que cuando pulsemos en el, el texto que pudiera haber en el botón aparezca por consola
	}
	
	private class GestionaArea implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println(miArea.getText());//Cuando se produzca el evento(Clicar el botón) escribirá por pantalla el texto del Area de texto
			
		}
			
	}
	
	private JTextArea miArea;
	
}



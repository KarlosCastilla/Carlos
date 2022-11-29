package graficos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Varios_oyentes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_Principal mimarco = new Marco_Principal();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mimarco.setVisible(true);

	}

}

class Marco_Principal extends JFrame{
	
	public Marco_Principal() {
		
		setTitle("Prueba Varios");
		
		setBounds(1300,100,300,200);
		
		Lamina_Principal lamina = new Lamina_Principal();
		
		add(lamina);
	}
	
}

class Lamina_Principal extends JPanel{
	
	public Lamina_Principal() {
		
		JButton boton_nuevo = new JButton("Nuevo");
		
		add(boton_nuevo);
		
		boton_cerrar = new JButton("Cerrar todo");
		
		add(boton_cerrar);
		
		OyenteNuevo miOyente = new OyenteNuevo();
		
		boton_nuevo.addActionListener(miOyente);
	}
	
	private class OyenteNuevo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			Marco_Emergente  marco = new Marco_Emergente(boton_cerrar);
			
			marco.setVisible(true);
			
		}		
		
	}
	
	JButton boton_cerrar;//Instancio la variable de tipo JButton fuera del constructor pq voy a tener que utilizarla en otros métodos, en ActionPerformed
	
}

class Marco_Emergente extends JFrame{
	//Cada vez que pulsamos el botón de nuevo creamos una ventana y esa ventana automaticamente recibe también el botón de cerrar, pero
	//no lo agrega porque en ningún caso la clase Marco_Emergente tiene el método add
	public Marco_Emergente(JButton boton_de_principal) {//En el constructor le pasamos por parámetro el boton de cerrar
		
		contador++;
		
		setTitle("Ventana " + contador);
		
		setBounds(40*contador, 40*contador, 300, 150);
		
		CierraTodos oyenteCerrar = new CierraTodos();
		
		boton_de_principal.addActionListener(oyenteCerrar);//Le pasamos la instancia de la clase oyente, que es CierraTodos para que cuando pulsemos
		//el botón de cerrar se cierren todas las ventanas emergentes
		
	}
	private class CierraTodos implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			dispose();//Libera todos los recursos de las ventanas y sus componentes marcándolo como invisible o no mostrable(cerrarlo)
			
		}
		
		
	}
	private static int contador = 0;
	
}




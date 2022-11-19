package graficos;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

//Mismo ejercicio que EventosVentana pero la clase M_Ventana2 hereda la clase adaptadora WindowAdapter para no sobrecargar muchos metodos que no usamos.

public class EventosVentana2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoVentana2 miMarco = new MarcoVentana2();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Salir del programa al cerrar
		
		MarcoVentana2 miMarco2 = new MarcoVentana2();
		miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Pasa a la siguiente ventana 1 al cerrar la ventana 2
		
		miMarco.setTitle("Ventana 1");
		miMarco2.setTitle("Ventana 2");
		
		miMarco.setBounds(300, 300, 500, 350);
		miMarco2.setBounds(900, 300, 500, 350);
		
	}

}

class MarcoVentana2 extends JFrame{
	
	public MarcoVentana2() {
		
		//setTitle("Respondiendo");
		//setBounds(700,300,500,300);
		setVisible(true);
		
		//M_Ventana2 oyenteVentana = new M_Ventana2();
		//addWindowListener(oyenteVentana);
		addWindowListener(new M_Ventana2());//Podemos instanciar un objeto de tipo M_Ventana2 directamente pasando como parámetro una nueva instancia
	}	//con el constructor de M_Ventana2 		
}

class M_Ventana2 extends WindowAdapter{

	@Override
	public void windowIconified(WindowEvent e) {
		
		System.out.println("Ventana minimizada");
	}

	
	
	
	
}
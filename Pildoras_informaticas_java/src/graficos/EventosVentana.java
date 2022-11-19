package graficos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class EventosVentana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoVentana miMarco = new MarcoVentana();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Salir del programa al cerrar
		
		MarcoVentana miMarco2 = new MarcoVentana();
		miMarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);//Pasa a la siguiente ventana 1 al cerrar la ventana 2
		
		miMarco.setTitle("Ventana 1");
		miMarco2.setTitle("Ventana 2");
		
		miMarco.setBounds(300, 300, 500, 350);
		miMarco2.setBounds(900, 300, 500, 350);
		
	}

}

class MarcoVentana extends JFrame{
	
	public MarcoVentana() {
		
		//setTitle("Respondiendo");
		//setBounds(700,300,500,300);
		setVisible(true);
		
		M_Ventana oyenteVentana = new M_Ventana();
		addWindowListener(oyenteVentana);
				
	}
}

class M_Ventana implements WindowListener{

	@Override
	public void windowOpened(WindowEvent e) {
		
		System.out.println("Ventana abierta");
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		
		System.out.println("Cerrando ventana");
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		
		System.out.println("La ventana ha sido cerrada");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		
		System.out.println("Ventana minimizada");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		
		System.out.println("Ventana restaurada");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		
		System.out.println("Ventana activada");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		
		System.out.println("Ventana desactivada");
		
	}
	
	
	
}



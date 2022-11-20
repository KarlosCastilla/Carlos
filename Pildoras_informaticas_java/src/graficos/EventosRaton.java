package graficos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class EventosRaton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoRaton miMarco = new MarcoRaton();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


class MarcoRaton extends JFrame{
	
	public MarcoRaton() {
		setVisible(true);
		setBounds(700, 300, 600, 450);
		EventoDeRaton eventoRaton = new EventoDeRaton();
		addMouseListener(eventoRaton);		
	}		
}

class EventoDeRaton extends MouseAdapter{//Clase adaptadora para no estar obligados a implementar todos los metodos de la interface MouseListener
	
	public void mouseClicked(MouseEvent e) {
		
		System.out.println("Has hecho click");		
	}	
}


//class EventoDeRaton implements MouseListener{

	//@Override
	//public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		//System.out.println("Has hecho click");
		
	//}

	//@Override
	//public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Acabas de presionar");
		
	//}

	//@Override
	//public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
		//System.out.println("Acabas de soltar");
		
	//}

	//@Override
	//public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
		//System.out.println("Acabas de entrar");
		
	//}

	//@Override
	//public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("Acabas de salir");
		
	//}
	
//}





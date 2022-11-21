package graficos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class EventosRaton2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoRaton2 miMarco = new MarcoRaton2();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoRaton2 extends JFrame{
	
	public MarcoRaton2() {
		setVisible(true);
		setBounds(700, 300, 600, 450);
		EventosDeRaton eventoRaton = new EventosDeRaton();
		//addMouseListener(eventoRaton);		
		addMouseMotionListener(eventoRaton);	
	}		
}

class EventosDeRaton implements MouseMotionListener{
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Estás arrastrando el ratón");
		
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Estás moviendo el ratón");
		
	}
	
}

//class EventosDeRaton extends MouseAdapter{//Clase adaptadora para no estar obligados a implementar todos los metodos de la interface MouseListener
	
	/*public void mouseClicked(MouseEvent e) {
		
		System.out.println("Coordenada X: " + e.getX() + " Coordenada Y: " + e.getY());
		int numClick = e.getClickCount();
		System.out.println(numClick);
	}*/
	
	/*public void mousePressed(MouseEvent e) {
		
		if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK) {//Controlamos si ha pulsado el boton izquierdo
			System.out.println("Has pulsado el botón izquierdo");
			
		}else if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK) {//Controlamos si ha pulsado la rueda del ratón			
			System.out.println("Has pulsado la rueda del ratón");
			
		}else if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK) {//Controlamos si ha pulsado el boton derecho
			System.out.println("Has pulsado el botón derecho");
		}
			
	}*/
//}



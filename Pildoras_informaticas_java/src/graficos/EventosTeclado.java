package graficos;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class EventosTeclado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConTeclas miMarco = new MarcoConTeclas();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

class MarcoConTeclas extends JFrame{
	
	public MarcoConTeclas() {
		
		setVisible(true);
		setBounds(700, 300, 600, 450);
		
		EventoDeTeclado tecla = new EventoDeTeclado();
		addKeyListener(tecla);
		
	}
	
}


class EventoDeTeclado implements KeyListener{

	@Override
	public void keyPressed(KeyEvent e) {//Metodo llamado al presionar una tecla
		// TODO Auto-generated method stub
		//int codigo1 = e.getKeyCode();
		//System.out.println(codigo1);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {//Metodo llamado cada vez que se presiona una tecla, y la tecla ha vuelto a su estado original 
		// TODO Auto-generated method stub
		char letra = e.getKeyChar();
		
		System.out.println(letra);
		
	}

	@Override
	public void keyReleased(KeyEvent e) {//Metodo llamado cuando se libera una tecla
		// TODO Auto-generated method stub
		
	}
	
	
	
}
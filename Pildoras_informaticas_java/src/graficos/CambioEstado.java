package graficos;

import javax.swing.*;

import java.awt.Frame;
import java.awt.event.*;

public class CambioEstado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoEstado miMarco = new MarcoEstado();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoEstado extends JFrame{
	
	public MarcoEstado() {
				
		setVisible(true);
		setBounds(300,300,500,350);
		CambiaEstado nuevo_estado = new CambiaEstado();//Instanciamos la clase CambiaEstado para obtener el estado de la ventana 
		addWindowStateListener(nuevo_estado);//La dejamos a la espera de obtener estado
	}		
}

class CambiaEstado implements WindowStateListener{

	@Override
	public void windowStateChanged(WindowEvent e) {
	
		//System.out.println("La ventana ha cambiado de estado");	
		//System.out.println(e.getNewState());
		
		if(e.getNewState()== Frame.MAXIMIZED_BOTH) {//Si el nuevo estado es igual a pantalla completa
			System.out.println("La ventana está a pantalla completa");
			
		}else if(e.getNewState()==Frame.NORMAL) {//Si el nuevo estado es igual a normal
			System.out.println("La ventana está normal");
			
		}else if(e.getNewState()==Frame.ICONIFIED){//Si el nuevo estado es igual a pantalla minimizada
			System.out.println("La ventana está minimizada");
			
		}
	}
	//Siempre hay Evento, Fuente y Oyente. Según que tipo de Eventos se implementa una Interfaz u otra. El que implementa la Interfaz es siempre el
	//Oyente. El Evento, es el método al que se invoca. Y la Fuente, es el Objeto que tenga el método add…Listener. 
	
	
	
}
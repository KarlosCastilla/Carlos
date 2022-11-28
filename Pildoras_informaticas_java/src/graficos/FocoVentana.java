package graficos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

public class FocoVentana extends JFrame implements WindowFocusListener{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FocoVentana miv = new FocoVentana();
		miv.iniciar();
		
		

	}
	
	public void iniciar() {
	
		marco1 = new FocoVentana();
		marco2 = new FocoVentana();
		
		marco1.setVisible(true);
		marco2.setVisible(true);
		
		marco1.setBounds(300, 100, 600, 350);
		marco2.setBounds(1200, 100, 600, 350);
		
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco1.addWindowFocusListener(this);//Ponemos los marcos a la escucha del evento correspondiente
		marco2.addWindowFocusListener(this);//Tenemos que pasarle por parametro la instancia de la clase oyente. Pero como lo estamos haciendo todo
		//dentro de la misma clase, la clase oyente es la propia clase, podemos utilizar el operador this para hacer referencia al propio objeto,
		// o la propia clase donde nos encontremos

	}

	@Override
	public void windowGainedFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==marco1) {
			marco1.setTitle("Tengo el foco!!");
			
		}else {
			
			marco2.setTitle("Tengo el foco!!");
		}
	}

	@Override
	public void windowLostFocus(WindowEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==marco1) {//Con el metodo getSource() podemos detectar quien es el origen del evento ocurrido
			marco1.setTitle("");
			
		}else {
			
			marco2.setTitle("");
		}
		
	}
	
	FocoVentana marco1;
	FocoVentana marco2;

}

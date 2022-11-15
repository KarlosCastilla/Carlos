package graficos;


import java.awt.Frame;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MiMarco marco1 = new MiMarco();
		
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MiMarco extends JFrame{
	
	public MiMarco() {
		
		setTitle("Ventana de prueba");
		//setSize(500,300);
		//setLocation(1400,500);
		
		setBounds(1400,500,500,300);
		//setResizable(false);
		//setExtendedState(Frame.MAXIMIZED_BOTH);
		
	}
	
}
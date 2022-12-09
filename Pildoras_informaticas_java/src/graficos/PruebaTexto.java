package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PruebaTexto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoTexto miMarco = new MarcoTexto();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//miMarco.setVisible(true);
		
	}

}


class MarcoTexto extends JFrame{
	
	public MarcoTexto() {
		
		setBounds(600,300,600,350);
		
		LaminaTexto miLamina = new LaminaTexto();
		
		add(miLamina);
		
		setVisible(true);
		
	}
	
}

class LaminaTexto extends JPanel{
	
	public LaminaTexto() {
		
		setLayout(new BorderLayout());//Indicamos que la lámina va a tener una disposición de BorderLayout(Norte, sur, este , oeste, centro...)
		
		JPanel miLamina2 = new JPanel();
		
		miLamina2.setLayout(new FlowLayout());//La lámina 2 tendrá una disposión de FlowLayout
		
		resultado = new JLabel("", JLabel.CENTER);//Alineo el texto del resultado en el centro de la 
		
		JLabel texto1 = new JLabel("Email: ");
		
		miLamina2.add(texto1);
		
		campo1 = new JTextField(20);
		
		miLamina2.add(campo1);
		
		add(resultado, BorderLayout.CENTER);
		
		JButton miBoton = new JButton("Comprobar");
		
		DameTexto miEvento = new DameTexto();
		
		miBoton.addActionListener(miEvento);//Ponemos el botón a la escucha del evento (click)
		
		miLamina2.add(miBoton);
		
		add(miLamina2, BorderLayout.NORTH);
		
		
	}
	
	private class DameTexto implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			int correcto = 0;
			
			String email = campo1.getText().trim();
			
			for(int i=0; i < email.length(); i++) {
				
				if(email.charAt(i)=='@') {
					
					correcto++;
					
				}		
			}
			
			if(correcto != 1) {
				
				resultado.setText("Incorrecto");
				
			}else {
				
				resultado.setText("Correcto");			}
			
			
		}
		
	}
	
	private JTextField campo1;
	
	private JLabel resultado;
	
}


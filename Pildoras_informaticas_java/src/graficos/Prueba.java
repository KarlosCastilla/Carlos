package graficos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoPrueba miMarco = new MarcoPrueba();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoPrueba extends JFrame{
	
	public MarcoPrueba() {
		
		
		setBounds(500,300,500,350);
		
		LaminaPrueba miLamina = new LaminaPrueba();
		
		add(miLamina);
		setVisible(true);
	}
	
}

class LaminaPrueba extends JPanel{
	
	public LaminaPrueba() {
		
		JTextField miCampo = new JTextField(20);
		
		EscuchaTexto el_evento = new EscuchaTexto();
		
		Document miDoc = miCampo.getDocument();//Almacenamos dentro de miDoc el objeto de tipo Document
		//Aquí ponemos ese documento a la escucha,
		miDoc.addDocumentListener(el_evento);//Para ello le pasamos una instancia de la clase que maneja esos eventos
		
		add(miCampo);
		
	}
	
	
	private class EscuchaTexto implements DocumentListener{

		@Override
		public void insertUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println("Has insertado texto");
			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
			System.out.println("Has borrado texto");
			
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}
		
				
	}
	
}
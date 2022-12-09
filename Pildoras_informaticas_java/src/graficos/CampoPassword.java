package graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class CampoPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoPassword miMarco = new MarcoPassword();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoPassword extends JFrame{
	
	public MarcoPassword() {
		
		setBounds(400, 300, 550, 400);
		
		LaminaPassword miLamina = new LaminaPassword();
		
		add(miLamina);
		
		setVisible(true);
		
	}
	
}

class LaminaPassword extends JPanel{
	
	public LaminaPassword() {
		
		setLayout(new BorderLayout());
		
		JPanel lamina_superior = new JPanel();
		
		lamina_superior.setLayout(new GridLayout(2,2));
		
		add(lamina_superior, BorderLayout.NORTH);//Agregamos la lámina y le decimos que esté en la zona norte
		
		JLabel etiqueta1 = new JLabel("Usuario");
		JLabel etiqueta2 = new JLabel("Contraseña");
		
		c_usuario = new JTextField(15);//Creamos un JTextField de tamaño 15 columnas
		
		Comprueba_pass miEvento = new Comprueba_pass();
		
		c_contra = new JPasswordField(15);//Creamos un JPasswordField que es muy parecido a JTextField pero oculta el texto
		
		c_contra.getDocument().addDocumentListener(miEvento);//Ponemos a c_contra a la escucha del evento de tipo Document
		
		lamina_superior.add(etiqueta1);
		lamina_superior.add(c_usuario);
		
		lamina_superior.add(etiqueta2);
		lamina_superior.add(c_contra);
		
		JButton enviar = new JButton("Enviar");
		
		add(enviar, BorderLayout.SOUTH);
		
	}
	
	private class Comprueba_pass implements DocumentListener{

		String usu = c_usuario.getText().trim();
		
		@Override
		public void insertUpdate(DocumentEvent e) {//Controlamos lo que ocurre al escribir en el JPasswordField
			// TODO Auto-generated method stub
			
			char [] contrasena;//Creamos un array de tipo char para almacenar en el lo que contiene el campo contraseña (c_contra)
			
			contrasena = c_contra.getPassword();//El método getPassWord devuelve un array de char con el contenido del password, lo almaceno en contrasena
			
			if(contrasena.length < 8 || contrasena.length > 12) {//Evaluo si la longitud del array es menor que 8 o mayor que 12
				
				c_contra.setBackground(Color.RED);//Si se cumple marcamos el JPasswordField en rojo
				
			}else {
				
				c_contra.setBackground(Color.WHITE);//Y si no se cumple lo dejamos en color blanco
				
			}
			
		}

		@Override
		public void removeUpdate(DocumentEvent e) {//Controlamos lo que ocurre al borrar en el JPasswordField
			// TODO Auto-generated method stub
			
			char [] contrasena;//Creamos un array de tipo char para almacenar en el lo que contiene el campo contraseña (c_contra)
			
			contrasena = c_contra.getPassword();//El método getPassWord devuelve un array de char con el contenido del password, lo almaceno en contrasena
			
			if(contrasena.length < 8 || contrasena.length > 12) {//Evaluo si la longitud del array es menor que 8 o mayor que 12
				
				c_contra.setBackground(Color.RED);//Si se cumple marcamos el JPasswordField en rojo
				
			}else {
				
				c_contra.setBackground(Color.WHITE);//Y si no se cumple lo dejamos en color blanco
			
			}
		}

		@Override
		public void changedUpdate(DocumentEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	private JTextField c_usuario;
	private JPasswordField c_contra;
	
}

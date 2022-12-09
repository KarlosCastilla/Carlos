package graficos;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class PruebaCombo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCombo miMarco = new MarcoCombo();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoCombo extends JFrame{
	
	public MarcoCombo(){
				
		setBounds(550,300,550,400);
		
		LaminaCombo miLamina = new LaminaCombo();//Inicializamos la lámina principal
		
		setVisible(true);
		
		add(miLamina);
		
	}
	
}

class LaminaCombo extends JPanel{
	
	public LaminaCombo(){
		
		setLayout(new BorderLayout());//Dentro del constructor de la lamina establecemos su Layout
		
		texto= new JLabel("En un lugar de la Mancha de cuyo nombre...");// Iniciamos el texto con un valor
		
		texto.setFont(new Font("Serif", Font.PLAIN, 18));//Establecemos las características del texto
		
		add(texto, BorderLayout.CENTER);//Añadimos el texto en el centro del layout de la lámina
		
		JPanel lamina_norte = new JPanel();//Inicializamos la lámina donde después añadiremos el combobox

		miCombo = new JComboBox();//Inicializamos el combobox
		
		miCombo.setEditable(true);//Permite poder editar dentro del combobox
		
		miCombo.addItem("Candara");//Añadimos 4 elementos al combobox
		
		miCombo.addItem("Showcard Gothic");
		
		miCombo.addItem("Monospaced");
		
		miCombo.addItem("Forte");
		
		EventoCombo miEvento = new EventoCombo();//Instanciamos un objeto de tipo evento
		
		miCombo.addActionListener(miEvento);//Ponemos el combo a la escucha
		
		lamina_norte.add(miCombo);//Añadimos el combo a la lamina
		
		add(lamina_norte, BorderLayout.NORTH);//Agregamos la lamina_norte a la lámina principal situándola en la zona norte del BorderLayout
		
	}
	
	private class EventoCombo implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//Queremos que dependiendo del elemento que seleccionemos nos ponga el texto de una forma u otra. 
			texto.setFont(new Font((String)miCombo.getSelectedItem(), Font.PLAIN, 18));//Para especificar el tipo de letra usamos el método 
			//getSelectedItem que nos devuelve un tipo Object con lo que debemos hacerle casting a String para el parámetro del tipo de fuente 
		}		
		
	}
	
	private JLabel texto;
	private JComboBox miCombo;	
}
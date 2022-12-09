package graficos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PruebaChecks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoCheck miMarco = new MarcoCheck();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoCheck extends JFrame{
	
	public MarcoCheck() {
		
		setBounds(550,300,550,350);
		
		
		LaminaCheck miLamina = new LaminaCheck();
		
		add(miLamina);
		
		setVisible(true);
	}
	
}

class LaminaCheck extends JPanel{
	
	public LaminaCheck() {
		
		setLayout(new BorderLayout());//Le decimos a la lamina principal que tendrá una distribución de BorderLayout;
		
		Font miLetra = new Font("Serif", Font.PLAIN, 24);
		
		texto = new JLabel("En un lugar de la Mancha de cuyo nombre....");
		
		texto.setFont(miLetra);//Le indicamos a texto el tipo de letra pasandole por parámetro un objeto de tipo Font
		
		JPanel laminaTexto = new JPanel();//Creamos una segunda lamina que tendrá en su interior el texto que colocarewmos en la parte central
		
		laminaTexto.add(texto);//Añadimos el texto a la parte central de la lámina
		
		add(laminaTexto, BorderLayout.CENTER);//Colocamos la lamina del texto en la parte central
		
		check1 = new JCheckBox("Negrita");
		
		check2 = new JCheckBox("Cursiva");
		
		check1.addActionListener(new ManejaChecks());//Ponemos el check1 a la escucha
		
		check2.addActionListener(new ManejaChecks());//Ponemos el check2 a la escucha
		
		JPanel laminaChecks = new JPanel();//Creamos la lámina donde iran los checks

		laminaChecks.add(check1);
		
		laminaChecks.add(check2);
		
		add(laminaChecks, BorderLayout.SOUTH);	
		
	}
	
	private class ManejaChecks implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			//Cada vez que pinchemos en un checkbox se ejecuta este método con lo que al deseleccionarlo, la variable tipo vale 0(se reinicia)
			int tipo=0;
			//Si se pinchan los 2 checks, tipo valdría 3
			if(check1.isSelected()) {//En el caso de que sea true(esté seleccionado...
				
				tipo+=Font.BOLD;//La variable tipo la incrementas en 1, porque la constante BOLD vale 1
			}	
			//El paso anterior tb se puede hacer de esta forma en una sola línea en el if.
			if(check2.isSelected()) tipo+=Font.ITALIC;//Si es true(está seleccionado) incrementa tipo en 2 porque ITALIC vale 2
			
			texto.setFont(new Font("Serif", tipo, 24));//Le ponemos el tipo de letra en funcion del valor de la variable tipo(0, 1, 2 o 3)
			
		}	
	}
	
	private JLabel texto;//Variable que corresponde al texto que ira en la parte superior de la lámina
	private JCheckBox check1, check2;// Los checkbox que iran en la parte inferior de la lámina
	
}


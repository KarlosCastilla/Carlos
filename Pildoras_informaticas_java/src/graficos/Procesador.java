package graficos;

//PROCESADOR DE TEXTOS PRACTICA

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class Procesador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MenuProcesador miMarco = new MenuProcesador();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MenuProcesador extends JFrame{
	
	public MenuProcesador() {
		
		setBounds(500,300,550,400);
		
		LaminaProcesador miLamina = new LaminaProcesador();//Creamos la lámina principal
		
		add(miLamina);
		
		setVisible(true);
		
	}
	
}

class LaminaProcesador extends JPanel{
	
	public LaminaProcesador() {
		
		setLayout(new BorderLayout());//A la lámina principal le damos un BorderLayout para distinguir sus zonas(Menú arriba y texto en el centro) 
		
		JPanel laminaMenu = new JPanel();//Creamos la segunda lámina que estará en la parte superior de la lámina principal y albergará el menú
		
		JMenuBar miBarra = new JMenuBar();
		//------------------------------------------------------------------------------------------------
		JMenu fuente = new JMenu("Fuente");//Creamos los 3 elementos de la barra de menú
		
		JMenu estilo = new JMenu("Estilo");
		
		JMenu tamagno = new JMenu("Tamaño");
		//------------------------------------------------------------------------------------------------
		JMenuItem arial = new JMenuItem("Arial");//Creamos los JMenuItem que tendrá cada elemento fuente del menú y se los añadimos
		//Creamos una clase interna anónima para gestionar el evento del cambio de letra al pulsar en courier
		arial.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				miArea.setFont(new Font("Arial", Font.PLAIN, 12));
							
			}		
			
		});
		
		
		JMenuItem courier = new JMenuItem("Courier");
		//Gestiona_menus tipo_letra = new Gestiona_menus();//Creamos un objeto ActionListener llamado tipo_letra para gestionar eventos  
		//courier.addActionListener(tipo_letra);//Ponemos el elemento "courier" a la escucha
		
		//Creamos una clase interna anónima para gestionar el evento del cambio de letra al pulsar en courier
		courier.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				miArea.setFont(new Font("Courier New", Font.PLAIN, 12));
							
			}		
			
		});
		
		JMenuItem verdana = new JMenuItem("Verdana");
		fuente.add(arial);
		fuente.add(courier);
		fuente.add(verdana);
		//-------------------------------------------------------------------------------------------------
		JMenuItem negrita = new JMenuItem("Negrita");//Creamos los JMenuItem que tendrá cada elemento estilo del menú y se los añadimos
		JMenuItem cursiva = new JMenuItem("Cursiva");
		estilo.add(negrita);
		estilo.add(cursiva);
		//-------------------------------------------------------------------------------------------------
		JMenuItem tam_12 = new JMenuItem("12");//Creamos los JMenuItem que tendrá cada elemento fuente del menú y se los añadimos
		JMenuItem tam_16 = new JMenuItem("16");
		JMenuItem tam_20 = new JMenuItem("20");
		JMenuItem tam_24 = new JMenuItem("24");
		tamagno.add(tam_12);
		tamagno.add(tam_16);
		tamagno.add(tam_20);
		tamagno.add(tam_24);
		
		//-------------------------------------------------------------------------------------------------
		
		miBarra.add(fuente);//Agregamos los elementos a la barra de menú
		miBarra.add(estilo);
		miBarra.add(tamagno);
		
		laminaMenu.add(miBarra);//Agregamos la barra de menú a la segunda lámina ya que es donde queremos situar el menú
		
		add(laminaMenu, BorderLayout.NORTH);//Le decimos que la segunda lámina debe de situarse en la zona norte del BorderLayout
		
		miArea = new JTextPane();//Instanciamos un objeto de tipo JTextPane para escribir texto en él
		
		add(miArea, BorderLayout.CENTER);//Agregamos este objeto a la parte central de la lámina principal
			
	}
	//Esta clase interna podemos convertirla en una clase interna anonima y el resultado sería el mismo. La comentamos y lo cambiamos
	/*private class Gestiona_menus implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
			miArea.setFont(new Font("Courier New", Font.PLAIN, 12));
						
		}
			
	}*/
	
	JTextPane miArea;//Creamos un objeto de tipo JTextPane fuera del constructor para poder usarlo en todo el programa	
	
}
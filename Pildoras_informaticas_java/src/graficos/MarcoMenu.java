package graficos;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class MarcoMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MenuFrame miMarco = new MenuFrame();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);

	}

}

class MenuFrame extends JFrame{
	
	public MenuFrame() {
		
		setBounds(550,300,550,400);
		
		MenuLamina miLamina = new MenuLamina();
		
		add(miLamina);
		
		setVisible(true);
	}
	
}

class MenuLamina extends JPanel{
	
	public MenuLamina() {
		
		JMenuBar miBarra = new JMenuBar();//Creamos una barra de menú
		
		JMenu archivo = new JMenu("Archivo");//Creamos los elementos principales de menú que tendrá nuestra barra de menu
		
		JMenu edicion = new JMenu("Edición");
		
		JMenu herramientas = new JMenu("Herramientas");
		
		JMenu opciones = new JMenu("Opciones");//Este JMenu opciones tiene que colgar del JMenu edicion, no está a la altura del resto
		
		//Creamos items o elementos secundarios del menú que irán desplegados en los JMenus de la barra de menú(JMenuBar)
		JMenuItem guardar = new JMenuItem("Guardar");
		JMenuItem guardar_como = new JMenuItem("Guardar Como");
		JMenuItem cortar = new JMenuItem("Cortar");
		JMenuItem copiar = new JMenuItem("Copiar");
		JMenuItem pegar = new JMenuItem("Pegar");
		JMenuItem generales = new JMenuItem("Generales");
		
		//Creamos items para el JMenu opciones
		JMenuItem opcion1 = new JMenuItem("Opción 1");
		JMenuItem opcion2 = new JMenuItem("Opción 2");
		
		//Añadimos los items al JMenu opciones
		opciones.add(opcion1);
		opciones.add(opcion2);
		
		//Añadimos los items creados al Jmenu correspondiente, en este caso el primer elemento de la barra de menu que será archivo
		archivo.add(guardar);
		archivo.add(guardar_como);
		
		//Añadimos los items creados al Jmenu correspondiente, en este caso el segundo elemento de la barra de menú que será edicion
		edicion.add(cortar);
		edicion.add(copiar);
		edicion.add(pegar);
		
		edicion.addSeparator();//Este método crea un separador en las opciones
		
		//Le decimos al JMenu edición que agregue el JMenu opciones
		edicion.add(opciones);
		
		//Añadimos el item creado al Jmenu correspondiente, en este caso el tercer elemento de la barra de menú que será herramientas
		herramientas.add(generales);
		
		miBarra.add(archivo);//Le decimos que elementos van dentro de la barra de menú
		miBarra.add(edicion);
		miBarra.add(herramientas);
		
		add(miBarra);//Agregamos la barra de menú con el método add a la lámina
		
	}
	
	
}

package graficos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Layouts_I {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_Layout marco = new Marco_Layout();
		
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		marco.setVisible(true);

	}

}


class Marco_Layout extends JFrame{
	//Constructor del marco
	public Marco_Layout() {
		
		setTitle("Prueba Acciones");
		
		setBounds(600,350,600,300);
		
		Panel_Layout lamina = new Panel_Layout();
		
		Panel_Layout2 lamina2 = new Panel_Layout2();
		
		//FlowLayout disposicion = new FlowLayout(FlowLayout.CENTER);
		
		add(lamina, BorderLayout.NORTH);//En el contenedor Marco le damos un Layout a cada lámina pq si no la segunda machacaría a la primera
		add(lamina2, BorderLayout.SOUTH);
	}
	
}

class Panel_Layout extends JPanel{
	//Constructor de la lámina
	public Panel_Layout() {
		//Establezco el posicionamiento de la lámina y los elementos que va a haber en la misma en el mismo sitio(en el constructor de la lámina)
		//setLayout(new FlowLayout(FlowLayout.CENTER,75,100));//Creo la instancia de FlowLayout en el propio parámetro de setLayout
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(new JButton("Amarillo"));
		add(new JButton("Rojo"));

	}
	
}

class Panel_Layout2 extends JPanel{
	
	public Panel_Layout2() {
		
		setLayout(new BorderLayout());
		//En el BorderLayout se pasa como parámetro tb la posición que tiene el elemento respecto a la lámina(WEST, EAST, CENTER, NORTH...)
		add(new JButton("Azul"), BorderLayout.WEST);
		add(new JButton("Verde"), BorderLayout.EAST);
		add(new JButton("Negro"), BorderLayout.CENTER);
		
	}
	
}
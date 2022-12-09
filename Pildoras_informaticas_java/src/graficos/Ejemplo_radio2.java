package graficos;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

//Mismo ejercicio que Ejemplo_radio pero con menos código aunque más complejo de entender

public class Ejemplo_radio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_radio2 miMarco = new Marco_radio2();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class Marco_radio2 extends JFrame{
	
	public Marco_radio2() {
		
		
		setBounds(550,300,500,350);
		
		Lamina_radio2 miLamina = new Lamina_radio2();
		
		add(miLamina);
		
		setVisible(true);
	}
	
}

class Lamina_radio2 extends JPanel{
	
	public Lamina_radio2() {
		
		setLayout(new BorderLayout());//Le decimos a la lamina principal que tendrá una distribución de BorderLayout;
		
		texto = new JLabel("En un lugar de la Mancha de cuyo nombre...");
		
		texto.setFont(new Font("Serif", Font.PLAIN, 12));//Establezco las características del texto por defecto
		
		add(texto, BorderLayout.CENTER);
		
		lamina_botones = new JPanel();//Iniciamos la lámina y el grupo
		miGrupo = new ButtonGroup();
		
		colocarBotones("Pequeño", false, 10);
		colocarBotones("Mediano", true, 12);
		colocarBotones("Grande", false, 18);
		colocarBotones("Muy grande", false, 26);
		
		add(lamina_botones, BorderLayout.SOUTH);
			
	}
	
	//Creamos un método que se encargará de hacer todo el trabajo y se le llamara desde el constructor de la lámina
	public void colocarBotones(String nombre, boolean seleccionado, final int tamagno) {
		//Instanciamos un radiobutton pasandole 2 parámetros ya que el constructor de JRadioButton está sobrecargado y admite recibir un string 
		//y un booleano. Le pone el nombre que pasamos al método por parámetro y dice si esta activado o no con el booleano
		JRadioButton boton = new JRadioButton(nombre, seleccionado);
		
		miGrupo.add(boton);//Todos los botones que se encargue de construir este método los va a añadir al grupo, en este caso como se llama
		// al metodo colocarBotones() en 4 ocasiones se van a crear 4 botones
		lamina_botones.add(boton);//Para que agregue el botón a esta segunda lámina
		
		//El botón tiene que responder a una serie de eventos
		ActionListener miEvento = new ActionListener() {//Creamos una instancia para el evento

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//Cuando se pulse un radioButton el actionPerformed se encargará
				texto.setFont(new Font("Serif", Font.PLAIN, tamagno));
				
			}
					
		};
		
		boton.addActionListener(miEvento);	
		
	}

	private JLabel texto;
	
	private JRadioButton boton1, boton2, boton3, boton4;
	
	private ButtonGroup miGrupo;
	
	private JPanel lamina_botones;
		
}

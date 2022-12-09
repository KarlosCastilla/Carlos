package graficos;
import javax.swing.*;

public class Sintaxis_radio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Marco_radio_sintaxis miMarco = new Marco_radio_sintaxis();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

class Marco_radio_sintaxis extends JFrame{
	
	public Marco_radio_sintaxis() {
		
		setVisible(true);
		
		setBounds(550,300,500,350);
		
		Lamina_radio_sistaxis miLamina = new Lamina_radio_sistaxis();
		
		add(miLamina);
		
	}
	
}

class Lamina_radio_sistaxis extends JPanel{
	
	public Lamina_radio_sistaxis() {
		
		ButtonGroup miGrupo1 = new ButtonGroup();
		
		ButtonGroup miGrupo2 = new ButtonGroup();
		
		JRadioButton boton1 = new JRadioButton("Azul", false);//Creamos 3 radiobutton con un texto y un estado(activado o desactivado)
		JRadioButton boton2 = new JRadioButton("Rojo", true);
		JRadioButton boton3 = new JRadioButton("Verde", false);
		
		JRadioButton boton4 = new JRadioButton("Masculino", false);
		JRadioButton boton5 = new JRadioButton("Femenino", false);
		
		//Le decimos al programa que los 3 botones pertenecen a un Buttongroup(miGrupo1)
		miGrupo1.add(boton1);
		miGrupo1.add(boton2);
		miGrupo1.add(boton3);
		//Le decimos al programa que los 2 botones pertenecen a un Buttongroup(miGrupo2)
		miGrupo2.add(boton4);
		miGrupo2.add(boton5);
		
		add(boton1);//Son los botones los que se añaden a la lamina, no los ButtonGroup
		add(boton2);
		add(boton3);
		add(boton4);
		add(boton5);
		
	}
	
	
}
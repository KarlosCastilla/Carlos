package graficos;

import java.awt.*;
import java.awt.Toolkit;

import javax.swing.*;

public class CreandoMarcoCentrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoCentrado miMarco = new MarcoCentrado();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);

	}

}


class MarcoCentrado extends JFrame{
	
	public MarcoCentrado() {
		
		Toolkit mipantalla = Toolkit.getDefaultToolkit();
		
		Dimension tamanoPantalla = mipantalla.getScreenSize();
		
		int alturaPantalla = tamanoPantalla.height;
		int anchoPantalla = tamanoPantalla.width;
		
		setSize(anchoPantalla/2, alturaPantalla/2); //Le doy a mi marco unas dimensiones de la mitad del marco de mi pantalla
		
		setLocation(anchoPantalla/4, alturaPantalla/4); //Coloco el frame en el centro de la pantalla
		
		setTitle("marcoCentrado");// Le pongo un titulo
		
		Image miIcono = mipantalla.getImage("src/graficos/icono.png");//ruta relativa donde esta el icono
		
		setIconImage(miIcono);
		
	}
	
}
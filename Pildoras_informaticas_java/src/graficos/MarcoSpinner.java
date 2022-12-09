package graficos;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;


public class MarcoSpinner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FrameSpinner miMarco = new FrameSpinner();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);

	}

}

class FrameSpinner extends JFrame{
	
	public FrameSpinner() {
		
		setBounds(550,350,550,350);
		
		setVisible(true);
		
		add(new LaminaSpinner());
	}
	
}

class LaminaSpinner extends JPanel{
	
	public LaminaSpinner(){
		
		//Para crear un JSpinner con una Fecha
		//JSpinner control= new JSpinner(new SpinnerDateModel());//Creamos el JSpinner instanciando la clase JSpinner con el constructor por defecto
		
		//Para crear un JSpinner con una lista
		//Antes de crear el JSpinner creamos el array que contiene los elementos que queremos que aparezcan en la lista (Array de tipo String)
		//String lista[]= {"Enero", "Febrero", "Marzo", "abril"};
		//Creamos el JSpinner pasándole como argumento al constructor un SpinnerListModel y a su vez como parámetro la lista que hemos creado.
		//JSpinner control = new JSpinner(new SpinnerListModel(lista));
		
		//OTRO EJEMPLO: Almacenamos en el array lista2 todos las fuentes o tipos de letra que tengo en mi ordenador
		//String lista2[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		//JSpinner control = new JSpinner(new SpinnerListModel(lista2));
		
		//Creamos el JSpinner instanciando la clase JSpinner con el constructor por defecto
		//JSpinner control= new JSpinner(new SpinnerNumberModel());
		
		//Creamos el JSpinner instanciando por parámetro un objeto tipo SpinnerNumberModel dándole un valor por defecto, mínimo, máximo y avance
		//JSpinner control= new JSpinner(new SpinnerNumberModel(5,0,10,1));
		
		//Creamos el JSpinner instanciando la clase JSpinner con el constructor por defecto
		//JSpinner control= new JSpinner();
		
		
		//Creamos un JSpinner pasándole por parámetro una nueva instancia de nuestro modelo nuevo de JSpinner(MiModeloJSpinner)
		JSpinner control = new JSpinner(new MiModeloJSpinner());
		
		
		Dimension d = new Dimension(200,20);//Creamos un objeto de tipo Dimension para pasarle como argumento al método setPreferredSize
		
		//Método para cambiar las dimensiones del JSpinner
		control.setPreferredSize(d);//Este método se hereda de la clase JComponent y recibe un parámetro de tipo Dimension (creado arriba)
		
		add(control);//Agregamos el JSpinner a la lámina
		
	}
	
	/*Para hacer que el JSpinner avance cuando clicamos abajo y retroceda cuando clicamos arriba(por defecto está al revés), es necesario
	crear un nuevo modelo de JSpinner ya que no existe. Es necesaria una nueva clase para crear un objeto que sea un modelo de tipo JSpinner
	para poder utilizarlo como argumento dentro del constructor. Además esa clase deberá ser interna para poder acceder al elemento control */
	
	//Hereda de SpinnerNumberModel para aprovechar lo que ya tiene y le cambiarle el comportamiento
	private class MiModeloJSpinner extends SpinnerNumberModel {
		
		public MiModeloJSpinner() {
			
			super(5,0,10,1);//Con super llamamos al constructor de la clase padre(SPinnerNumberModel) y le pasamos por parámetro valores de inicio
			
		}
		
		public Object getNextValue() {//Sobreescribimos el método getNextValue para cambiar su comportamiento, este método retorna un Object  
			//En vez de devolvernos el valor siguiente, le decimos que devuelva el anterior de la clase padre al ponerle el super(SpinnerNumberModel
			return super.getPreviousValue();
			
		}
		
		public Object getPreviousValue() {//Sobreescribimos el método getPreviosValue para cambiar su comportamiento, este método retorna un Object  
			//En vez de devolvernos el valor previo, le decimos que devuelva el siguiente de la clase padre al ponerle el super(SpinnerNumberModel
			return super.getNextValue();
			
		}
		
		
	}
	
}

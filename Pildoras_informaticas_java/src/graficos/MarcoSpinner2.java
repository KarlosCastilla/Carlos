package graficos;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

//EN ESTE EJEMPLO UTILIZAREMOS UNA CLASE INTERNA ANONIMA PARA CREAR UN MODELO NUEVO DE JSPINNER, ES VALIDO PARA EL RESTO DE COMPONENTES SWING



public class MarcoSpinner2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FrameSpinner2 miMarco = new FrameSpinner2();
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		miMarco.setVisible(true);

	}

}

class FrameSpinner2 extends JFrame{
	
	public FrameSpinner2() {
		
		setBounds(550,350,550,350);
		
		setVisible(true);
		
		add(new LaminaSpinner2());
	}
	
}

class LaminaSpinner2 extends JPanel{
	
	public LaminaSpinner2(){
				
		//Creamos un JSpinner pasándole por parámetro una nueva instancia de JSpinner que por parametro recibirá una nueva instancia de la clase
		//interna anónima, a la que le damos unos parámetros iniciales.
		JSpinner control = new JSpinner(new SpinnerNumberModel(5,0,10,1) {
			
			public Object getNextValue() {//Sobreescribimos el método getNextValue para cambiar su comportamiento, este método retorna un Object  
				//En vez de devolvernos el valor siguiente, le decimos que devuelva el anterior de la clase padre al ponerle el super(SpinnerNumberModel
				return super.getPreviousValue();
				
			}
			
			public Object getPreviousValue() {//Sobreescribimos el método getPreviosValue para cambiar su comportamiento, este método retorna un Object  
				//En vez de devolvernos el valor previo, le decimos que devuelva el siguiente de la clase padre al ponerle el super(SpinnerNumberModel
				return super.getNextValue();
				
			}		
			
		});
		
		
		Dimension d = new Dimension(200,20);//Creamos un objeto de tipo Dimension para pasarle como argumento al método setPreferredSize
		
		//Método para cambiar las dimensiones del JSpinner
		control.setPreferredSize(d);//Este método se hereda de la clase JComponent y recibe un parámetro de tipo Dimension (creado arriba)
		
		add(control);//Agregamos el JSpinner a la lámina
		
	}
	
}

package com.ipartek.formacion.carlos.poo.EjercicioFechas;

import java.util.GregorianCalendar;

public class Fecha {
	
/*Crear una Clase Fecha en Java. La clase tendrá tres atributos privados dia, mes y año de tipo int. La clase contendrá los siguientes métodos:
Constructor por defecto.
Constructor con tres parámetros para crear objetos con valores iniciales.
Métodos set y get para asignar y obtener los valores de los atributos de la clase.
Método fechaCorrecta() que comprueba si la fecha es correcta. Devuelve un valor de tipo boolean indicando si la fecha es correcta o no. Este método a su vez utilizará un método 
privado de la clase llamado esBisiesto que calcula si el año es o no bisiesto. El método esBisiesto devuelve true si el año es bisiesto y false si no lo es.
Método diaSiguiente() que cambia la fecha actual por la del día siguiente. El objeto de la clase Fecha al que se le aplique este método deberá quedar siempre en un estado 
consistente, es decir, la nueva fecha deberá ser correcta.
Modificar el método toString() heredado de Object para mostrar las fechas de la forma dd-mm-aaaa. El día y el mes se deben mostrar con dos cifras. Si el dia o el mes tienen solo 
una cifra se escribirá un cero delante. Por ejemplo si la fecha es dia=1, mes=6, año= 2015 la fecha que se mostrará será: 01-06-2015
Escribe un programa para probar la clase Fecha. El método diaSiguiete() pruébalo dentro de un bucle que imprima la fecha durante cada iteración del bucle.*/

	private int dia, mes, anio;
	
	
	public Fecha(int dia, int mes, int anio) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}
	
	public Fecha() {
		super();
	}
	
	public int getDia() {
		return dia;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	/*Método fechaCorrecta() que comprueba si la fecha es correcta. Devuelve un valor de tipo boolean indicando si la fecha es correcta o no. Este método a su vez utilizará un método 
	privado de la clase llamado esBisiesto que calcula si el año es o no bisiesto. El método esBisiesto devuelve true si el año es bisiesto y false si no lo es.*/
	
	public boolean fechaCorrecta(){
		boolean diaCorrecto, mesCorrecto, anioCorrecto;
		anioCorrecto = anio >=0;
		mesCorrecto = mes >= 1 && mes <= 12;
        switch (mes) {
        case 2:
            if (esBisiesto()) {
                diaCorrecto = dia >= 1 && dia <= 29;
            } else {
                diaCorrecto = dia >= 1 && dia <= 28;
            }
            break;
        case 4:
        case 6:
        case 9:
        case 11:
            diaCorrecto = dia >= 1 && dia <= 30;
            break;
        default:
            diaCorrecto = dia >= 1 && dia <= 31;
        }
		return diaCorrecto && mesCorrecto && anioCorrecto;
		
	}
        
        //Método privado para comprobar si el año es bisiesto
        //Este método lo utiliza el método fechaCorrecta
        private boolean esBisiesto() {
            return (anio % 4 == 0 && anio % 100 != 0 || anio % 400 == 0);
        }
        
        
       /*Método diaSiguiente() que cambia la fecha actual por la del día siguiente. El objeto de la clase Fecha al que se le aplique este método deberá quedar siempre en un estado 
       consistente, es decir, la nueva fecha deberá ser correcta.*/ 
        
        //Método que modifica la fecha cambiándola por la del día siguiente                                           
        public void diaSiguiente() {
            dia++;
            if (!fechaCorrecta()) {
                dia = 1;
                mes++;
                if (!fechaCorrecta()) {
                    mes = 1;
                    anio++;
                }

            }
        }
        
        
        //Método toString para mostrar la fecha
        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            if (dia < 10) {
                sb.append("0");
            }
            sb.append(dia);
            sb.append("-");
            if (mes < 10) {
                sb.append("0");
            }
            sb.append(mes);
            sb.append("-");
            sb.append(anio);
            return sb.toString();
        }
        
      //  public void diaSiguiente(int dia, int mes, int anio) {
        	
      //  		switch(mes) {
      //  		case 2:
      //  			if (esBisiesto() && mes == 2 ) {
      //  				if (dia <= 28) {
      //  					dia++;
      //  				}else {
      //  					dia = 1;
      //  					mes++;
      //  				}
      //  			}
      //  			break;
      //  		case 4:
      //  		case 6:
      //  		case 9:
      //  		case 11:
      //  			if (dia < 30) {
      //  				dia++;
      //  			}else {
      //  				dia = 1;
      //  				mes++;
      //  			}
      //  			break;
      //  		default:
      //  			if (dia < 31) {
      //  				dia++;
      //  			}else {
      //  				dia = 1;
      //  				if (mes == 12) {
      //  					mes = 1;
      //  					anio++;
      //  				}
      //  			}	
      //  				
      //  		}
      //  	}
        	
      //  }
	
	
	
	
	//public boolean esBisiesto(int anio) {
	//GregorianCalendar calendar = new GregorianCalendar();
	//boolean bisiesto;
	//if (calendar.isLeapYear(anio)) {
	//	bisiesto = true;
	//}else {
	//	bisiesto = false;
	//}
	//return bisiesto;
	//}

}



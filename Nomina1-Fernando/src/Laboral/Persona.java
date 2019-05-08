package Laboral;

/**
 * Esta es una clase padre Persona para que luego diferentes clases puedan heredar de ella.
 * @author fernando
 * @version 1.0
 *
 */
public abstract class Persona {

	public String nombre;

	public String dni;

	public char sexo;
	
	/**
	 * Constructor con todos los parámetros
	 * @param nombre
	 * @param dni
	 * @param sexo
	 */

	public Persona(String nombre, String dni, char sexo) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.sexo = sexo;
		
	}

	/**
	 * Constructor con los siguientes parámetros:
	 * 
	 * @param nombre
	 * @param sexo
	 */
	public Persona(String nombre, char sexo) {
		super();
		this.nombre = nombre;
		
		try {
			if(this.sexo == 'H' || this.sexo == 'M') {
				this.sexo = sexo;
			} else {
				throw new DatosNoCorrectosException();
			}
		}catch (DatosNoCorrectosException e) {
			System.out.println("El sexo solo puede ser H o M");
		}
		
	}

	/**
	 * Setter del parámetro dni
	 * @param dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * ToString que muestra por pantalla los atributos del objeto
	 * @return mensaje
	 */
	public String imprime() {
		return "Persona [nombre=" + nombre + ", dni=" + dni + "]";
	}

}

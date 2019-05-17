package Laboral;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Main principal del programa
 * @author fernando
 *
 */
public class CalculaNominas {

	public static void main(String[] args) throws FileNotFoundException {
		
		/**
		 *  LECTURA DE LOS EMPLEADOS DESDE UN FICHERO empleados.txt
		 */
		
		File f = new File("empleados.txt");
		
		Scanner s = new Scanner(f);
		
 		
		while(s.hasNext()) {
			System.out.println(s.nextLine());
		}
		
		System.out.println("");
		System.out.println("");
		
		/**
		 * ESCRITURA DE LOS SALARIOS Y DNI EN UN ARCHIVO DE TEXTO salarios.txt
		 */
		
		
		
		
		// Cerramos el scanner para no consumir recursos
		s.close();
		
		
		try{
			
			
		Empleado emp1 = new Empleado("James Cosling", "32000032G", 'M', 4, 7);
		
		Empleado emp2 = new Empleado("Ada Lovelace", "32000031R", 'F');
		
		escribe(emp1, emp2);
		
		emp1.setCategoria(9);
		emp2.incrAnyo();
		
		System.out.println("");
		escribe(emp1, emp2);
		
		} catch (DatosNoCorrectosException e){
			System.out.println("Datos introducidos no correctos");
		}

	}
	
	/**
	 * Método static y privado del main que muestra por pantalla los dos empleados y sus sueldos
	 * @param emp1
	 * @param emp2
	 */
	private static void escribe(Empleado emp1, Empleado emp2) {
		System.out.println(emp1.imprime());
		System.out.println("El sueldo del empleado1 es: " + emp1.sueldo());
		System.out.println("---------------------------------------------------------");
		System.out.println(emp2.imprime());
		System.out.println("El sueldo del empleado2 es: " + emp2.sueldo());
		
	}

}

package Laboral;

import java.util.Scanner;

public class Menu {

	public static void main(String[] args) {

		OpcionesMenu om = new OpcionesMenu();

		Scanner s = new Scanner(System.in);
		Scanner ss = new Scanner(System.in);

		int op = 0;

		do {
			System.out.println("-----MENÚ PRINCIPAL-----");
			System.out.println("1. INFORMACIÓN DE TODOS LOS EMPLEADOS");
			System.out.println("2. BUSCAR SALARIO DE UN EMPLEADO");
			System.out.println("3. MODIFICAR DATOS DE UN EMPLEADO");
			System.out.println("4. ACTUALIZAR SUELDO DE UN EMPLEADO");
			System.out.println("5. ACTUALIZAR SUELDO DE TODOS LOS EMPLEADOS");
			System.out.println("6. REALIZAR COPIA DE SEGURIDAD EN UN FICHERO");
			System.out.println("7. SALIR");
			op = s.nextInt();

			if (op == 1) {
				om.opcion1();
			} else if (op == 2) {
				System.out.println("Inserta el DNI de la persona a la que quieres saber su salario");
				String dni = ss.nextLine();
				om.opcion2(dni);
			} else if (op == 3) {

			} else if (op == 4) {

			} else if (op == 5) {

			} else if (op == 6) {

			}
			
		} while (op != 7);

		s.close();

	}

}

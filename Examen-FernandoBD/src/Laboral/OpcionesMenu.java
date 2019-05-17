package Laboral;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OpcionesMenu {

	Conexion co;
	
    public void opcion1() {
        try {
            // Cargamos la conexión
            Connection con = co.getConnection();
            Statement st;
            ResultSet rs;
            // Creamos la sentencia SQL
            String sql = "SELECT * FROM EMPLEADOS";
            // Ejecutamos la sentencia SQL
            st = con.createStatement();	
            rs = st.executeQuery(sql);
            // Mostramos los datos de los registros
            while (rs.next()) {
                System.out.println("Nombre: " + rs.getString(1));
                System.out.println("DNI: " + rs.getString(2));
                System.out.println("Sexo: " + rs.getString(3));
                System.out.println("Categoría: " + rs.getInt(4));
                System.out.println("Años Trabajados: " + rs.getInt(5));
                System.out.println("Sueldo: " + rs.getInt(6));
                System.out.println("**********************************");
            }
            // Cerramos las conexiones
            rs.close();
            st.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void opcion2(String dni) {
        try {
            // Cargamos la conexión
            Connection con = co.getConnection();
            Statement st;
            ResultSet rs;
            // Creamos la sentencia SQL
            String sql = "SELECT SALARIO FROM EMPLEADOS WHERE DNI='dni'";
            // Ejecutamos la sentencia SQL
            st = con.createStatement();	
            rs = st.executeQuery(sql);
            // Mostramos los datos de los registros
            while (rs.next()) {
                System.out.println("Sueldo: " + rs.getInt(1));
            }
            // Cerramos las conexiones
            rs.close();
            st.close();
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

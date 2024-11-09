/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acceso.datos.actividad.uf2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author josca
 */
public class ConexionDB {
    
    private static final String URL = "jdbc:mysql://localhost:3306/montañas";
    private static final String USUARIO = "root"; // Cambia si tu usuario es diferente
    private static final String CONTRASEÑA = ""; // Cambia si tu MySQL tiene contraseña

    public static Connection getConnection() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
            System.out.println("Conexion exitosa a la base de datos.");
        } catch (SQLException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
        return conexion;
    }
}
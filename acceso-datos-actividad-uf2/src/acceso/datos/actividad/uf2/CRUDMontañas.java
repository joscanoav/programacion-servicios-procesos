/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package acceso.datos.actividad.uf2;
import java.sql.*;

/**
 *
 * @author josca
 */
public class CRUDMontañas {
    
        // Crear la tabla Montañas
    public void crearTabla(Connection conexion) throws SQLException {
        String query = """
            CREATE TABLE IF NOT EXISTS Montañas (
                id INT AUTO_INCREMENT PRIMARY KEY,
                Nombre VARCHAR(50),
                Altura INT,
                PrimeraAscensión INT,
                Región VARCHAR(50),
                País VARCHAR(50)
            )
            """;
        try (Statement stmt = conexion.createStatement()) {
            stmt.executeUpdate(query);
            System.out.println("Tabla 'Montañas' creada correctamente.");
        }
    }

    // Añadir una montaña
    public void añadirMontaña(Connection conexion, String nombre, int altura, int primeraAscension, String region, String pais) throws SQLException {
        String query = "INSERT INTO Montañas (Nombre, Altura, PrimeraAscensión, Región, País) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = conexion.prepareStatement(query)) {
            stmt.setString(1, nombre);
            stmt.setInt(2, altura);
            stmt.setInt(3, primeraAscension);
            stmt.setString(4, region);
            stmt.setString(5, pais);
            stmt.executeUpdate();
            System.out.println("Montana añadida correctamente.");
        }
    }

    // Consultar todas las montañas
    public void consultarTabla(Connection conexion) throws SQLException {
        String query = "SELECT * FROM Montañas";
        try (Statement stmt = conexion.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            
            System.out.println("ID | Nombre | Altura | Primera Ascension | Region | Pais");
            System.out.println("--------------------------------------------------------");
            while (rs.next()) {
                System.out.printf("%d | %s | %d | %d | %s | %s%n",
                        rs.getInt("id"),
                        rs.getString("Nombre"),
                        rs.getInt("Altura"),
                        rs.getInt("PrimeraAscensión"),
                        rs.getString("Región"),
                        rs.getString("País"));
            }
        }
    }

    // Consultar una montaña específica
    public void consultarMontaña(Connection conexion, int id) throws SQLException {
        String query = "SELECT * FROM Montañas WHERE id = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(query)) {
            stmt.setInt(1, id);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    System.out.printf("Nombre: %s, Altura: %d, Primera Ascensión: %d, Región: %s, País: %s%n",
                            rs.getString("Nombre"),
                            rs.getInt("Altura"),
                            rs.getInt("PrimeraAscensión"),
                            rs.getString("Región"),
                            rs.getString("País"));
                } else {
                    System.out.println("Montana no encontrada.");
                }
            }
        }
    }

    // Editar una montaña
    public void editarMontaña(Connection conexion, int id, String nombre, int altura, int primeraAscension, String region, String pais) throws SQLException {
        String query = "UPDATE Montañas SET Nombre = ?, Altura = ?, PrimeraAscensión = ?, Región = ?, País = ? WHERE id = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(query)) {
            stmt.setString(1, nombre);
            stmt.setInt(2, altura);
            stmt.setInt(3, primeraAscension);
            stmt.setString(4, region);
            stmt.setString(5, pais);
            stmt.setInt(6, id);
            stmt.executeUpdate();
            System.out.println("Montana actualizada correctamente.");
        }
    }

    // Borrar una montaña
    public void borrarMontaña(Connection conexion, int id) throws SQLException {
        String query = "DELETE FROM Montañas WHERE id = ?";
        try (PreparedStatement stmt = conexion.prepareStatement(query)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Montana eliminada correctamente.");
        }
    }

    // Borrar la tabla Montañas
    public void borrarTabla(Connection conexion) throws SQLException {
        String query = "DROP TABLE IF EXISTS Montañas";
        try (Statement stmt = conexion.createStatement()) {
            stmt.executeUpdate(query);
            System.out.println("Tabla 'Montanas' eliminada correctamente.");
        }
    }
}


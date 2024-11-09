/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package acceso.datos.actividad.uf2;

/**
 *
 * @author josca
 */
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class MainMontañas {

    /**
     * @param args the command line arguments
     */
    private static final Scanner scanner = new Scanner(System.in);
    private static final CRUDMontañas crud = new CRUDMontañas();

    public static void main(String[] args) {
        try (Connection conexion = ConexionDB.getConnection()) {
            int opcion;
            do {
                mostrarMenu();
                opcion = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer

                switch (opcion) {
                    case 1 -> crud.crearTabla(conexion);
                    case 2 -> añadirMontaña(conexion);
                    case 3 -> crud.consultarTabla(conexion);
                    case 4 -> consultarMontaña(conexion);
                    case 5 -> editarMontaña(conexion);
                    case 6 -> borrarMontaña(conexion);
                    case 7 -> crud.borrarTabla(conexion);
                    case 8 -> System.out.println("Saliendo del programa...");
                    default -> System.out.println("Opción no válida, intente nuevamente.");
                }
            } while (opcion != 8);
        } catch (SQLException e) {
            System.out.println("Error en la conexion a la base de datos: " + e.getMessage());
        }
    }

    private static void mostrarMenu() {
        System.out.println("\nMenu de opciones:");
        System.out.println("1. Crear la tabla 'Montanas'");
        System.out.println("2. Anadir una montana");
        System.out.println("3. Consultar todas las montanas");
        System.out.println("4. Consultar una montana especifica");
        System.out.println("5. Editar una montana");
        System.out.println("6. Borrar una montana");
        System.out.println("7. Borrar la tabla 'Montanas'");
        System.out.println("8. Salir");
        System.out.print("Seleccione una opcion: ");
    }

    private static void añadirMontaña(Connection conexion) throws SQLException {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Altura: ");
        int altura = scanner.nextInt();
        System.out.print("Primera Ascensión (año): ");
        int primeraAscension = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        System.out.print("Región: ");
        String region = scanner.nextLine();
        System.out.print("País: ");
        String pais = scanner.nextLine();

        crud.añadirMontaña(conexion, nombre, altura, primeraAscension, region, pais);
    }

    private static void consultarMontaña(Connection conexion) throws SQLException {
        System.out.print("Ingrese el ID de la montaña: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        crud.consultarMontaña(conexion, id);
    }

    private static void editarMontaña(Connection conexion) throws SQLException {
        System.out.print("Ingrese el ID de la montaña a editar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nuevo nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Nueva altura: ");
        int altura = scanner.nextInt();
        System.out.print("Nueva primera ascensión (año): ");
        int primeraAscension = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nueva región: ");
        String region = scanner.nextLine();
        System.out.print("Nuevo país: ");
        String pais = scanner.nextLine();

        crud.editarMontaña(conexion, id, nombre, altura, primeraAscension, region, pais);
    }

    private static void borrarMontaña(Connection conexion) throws SQLException {
        System.out.print("Ingrese el ID de la montaña a borrar: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        crud.borrarMontaña(conexion, id);
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora_cliente_servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author josca
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws IOException {
    // Creacion del socket del cliente y conexion al servidor
        Socket socket = new Socket("localhost", 7777);
        System.out.println("conectado al servidor");
        
        
        DataInputStream flujoEntrada = new DataInputStream(socket.getInputStream());
        // Flujo de salida para enviar datos al servidor
        DataOutputStream flujoSalida = new DataOutputStream(socket.getOutputStream());

        // Leer operación del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la operacion (ejemplo: 3+3): ");
        String operacion = scanner.nextLine();

        // Enviar operación al servidor
        flujoSalida.writeUTF(operacion);

        // Recibir y mostrar el resultado del servidor
        String resultado = flujoEntrada.readUTF();
        System.out.println(resultado);

        // Cerrar flujos y sockets
        flujoEntrada.close();
        flujoSalida.close();
        socket.close();
    }
}
    
    


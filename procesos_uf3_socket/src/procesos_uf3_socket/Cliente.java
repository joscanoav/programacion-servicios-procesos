/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package procesos_uf3_socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author josca
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        // creaciond el socket y conexion con la direccion del servidor(localhost)
        Socket misocket= new Socket ("localhost", 8888);
        //Creo un flujo de salida del programa para el socket
        DataOutputStream flujo_salida= new DataOutputStream(misocket.getOutputStream());
        
        String mensaje = "Hola mundo";
        System.out.println("Envio el mensaje" + mensaje);
        
        //escribo en el flujo de salida un texto
        flujo_salida.writeUTF(mensaje);
        //cierre del flujo de salida
        flujo_salida.close();
        //cierro del socket
        misocket.close();
        
    }
    
}

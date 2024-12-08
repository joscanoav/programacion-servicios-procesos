/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package procesos_uf3_socket;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author josca
 */
public class Servidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // creacion del socket y asignacion del puerto
        ServerSocket servidor= new ServerSocket(8888);
        // Escucha y aceptacion
        Socket misocket=servidor.accept();
        
        //creo un flujo de entrda del programa para el socket
        
        DataInputStream flujo_entrada=new DataInputStream(misocket.getInputStream());
        
        // capto lo que haya en el flujo y lo guardo en mensaje como texto
        String mensaje= flujo_entrada.readUTF();
        System.out.println("He recibido el mensaje:"+mensaje);
        // cierre del flujo de entrada
        flujo_entrada.close();
        // cierro del socket
        misocket.close();
        
        servidor.close();
    }
    
}

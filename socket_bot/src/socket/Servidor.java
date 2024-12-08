/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package socket;

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
        // TODO code application logic here
    
        ServerSocket servidor = new ServerSocket(9999);
        Socket misocket=servidor.accept();
        
        DataInputStream flujo_entrada=new DataInputStream(misocket.getInputStream());
        
        String mensaje_texto = flujo_entrada.readUTF();
        
        
        if(mensaje_texto.contains("hola")){
            System.out.println("Hola soy un bot");
        }
        
        else if (mensaje_texto.contains("adios")){
            System.out.println("Adios encantado de conocerte");
        }
        
        else if (mensaje_texto.contains("llamas")){
            System.out.println("Me llamo Jorge");
        }
        
        String mensaje_texto2 = flujo_entrada.readUTF();
        
        if (mensaje_texto2.contains("hola")){
            System.out.println("Hola soy un bot");
        }
        
        else if (mensaje_texto2.contains("adios")){
            System.out.println("Adios encantado de conocerte");
        }
        
        else if (mensaje_texto2.contains("llamas")){
            System.out.println("Me llamo Jorge");
        }
        flujo_entrada.close();
        misocket.close();
        
    }  
}

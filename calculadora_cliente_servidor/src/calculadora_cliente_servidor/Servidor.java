/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora_cliente_servidor;

import java.io.DataInputStream;
import java.io.DataOutputStream;
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
        // Creacion del socket del servidor
        ServerSocket servidor = new ServerSocket(7777);
        System.out.println("Servidor en espera de conexion...");
        
        // Esperar y aceptar la conexion del cliente
        Socket socket = servidor.accept();
        System.out.println("Cliente conectado");
        
        // Flujo de entrda para recibir los dalots del cliente
        DataInputStream flujo_entrada = new DataInputStream(socket.getInputStream());
        // Flujo de salida para enviar datos al cliente
        DataOutputStream flujo_salida = new DataOutputStream(socket.getOutputStream());
        
        // Leer la operacion enviada por el cliente
        String operacion = flujo_entrada.readUTF();
        System.out.println("Operacion recibida " + operacion);
        
        // Procesar la operacion
        int resultado = procesarOperacion(operacion);
        
        // Enviar el resultado al cliente
        flujo_salida.writeUTF("El resultado es : " + resultado);
        // Cerrar flujos y sockets
        flujo_entrada.close();
        flujo_salida.close();
        socket.close();
        servidor.close();
    }
    
    public static int procesarOperacion(String operacion){
        int resultado = 0;
        try {
            // Determinar la operacion a realizar
            if (operacion.contains("+")){
                int operador1 = Integer.parseInt(operacion.substring(0,operacion.indexOf("+")));
                int operador2 = Integer.parseInt(operacion.substring(operacion.indexOf("+")+1));
                resultado = operador1 + operador2;          
                
            } else if (operacion.contains("-")){
                int operador1 = Integer.parseInt(operacion.substring(0,operacion.indexOf("-")));
                int operador2 = Integer.parseInt(operacion.substring(operacion.indexOf("-")+1));
                resultado = operador1 - operador2;          

            } else if (operacion.contains("*")){
                int operador1 = Integer.parseInt(operacion.substring(0,operacion.indexOf("*")));
                int operador2 = Integer.parseInt(operacion.substring(operacion.indexOf("*")+1));
                resultado = operador1 * operador2;  
            }               
        } catch (Exception e) {
            System.out.println("Error al procesar la operacion " + e.getMessage());
        }
    
        return resultado;
    }
    
}

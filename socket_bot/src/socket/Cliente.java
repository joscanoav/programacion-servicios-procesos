/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package socket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author josca
 */
public class Cliente {
    
    static Scanner scannerSTR = new Scanner(System.in);
    
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Socket misocket= new Socket("localhost",9999);
        
        DataOutputStream flujo_salida = new DataOutputStream(misocket.getOutputStream());
        
        System.out.println("Realiza preguntas al bot Jorge");
        String pregunta = scannerSTR.nextLine();
        flujo_salida.writeUTF(pregunta);
        
        DataOutputStream flujo_salida2 = new DataOutputStream(misocket.getOutputStream());
        System.out.println("Realiza otra pregunta al bot de Jorge");
        String pregunta2 = scannerSTR.nextLine();
        flujo_salida.writeUTF(pregunta2);
        
        flujo_salida.close();
        misocket.close();
        
    }  
}

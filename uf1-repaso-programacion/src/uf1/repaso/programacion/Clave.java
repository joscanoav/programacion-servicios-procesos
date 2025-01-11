/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uf1.repaso.programacion;

import java.util.Scanner;

/**
 *
 * @author josca
 */
public class Clave {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Dame un mensaje para encriptar: ");
        String mensaje;
        mensaje = teclado.nextLine();
        
        // PROCESO DE CIFRADO
        char array [] = mensaje.toCharArray(); // Transformamos el mensaje Sring en un vector de caracteres
        for (int i = 0; i < array.length; i++) { // Aplico la clave (intercambio vocales)
            
            if(array[i]=='a')
               array[i]='e';
            else if (array[i]=='e')
                array[i]='i';
            else if (array[i]=='i')
                array[i]='a';
            else if (array[i]=='o')
                array[i]='u';
            else if (array[i]=='u')
                array[i]='o';
        }
        String encriptado = String.valueOf(array); // convierte el vector de caracterres en String
        
        System.out.println("El mensaje encriptado es: " + encriptado);//Mostrar el mensaje encriptado
        
        //PROCESO DESCIFRADO
        
        char arrayD[] = encriptado.toCharArray();
        
        for (int i = 0; i < arrayD.length; i++) { // Aplico la clave
            
            if(arrayD[i]=='e')
               arrayD[i]='a';
            else if (arrayD[i]=='i')
                arrayD[i]='e';
            else if (arrayD[i]=='a')
                arrayD[i]='i';
            else if (arrayD[i]=='u')
                arrayD[i]='o';
            else if (arrayD[i]=='o')
                arrayD[i]='u';
            
        }
        
        String desencriptado = String.valueOf(arrayD);// Convierte el vector en String
        
        System.out.println("El mensaje desencriptado es: " + desencriptado);// Mostrar el mensaje
    
    }
    
}

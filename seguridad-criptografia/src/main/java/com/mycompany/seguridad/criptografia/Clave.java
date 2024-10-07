/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.seguridad.criptografia;

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
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Dame un mensaje para encriptar: ");
        String mensaje;//Variable de tipo String donde esta almacenado el mensaje
        mensaje = teclado.nextLine();
        
        // PROCESO DE CIFRADO
        
        char array[] = mensaje.toCharArray(); // Transformamos el mensaje en un vector de caracteres
        for (int i = 0; i < array.length; i++) { // Aplica la clave (intercambio de vocales)
            if(array[i]=='a')
                array[i]='e';
            else if (array[i] == 'e')
                array[i]='i';
            else if (array[i] == 'i')
                array[i]='a';
            else if (array[i] == 'o')
                array[i]='u';
            else if (array[i] == 'u')
                array[i]='o';            
        }
        String encriptado = String.valueOf(array);// Convierte el vector de caracters en un String
        System.out.println("El mensaje encriptado es: " + encriptado);// Mostraremos el mensaje encriptado
    
        // PROCESO DESCIFRADO
        char arrayD[] = encriptado.toCharArray();
        
                for (int i = 0; i < arrayD.length; i++) { // Aplica la clave 
            if(arrayD[i]=='e')
                arrayD[i]='a';
            else if (arrayD[i] == 'i')
                arrayD[i]='e';
            else if (arrayD[i] == 'a')
                arrayD[i]='i';
            else if (arrayD[i] == 'u')
                arrayD[i]='o';
            else if (arrayD[i] == 'o')
                arrayD[i]='u'; 
        }
            String desencriptado = String.valueOf(arrayD); //Convierte el vector en String
                    System.out.println("El mensaje desencriptado es: " + desencriptado);// Muestro el mensaje descifrado
        
    }
    
}

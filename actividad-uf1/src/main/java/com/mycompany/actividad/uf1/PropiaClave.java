/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.actividad.uf1;
import java.util.Scanner;

/**
 *
 * @author josca
 */
public class PropiaClave {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el texto a cifrar: ");
        String texto = sc.nextLine();

        System.out.println("Introduce la clave numerica para el cifrado: ");
        int clave = sc.nextInt();
        
        // Mostramos el texto original
        System.out.println("Texto original: " + texto);

        // Ciframos el texto
        String textoCifrado = cifrar(texto, clave);
        System.out.println("Texto cifrado: " + textoCifrado);

        // Desciframos el texto
        String textoDescifrado = descifrar(textoCifrado, clave);
        System.out.println("Texto descifrado: " + textoDescifrado);
    }
    
// Función para cifrar un texto
    public static String cifrar(String texto, int clave) {
        String textoCifrado = ""; // Inicializamos una cadena vacía para almacenar el texto cifrado
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            int ascii = (int) caracter; // Convertimos el carácter a su valor ASCII
            ascii += clave; // Sumamos la clave
            textoCifrado += (char) ascii; // Convertimos de nuevo a carácter y concatenamos
        }
        return textoCifrado;
    }

    // Función para descifrar un texto
    public static String descifrar(String textoCifrado, int clave) {
        String textoDescifrado = ""; // Inicializamos una cadena vacía para almacenar el texto cifrado
        for (int i = 0; i < textoCifrado.length(); i++) {
            char caracter = textoCifrado.charAt(i);
            int ascii = (int) caracter; // Convertimos el carácter cifrado a su valor ASCII
            ascii -= clave; // Restamos la clave
            textoDescifrado += (char) ascii; // Convertimos de nuevo a carácter y concatenamos
        }
        return textoDescifrado;
    }
    
}

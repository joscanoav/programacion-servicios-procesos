/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.repaso.java;

/**
 *
 * @author josca
 */
public class Cadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // las string en java son objetos
    // Declaracion de una cadena
    String str = new String("Hola");
    String str2 = "jorge";
    String str3 ="";
    
    // Metodos sobre cadenas
    
        System.out.println("Hola Mundo".length());
    
        System.out.println("El tamaña de mi cadena es:"+str.length());
        System.out.println("El caracter de la posicion 3:" +str.charAt(3));
        System.out.println("La subcadena desde 2 es: " + str.substring(2));
        System.out.println("La union de dos cadenas es :k   "+str.concat(str2));
    
    }
    
}

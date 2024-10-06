/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.repaso.java;

import java.util.Scanner;

/**
 *
 * @author josca
 */
public class LeerCadenasOperar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String cadena1,cadena2;
        System.out.println("Dame una cadena");
        cadena1=teclado.nextLine();//cadena con caracteres en blanco
        System.out.println(cadena1);
        System.out.println("Dame una cadena");
        cadena2=teclado.next();// cadena hasta blanco
        System.out.println(cadena2);
        //if(cadena1=cadena2) - siempre se compara == mejor usa equals
        
        if(cadena1.equals(cadena2)){
            System.out.println("Son la misma cadena");
        }
        
    }
    
}

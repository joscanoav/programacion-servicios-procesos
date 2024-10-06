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
public class ErrorCadenas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int edad1;
        String apenom2;
        
        // Error siempre que llamamemos al next int y luego al next line
        // el intro lo almaceno en la segunda variable automaticamente
        System.out.println("Ingrese edad : ");
        edad1=teclado.nextInt();
        System.out.println("Ingrese el apellido y el nombre");
        //vaciar el buffer
        teclado.nextLine();// con este se elimina el intro del nextInt.
        apenom2=teclado.nextLine();
        
        
    }
    
}

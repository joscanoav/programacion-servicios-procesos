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
public class LecturaDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        String s;
        int a;
        float b;
        
        System.out.println("Bienvenido");        
        System.out.println("Dame una cadena: "); // Muestra una cadena
        s = in.nextLine();
        System.out.println("Usted ingrese una cadena: " +s);
        
        System.out.println("Dame un nume entero: ");
        a = in.nextInt();
        System.out.println("Usted ingreso un numero: " +a);
        
        System.out.println("Dame un decimal: ");
        b = in.nextFloat();
        System.out.println("Usted ingreso un float: " +b);
        
    }
    
}

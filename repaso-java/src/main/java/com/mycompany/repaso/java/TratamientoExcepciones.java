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
public class TratamientoExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int x;
        System.out.println("Dame un numero: ");
        
        try {
            x = teclado.nextInt();
            System.out.println(x);
        } catch (Exception e) {
            System.out.println("Error");
        }
        
        finally{
            System.out.println("Fin del programa");
        }
        
    }
    
}

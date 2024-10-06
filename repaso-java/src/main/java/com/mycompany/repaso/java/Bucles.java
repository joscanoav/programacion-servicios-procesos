/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.repaso.java;

/**
 *
 * @author josca
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x=1;
        while (x<=4)//evalua la condicion
        {
            // Si la condicion es verdadera
            System.out.println("Valor de x: " + x);
            x++;
        }
        // si la condicion es falsa, sale del bucle
        System.out.println("Fin de Bucle while");
        //-----------------------------------------------
        //condicion inicio, condicion de prueba, incre, 0 decremento
        
        for (int i = 1; i <= 4; i++) {
            System.out.println("Valor de i: " +i);
            
        }
        System.out.println("Fin del bucle for");
        
    }
    
}

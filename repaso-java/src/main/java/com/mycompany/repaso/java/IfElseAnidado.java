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
public class IfElseAnidado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a;
        System.out.println("Dame un numero entero");
        a = teclado.nextInt();
        System.out.println("Usted ingreso un entero:"+a);
        if (a>10){
            System.out.println("Es mayor a 10 ");
            if(a<20){
                System.out.println("Es menor a 20");
            }
            else{
                System.out.println("Es mayor que 20");
            }
        }
        else{
            System.out.println("Es menor de 10");
        }
    }
    
}

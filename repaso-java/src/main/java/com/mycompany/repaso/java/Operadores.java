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
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Activo Scanner para poder leer de teclado
        Scanner teclado = new Scanner(System.in);
        int a;
        
        System.out.println("Dame un numero entero");
        a = teclado.nextInt();
        System.out.println("Usted ingreso un entero: "+a);
        // operador unario mas
        a++;
        System.out.println("Despues del ++ ahpra su numero es: " +a);
        //operador unario menos
        a--;
        System.out.println("Desoues de -- ahora su numero es: " +a);
        // operador de asignacion +
        
        a+=5; // a=a+5
        System.out.println("Despues de a+=5 ahora su numero: " +a);
        // operador de asingacion - 
        a-=3; // a=a-5
        System.out.println("Despues de a -=3 ahora su numero es : " +a);
        
        int b=7;
        
        // Operadores logicos
        // &&, AND logico: devuelve verdadero cuando ambas condiciones son verdaderas
        // ||, 0 logico: devuelve verdero si al menos una condicion es verdadera.
        
        if (b>0 && b<10 ){
            System.out.println("b esta entre 0 y 10");
        }
        
        if ( b==0 || b == 7){
            System.out.println("b es 0 o 7");
        
        }
        
    }
    
}

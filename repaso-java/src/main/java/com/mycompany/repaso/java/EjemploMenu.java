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
public class EjemploMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        boolean salir = false;
        int opcion; // Guardaremos la opcion del usuario
        
        while(!salir){
            System.out.println("1.opcion 1");
            System.out.println("2.opcion 2");
            System.out.println("3.opcion 3");
            System.out.println("4.salir");
            
            System.out.println("Escribe una de las opciones");
            opcion = teclado.nextInt();
            
            if(opcion==1){
                System.out.println("Has escogido la opcion 1");
                // Aqui iria el codigo del programa si escoge la opcion 1
            }
            if (opcion==2){
                System.out.println("Has escogido la opcion 2");

            }
            if (opcion==3){
                System.out.println("Has escogido la opcion 3");
            }
            
            if (opcion==4){
                System.out.println("Adios");
                salir = true;
            }
            
        }
        
    }
    
}

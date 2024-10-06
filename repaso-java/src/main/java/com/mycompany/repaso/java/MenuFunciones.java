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
public class MenuFunciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion=0;
        Scanner teclado = new Scanner(System.in);
        
       while (opcion<4){
           mostrarMenu();
           System.out.println("\nIntroduzca opcion (1-4): ");
           opcion = teclado.nextInt();
           
           if (opcion==1){
               System.out.println("Has escogido la opcion 1");
               numerosDelUnoAlDiez();
           }
           else if (opcion==2){
               System.out.println("Has escogido la opcion 2");
               tablaDel8();
           }
           
           else if (opcion==3){
               System.out.println("Has escogido la opcion 3");
               potenciaDe2();
           }
           
           else{
               System.out.println("Has escogido la opcion salir");
           }
           
       }

    }
    
    private static void mostrarMenu(){
        System.out.println("\n>>> MENU DE OPCIONES <<<");
        System.out.println("\n1. Numero del 1 al 10.");
        System.out.println("\n2. Tabla de multiplicar del 8");
        System.out.println("\n3. Primera diez potencias de 2");
        System.out.println("\n4. o superior.Salir");

    }
    
    private static void numerosDelUnoAlDiez(){
    
        int numero;
        System.out.println("MUESTRO LOS NUMEROS DEL 1 AL 10: ");
        for (numero = 1; numero <= 10; numero++) {
            System.out.printf("%d", numero);
            System.out.println("\n");
            
        }
    }
    
    
    private static void tablaDel8(){
        int contador, resultado;
        System.out.println("MUESTRO LA TABLA DEL 8");
        for (contador = 1; contador <= 10; contador++)
        {
            resultado = contador *8;
            System.out.printf("8 * %d = %d\n", contador, resultado);  
        }
    }
    
    private static void potenciaDe2(){
        int contador;
        System.out.println("MUESTRO LAS POTENCIAS DE DOS");
        for (contador = 1; contador <= 10; contador++) {
            System.out.printf("%d" , (int) Math.pow(2,contador));
            System.out.printf("\n");
            
        }
    }
    
}

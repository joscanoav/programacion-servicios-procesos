/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.repaso.java;

/**
 *
 * @author josca
 */
public class Procedimiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Mi primer programa con un procedimiento");
        procedimiento();
        procedimiento2();
        System.out.println("Adios");

    }
    // procedimiento es igual que una funcion pero no devuelve nada
    //En tu código, el método procedimiento() y procedimiento2() son
    //procedimientos porque tienen el tipo de retorno void. Esto significa 
    //que ejecutan instrucciones, pero no devuelven ningún valor que pueda ser
    //utilizado por el método main() o por otros métodos.
    
    public static void procedimiento(){
        System.out.println("hola Mundo !!!");
    }
    
        public static void procedimiento2(){
        System.out.println("hola Mundo !!!");
    }
    
}

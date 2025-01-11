/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uf2.repaso.programacion;

/**
 *
 * @author josca
 */
    
// Crea un hilo implementado Runnable
// Los objetos de MiHilo se pueden ejecutar en sus propios hilos
// porque MiHilo implementa Runnable

public class MiHilo implements Runnable {
    
    String nombreHilo;
    
    MiHilo(String nombre){
        nombreHilo=nombre;
    }
    // Punto de entrada del hilo
    // Los hilos comienzan a ejecutarse aqui, codigo que se ejecutara simultaneamente
    
    public void run(){
        System.out.println("Comenzando " + nombreHilo);
        try{
            for (int contar=0; contar< 10; contar++) {
                Thread.sleep(400);
                System.out.println("Soy hilo " + nombreHilo + ", y cuento "+contar);
            }
        }catch(InterruptedException exc){
            System.out.println(nombreHilo + "Interrumpido.");
        }
    }
    
}

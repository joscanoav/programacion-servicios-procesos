/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package procesos.hilos;

/**
 *
 * @author josca
 */
public class Hilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hilo principal iniciando.");
        //Primero, construye un objeto MiHilo
        MiHilo mh=new MiHilo("#1");
        MiHilo mh2=new MiHilo("#2");
        // Luego, construye un hilo de ese objeto.
        Thread nuevoh= new Thread(mh);
        Thread nuevoh2= new Thread(mh2);
        
        // Finalmente, comienza la ejecucion de los hilos
        nuevoh.start();
        nuevoh2.start();

    }
    
}

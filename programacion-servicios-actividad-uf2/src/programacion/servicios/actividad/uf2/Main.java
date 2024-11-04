/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacion.servicios.actividad.uf2;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author josca
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
    
    Vehiculos tarea1 = new Vehiculos("Coche1", 5);
    Vehiculos tarea2 = new Vehiculos("Coche2", 1);
    
    Thread t1 = new Thread(tarea1);
    System.out.println("Sale el coche1");
        t1.start();
        
    Thread t2 = new Thread(tarea2);
    System.out.println("Sale el coche2");
        t2.start();    
    
        t1.join();
        t2.join();
    
    }
    
}

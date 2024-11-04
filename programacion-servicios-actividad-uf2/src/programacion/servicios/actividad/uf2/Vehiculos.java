/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.servicios.actividad.uf2;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josca
 */class Vehiculos implements Runnable {
    private String name;
    private int kilometros;

    public Vehiculos(String name, int kilometros) {
        this.name = name;
        this.kilometros = kilometros;
    }
    
    public void run(){
        try {
            if(name.equals(("Coche"))){
                Thread.sleep(kilometros*1000);
                System.out.println("El   "+name+" ha recorrido " +kilometros +" kilometros");
            }
            
            if(name.equals(("Coche2"))){
                Thread.sleep(kilometros*1000);
                System.out.println("El   "+name+" ha recorrido " +kilometros +" kilometros");
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Vehiculos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}

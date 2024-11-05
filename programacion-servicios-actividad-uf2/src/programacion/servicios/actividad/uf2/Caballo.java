/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacion.servicios.actividad.uf2;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author josca
 */
public class Caballo implements Runnable {
 private String nombre;
    private int tiempo;
    private int longitudPista;
    private int posicion = 0;

    public Caballo(String nombre, int tiempo, int longitudPista) {
        this.nombre = nombre;
        this.tiempo = tiempo;
        this.longitudPista = longitudPista;
    }

    public void run() {
        Random random = new Random();

        while (posicion < longitudPista) {
            try {
                // Simular el avance del caballo
                int avance = random.nextInt(3) + 1; // Avanza entre 1 y 3 metros
                posicion += avance;

                // Limitar la posición a la longitud de la pista
                if (posicion > longitudPista) {
                    posicion = longitudPista;
                }

                // Imprimir el avance en pantalla
                mostrarCarrera();

                // Pausa simulando el tiempo que tarda el caballo en avanzar
                Thread.sleep(tiempo * 200); // Cuanto menor el tiempo, más rápido avanza
            } catch (InterruptedException ex) {
                Logger.getLogger(Caballo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        // Imprimir cuando el caballo termina la carrera
        System.out.println("Soy el caballo " + nombre + " y he terminado la carrera en " + tiempo + " segundos.");
    }

    private void mostrarCarrera() {
        StringBuilder pista = new StringBuilder("|");
        for (int i = 0; i < longitudPista; i++) {
            if (i == posicion) {
                pista.append(nombre.charAt(0)); // Representa el caballo con la inicial de su nombre
            } else {
                pista.append(" ");
            }
        }
        pista.append("|");
        System.out.println(pista.toString());
    }

    public String getNombre() {
        return nombre;
    }

    public int getTiempo() {
        return tiempo;
    }

    public int getPosicion() {
        return posicion;
    }
}
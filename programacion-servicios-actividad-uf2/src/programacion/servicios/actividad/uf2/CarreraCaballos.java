/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacion.servicios.actividad.uf2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author josca
 */
public class CarreraCaballos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Configuración inicial de la carrera
        System.out.print("Ingrese la longitud de la pista (en metros): ");
        int longitudPista = scanner.nextInt();
        scanner.nextLine();  // Consumir nueva línea
        
        // Solicitar los nombres de los caballos
        System.out.print("Dame el nombre del caballo 1: ");
        String nombreCaballoA = scanner.nextLine();
        System.out.print("Dame el nombre del caballo 2: ");
        String nombreCaballoB = scanner.nextLine();
        System.out.print("Dame el nombre del caballo 3: ");
        String nombreCaballoC = scanner.nextLine();

        // Crear los objetos de los caballos con tiempos aleatorios
        Caballo caballoA = new Caballo(nombreCaballoA, random.nextInt(5) + 1, longitudPista);
        Caballo caballoB = new Caballo(nombreCaballoB, random.nextInt(5) + 1, longitudPista);
        Caballo caballoC = new Caballo(nombreCaballoC, random.nextInt(5) + 1, longitudPista);

        // Crear e iniciar los hilos
        Thread t1 = new Thread(caballoA);
        Thread t2 = new Thread(caballoB);
        Thread t3 = new Thread(caballoC);

        System.out.println(" Empieza la carrera...");
        t1.start();
        t2.start();
        t3.start();

        // Esperar a que todos los caballos terminen
        t1.join();
        t2.join();
        t3.join();

        // Determinar el caballo ganador
        Caballo ganador = caballoA;
        if (caballoB.getTiempo() < ganador.getTiempo()) {
            ganador = caballoB;
        }
        if (caballoC.getTiempo() < ganador.getTiempo()) {
            ganador = caballoC;
        }

        System.out.println("La carrera ha terminado.");
        System.out.println("El ganador ha sido " + ganador.getNombre() + " con un tiempo de " + ganador.getTiempo() + " segundos.");

        // Cerrar el scanner
        scanner.close();
    }
}

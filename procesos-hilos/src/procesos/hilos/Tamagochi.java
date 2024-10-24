/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package procesos.hilos;

import java.util.Scanner;

/**
 *
 * @author josca
 */
public class Tamagochi {
    static Scanner EscanerINT = new Scanner (System.in);
    static Scanner EcanerSTR = new Scanner (System.in);
    
    static TareasRey Rey;
    static TareasEsclavo Esclavo;
    
    public static void main(String[] args) {
        String Nombre;
        int Edad, Tarea;
        System.out.println("--Crea las Mascotas---");
        crearREY();
        crearESCLAVO();
        
        Thread tREY = new Thread(Rey);
        Thread tESCLAVO = new Thread(Esclavo);
        tRey.start();
    }
    
}

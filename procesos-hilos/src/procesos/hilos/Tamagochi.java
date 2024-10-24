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
    
    public static void crearREY(){
        String Nombre;
        int Edad, Tarea;
        
        System.out.println("---------REY--------");
        System.out.println("Nombre: ");
        Nombre = EcanerSTR.nextLine();
        System.out.println("Edad: ");
        Edad = EscanerINT.nextInt();
        System.out.println("Tareas: ");
        System.out.println("1-Comer");
        System.out.println("2-Dormir");
        System.out.println("3-Jugar");
        Tarea = EscanerINT.nextInt();
        
        switch(Tarea){
            case 1:
                Rey = new TareasRey(Nombre,Edad,"Comer");
                break;
            case 2:
                Rey = new TareasRey(Nombre,Edad,"Dormir");
                break;
            case 3:
                Rey = new TareasRey(Nombre, Edad, "Jugar");
                break;
            default:
                System.out.println("OPCION NO VALIDAD");
                break;
        }
              
    }
    
    public static void crearESCLAVO(){
        String Nombre;
        int Edad, Tarea;
        
        System.out.println("---------ESCLAVO--------");
        System.out.println("Nombre: ");
        Nombre = EcanerSTR.nextLine();
        System.out.println("Edad: ");
        Edad = EscanerINT.nextInt();
        System.out.println("Tareas: ");
        System.out.println("1-Comer");
        System.out.println("2-Dormir");
        System.out.println("3-Servir");
        Tarea = EscanerINT.nextInt();
        
        switch(Tarea){
            case 1:
                Esclavo = new TareasEsclavo(Nombre,Edad,"Comer");
                break;
            case 2:
                Esclavo = new TareasEsclavo(Nombre,Edad,"Dormir");
                break;
            case 3:
                Esclavo = new TareasEsclavo(Nombre, Edad, "Servir");
                break;
            default:
                System.out.println("OPCION NO VALIDAD");
                break;
        }
    }
    
}

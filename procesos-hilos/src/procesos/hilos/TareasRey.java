/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procesos.hilos;

/**
 *
 * @author josca
 */
public class TareasRey  extends Personaje implements Runnable{
    private String Tarea;

    public TareasRey(String Nombre, int Edad, String Tarea) {
        super(Nombre, Edad);
        this.Tarea = Tarea;
        this.setCargo("Rey");
    }
    
    @Override
    public void run(){
        try {
            switch(Tarea){
                case "Comer":
                        System.out.println("Soy "+this.getNombre()+" y empiezo a comer");
                        Thread.sleep(((int)(Math.random()*10))*1000);
                        System.out.println("Soy "+this.getNombre()+ " estoy comiendo");
                        Thread.sleep(((int)(Math.random()*10))*1000);
                        System.out.println("Soy "+this.getNombre()+ " y ya he comido");
                        break;
                case "Dormir":
                        System.out.println("Soy "+this.getNombre()+" y empiezo a dormir");
                        Thread.sleep(((int)(Math.random()*10))*1000);
                        System.out.println("Soy "+this.getNombre()+ " estoy durmiendo");
                        Thread.sleep(((int)(Math.random()*10))*1000);
                        System.out.println("Soy "+this.getNombre()+ " y ya he dormido");
                        break;
                case "Servir":
                        System.out.println("Soy "+this.getNombre()+" y empiezo a jugar");
                        Thread.sleep(((int)(Math.random()*10))*1000);
                        System.out.println("Soy "+this.getNombre()+ " estoy jugando");
                        Thread.sleep(((int)(Math.random()*10))*1000);
                        System.out.println("Soy "+this.getNombre()+ " y ya he jugado");
                        break;
            }
        } catch (Exception e) {
                e.getCause();
        }
    }
    
    
}

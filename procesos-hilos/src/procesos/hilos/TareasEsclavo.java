/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package procesos.hilos;

/**
 *
 * @author josca
 */
public class TareasEsclavo extends Personaje implements Runnable{
    private String Tarea;

    public TareasEsclavo(String Nombre, int Edad, String Tarea) {
        super(Nombre, Edad);
        this.Tarea = Tarea;
    }
    
    @Override
    public void run(){
        try {
            switch(Tarea){
                case "Comer":
                        System.out.println("Soy "+this.getNombre()+" y empiezo a comer");
                        Thread.sleep(((int)(Math.random()*10))*1000);
                        System.out.println("Soy "+this.getNombre()+ "estoy comiendo");
                        Thread.sleep(((int)(Math.random()*10))*1000);
                        System.out.println("Soy "+this.getNombre()+ " y ya he comido");
                        break;
                case "Dormir":
                        System.out.println("Soy "+this.getNombre()+" y empiezo a dormir");
                        Thread.sleep(((int)(Math.random()*10))*1000);
                        System.out.println("Soy "+this.getNombre()+ "estoy durmiendo");
                        Thread.sleep(((int)(Math.random()*10))*1000);
                        System.out.println("Soy "+this.getNombre()+ " y ya he dormido");
                        break;
                case "Servir":
                        System.out.println("Soy "+this.getNombre()+" y empiezo a servir");
                        Thread.sleep(((int)(Math.random()*10))*1000);
                        System.out.println("Soy "+this.getNombre()+ "estoy serviendo");
                        Thread.sleep(((int)(Math.random()*10))*1000);
                        System.out.println("Soy "+this.getNombre()+ " y ya he servido");
                        break;
            }
        } catch (Exception e) {
                e.getCause();
        }
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import misbeans.GeneraAnalisis;
import misbeans.Paciente;

/**
 *
 * @author josca
 */
public class Hospital {
    public static void main(String[] args) {
        // Crear un paciente con un nivel inicial de hierro
        Paciente paciente1 = new Paciente("Joe", "Pris", 30,2656569, 630009, 10); // 10 es el nivel inicial de hierro
        
        // Crear un análisis para el paciente
        GeneraAnalisis analisis1 = new GeneraAnalisis();
        analisis1.setPaciente(paciente1);

        // Asociar el paciente con un PropertyChangeListener que reaccione cuando el nivel de hierro cambie
        paciente1.addPropertyChangeListener(evt -> {
            // Verificar si el nivel de hierro ha cambiado
            if ("ultimo_hierro".equals(evt.getPropertyName())) {
                int nuevoHierro = (int) evt.getNewValue();
                // Si el nivel de hierro es mayor a 10, generar otro análisis
                if (nuevoHierro > 10) {
                    System.out.println("Nivel de hierro alto: " + nuevoHierro + ". Se debe realizar otro analisis.");
                }
            }
        });

        // Cambiar el nivel de hierro del paciente a 12 (esto activará el evento y disparará el mensaje)
        paciente1.setUltimo_hierro(11); // Esto indica que se debe realizar otro análisis.
    }
}

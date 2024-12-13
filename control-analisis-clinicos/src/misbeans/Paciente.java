/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misbeans;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author josca
 */
/**
 * Clase que representa a un paciente en el sistema hospitalario.
 * Incluye información personal y los resultados de los últimos análisis.
 */
public class Paciente implements Serializable {

    private String Nombre;
    private String Apellido;
    private int Edad;
    private int Telefono;
    private int ultimo_hierro;
    private int ultimo_urea;
    private PropertyChangeSupport propertySupport;

    public Paciente() {
        propertySupport = new PropertyChangeSupport(this);
    }

    public Paciente(String Nombre, String Apellido, int Edad, int Telefono, int ultimo_hierro, int ultimo_urea) {
        this();
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Edad = Edad;
        this.Telefono = Telefono;
        this.ultimo_hierro = ultimo_hierro;
        this.ultimo_urea = ultimo_urea;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public int getUltimo_hierro() {
        return ultimo_hierro;
    }

    public void setUltimo_hierro(int ultimo_hierro) {
        int oldValue = this.ultimo_hierro;
        this.ultimo_hierro = ultimo_hierro;
        // Emitir evento cuando el nivel de hierro cambia
        propertySupport.firePropertyChange("ultimo_hierro", oldValue, ultimo_hierro);
    }

    public int getUltimo_urea() {
        return ultimo_urea;
    }

    public void setUltimo_urea(int ultimo_urea) {
        this.ultimo_urea = ultimo_urea;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
}

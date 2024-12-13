/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misbeans;

import java.beans.*;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author josca
 */
/**
 * Clase que representa un análisis clínico generado para un paciente.
 * Escucha los cambios en los niveles del paciente y los gestiona.
 */
public class GeneraAnalisis implements Serializable {

    private int num_analisis;
    private Paciente paciente;
    private Date fecha;
    private int analisis_pendiente;
    private PropertyChangeSupport propertySupport;

    public GeneraAnalisis() {
        propertySupport = new PropertyChangeSupport(this);
    }

    public int getNum_analisis() {
        return num_analisis;
    }

    public void setNum_analisis(int num_analisis) {
        this.num_analisis = num_analisis;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getAnalisis_pendiente() {
        return analisis_pendiente;
    }

    public void setAnalisis_pendiente(int analisis_pendiente) {
        int oldValue = this.analisis_pendiente;
        this.analisis_pendiente = analisis_pendiente;
        // Emitir el evento de cambio en el análisis pendiente
        propertySupport.firePropertyChange("analisis_pendiente", oldValue, analisis_pendiente);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }

}
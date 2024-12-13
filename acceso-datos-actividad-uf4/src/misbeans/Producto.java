/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package misbeans;

import java.io.Serializable;
import java.beans.*;

/**
 *
 * @author josca
 */
public class Producto implements Serializable { // EJE fuente --> Quien genera el evento (la alerta)
// si a un producto se queda sin stock (propiedad stockactual), genera la alerta

    private String descripcion;
    private int idproducto;
    private int stockactual;
    private int stockminimo;
    private float pvp;

    private PropertyChangeSupport propertySupport;

    public Producto() {
        propertySupport = new PropertyChangeSupport(this);
    }

    public Producto(int idproducto, String descripcion,
            int stockactual, int stockminimo, float pvp) {
        propertySupport = new PropertyChangeSupport(this);
        this.idproducto = idproducto;
        this.descripcion = descripcion;
        this.stockactual = stockactual;
        this.stockminimo = stockminimo;
        this.pvp = pvp;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public int getStockactual() {
        return stockactual;
    }

    public void setStockactual(int valorNuevo) {
        int valorAnterior = this.stockactual;
        this.stockactual = valorNuevo;

        if (this.stockactual < getStockminimo()) //hay que realizar pedido
        {
            propertySupport.firePropertyChange("stockactual",
                    valorAnterior, this.stockactual);
            //dejamos el stock anterior, no actualizamos
            this.stockactual = valorAnterior;

        }

    }

    public int getStockminimo() {
        return stockminimo;
    }

    public void setStockminimo(int stockminimo) {
        this.stockminimo = stockminimo;
    }

    public float getPvp() {
        return pvp;
    }

    public void setPvp(float pvp) {
        this.pvp = pvp;
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
 
}

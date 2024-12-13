/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.libreria;

import misbeans.Pedido;
import misbeans.Producto;
/**
 *
 * @author josca
 */
public class PruebaLibreria {
    public static void main (String[] args){
    Producto producto = new Producto
            (1,"Zapatillas nike",10, 3, 90);
    Pedido pedido = new Pedido();
    pedido.setProducto(producto);
    
    producto.addPropertyChangeListener(pedido);
    // cambiamos el stock actual le damos valor 2 -- anterior es10
    producto.setStockactual(2);
    
    }
}

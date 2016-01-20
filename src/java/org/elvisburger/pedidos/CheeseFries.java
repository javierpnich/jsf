/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.elvisburger.pedidos;

/**
 *
 * @author david
 */
public class CheeseFries  implements YoTambien, ItemPedido {
    private static final String descripcion = "Chesse Fries: con queso cheddar y bacon.";
    private static final double precio = 3.0;

    public void descripcion(){
        System.out.println(CheeseFries.descripcion);
    }

    public double precio(){
        return CheeseFries.precio;
    }

    public Object yotambien(){
        return (Object)new CheeseFries();
    }
}

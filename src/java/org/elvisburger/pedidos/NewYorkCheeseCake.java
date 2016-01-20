/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.elvisburger.pedidos;

/**
 *
 * @author david
 */
public class NewYorkCheeseCake implements ItemPedido {
    private static final String descripcion = "New York cheese cake: la original a la vuelta de la esquina.";
    private static final double precio = 4.95;

    public void descripcion(){
        System.out.println(NewYorkCheeseCake.descripcion);
    }

    public double precio(){
        return NewYorkCheeseCake.precio;
    }

    public Object yotambien() {
        return (Object) new NewYorkCheeseCake();
    }

}

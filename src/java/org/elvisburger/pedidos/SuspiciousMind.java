/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.elvisburger.pedidos;

/**
 *
 * @author david
 */
public class SuspiciousMind implements ItemPedido {
    private static final String descripcion = "Suspicious Mind: maravillos hamburguesa, también e ¼ de libra, con cebolla a la plancha, bacon y queso.";
    private static final double precio = 5.5;

    public void descripcion(){
        System.out.println(SuspiciousMind.descripcion);
    }

    public double precio(){
        return SuspiciousMind.precio;
    }

    public Object yotambien() {
        return (Object) new SuspiciousMind();
    }

}

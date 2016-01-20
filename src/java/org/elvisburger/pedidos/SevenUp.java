/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.elvisburger.pedidos;

/**
 *
 * @author david
 */
public class SevenUp implements Refresco {
    private static final String descripcion = "Seven-Up.";
    private static final double precio = 2.0;

    public void descripcion(){
        System.out.println(SevenUp.descripcion);
    }

    public double precio(){
        return SevenUp.precio;
    }

    public Object yotambien() {
        return (Object) new SevenUp();
    }

}

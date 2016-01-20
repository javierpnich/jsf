/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.elvisburger.pedidos;

/**
 *
 * @author david
 */
public class CocaCola implements YoTambien, Refresco {
    private static final String descripcion = "Coca-Cola.";
    private static final double precio = 2.0;

    public void descripcion(){
        System.out.println(CocaCola.descripcion);
    }

    public double precio(){
        return CocaCola.precio;
    }

    public Object yotambien(){
        return (Object)new CocaCola();
    }

}

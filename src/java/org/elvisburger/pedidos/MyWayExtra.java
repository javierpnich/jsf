/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.elvisburger.pedidos;

/**
 *
 * @author david
 */
public abstract class MyWayExtra implements MyWay {
    MyWay ingredientes;

    public MyWayExtra(MyWay i){
        this.ingredientes = i;
    };

    abstract public double precio();

    abstract public void descripcion();
}

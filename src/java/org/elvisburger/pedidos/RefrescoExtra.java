/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.elvisburger.pedidos;

/**
 *
 * @author david
 */
public abstract class RefrescoExtra implements Refresco {
    Refresco refresco;

    public RefrescoExtra(Refresco r){
        this.refresco = r;
    };

    abstract public double precio();

    abstract public void descripcion();
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.elvisburger.pedidos;

/**
 *
 * @author david
 */
public class Refill extends RefrescoExtra {
    private static final String descripcion = "...refill de";
    private static final double precio = 2.0;

    public Refill(Refresco r){
        super(r);
        if (r instanceof Refill){
            this.refresco = ((Refill)r).refresco;
        } else {
            this.refresco = r;
        }
    }

    public void descripcion(){
        System.out.print(Refill.descripcion);
        this.refresco.descripcion();
    }

    public double precio(){
        return Refill.precio + this.refresco.precio();
    }

    public Object yotambien() {
        return (Object) new Refill((Refresco) this.refresco.yotambien());
    }

}

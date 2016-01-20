/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.elvisburger.pedidos;

/**
 *
 * @author david
 */
public class MyWayRelish extends MyWayExtra  {
    private static final String descripcion = "...relish";
    private static final double precio = 0.5;

    public MyWayRelish(MyWay m){
        super(m);
    }

    public void descripcion(){
        System.out.print(MyWayRelish.descripcion);
        this.ingredientes.descripcion();
    }

    public double precio(){
        return MyWayRelish.precio+this.ingredientes.precio();
    }

    public Object yotambien() {
        return (Object) new MyWayRelish((MyWay) this.ingredientes.yotambien());
    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.elvisburger.pedidos;

/**
 *
 * @author david
 */
public class MyWayBacon extends MyWayExtra {
    private static final String descripcion = "...dos deliciosas lonchas de bacón";
    private static final double precio = 0.5;

    public MyWayBacon(MyWay m){
        super(m);
    }

    public void descripcion(){
        System.out.print(MyWayBacon.descripcion);
        this.ingredientes.descripcion();
    }

    public double precio(){
        return MyWayBacon.precio+this.ingredientes.precio();
    }

    public Object yotambien(){
        return (Object)new MyWayBacon((MyWay) this.ingredientes.yotambien());
    }

}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.elvisburger.pedidos;

/**
 *
 * @author david
 */
public class MyWayCheddar extends MyWayExtra  {
    private static final String descripcion = "...deliciosa loncha de queso cheddar";
    private static final double precio = 0.5;

    public MyWayCheddar(MyWay m){
        super(m);
    }

    public void descripcion(){
        System.out.print(MyWayCheddar.descripcion);
        this.ingredientes.descripcion();
    }

    public double precio(){
        return MyWayCheddar.precio+this.ingredientes.precio();
    }

    public Object yotambien() {
        return (Object) new MyWayCheddar((MyWay) this.ingredientes.yotambien());
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.elvisburger.pedidos;

/**
 *
 * @author david
 */
public class MyWayBasica implements MyWay {
    private static final String descripcion = "...y todo sobre la base MyWay: incredible hamburguesa de ¼ de libra de primera calidad con lechuga y tomate e ingredientes a escoger entre: cebolla a la plancha, cebolla cruda, relish (salsa de pepinillo dulce picado), bacon, queso cheddar, queso azul, huevo y pepinillo crudo.";
    private static final double precio = 4.0;

    public void descripcion(){
        System.out.print(MyWayBasica.descripcion);
    }

    public double precio(){
        return MyWayBasica.precio;
    }

    public Object yotambien(){
        return (Object)new MyWayBasica();
    }

}

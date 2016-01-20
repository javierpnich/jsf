/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.elvisburger.pedidos;

/**
 *
 * @author david
 */
public class AmericanTrilogy extends Menu {
    private static final String descripcion = "American Trilogy: hamburguesa Great Pretender, cheese fries y Coca-Cola.";
    private static final double precio = 11.0;

    public AmericanTrilogy(){
        super(new SuspiciousMind(),new CocaCola(),new CheeseFries());
    }

    public void descripcion(){
        System.out.println(AmericanTrilogy.descripcion);
    }
    
    public double precio(){
        return AmericanTrilogy.precio;
    }

    public Object yotambien() {
        return (Object) new AmericanTrilogy();
    }

}

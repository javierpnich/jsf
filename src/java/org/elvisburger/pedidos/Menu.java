/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.elvisburger.pedidos;

/**
 *
 * @author david
 */
public abstract class Menu implements YoTambien, ItemPedido {
    ItemPedido i1;
    ItemPedido i2;
    ItemPedido i3;

    public Menu(ItemPedido j1,ItemPedido j2,ItemPedido j3){
        this.i1 = j1;
        this.i2 = j2;
        this.i3 = j3;
    }
    
    public abstract void descripcion();

    public abstract double precio();

}

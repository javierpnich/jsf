/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.elvisburger.pedidos;

import java.util.Vector;
import java.util.Iterator;

/**
 *
 * @author david
 */
public class Pedido implements ItemPedido {
    private Vector vPedido;

    public Pedido(){
        this.vPedido = new Vector();
    }

    public void annadir(ItemPedido i){
        i.descripcion();
        this.vPedido.add(i);
    }

    public void quitar(ItemPedido i){
        this.vPedido.remove(i);
    }

    public Iterator iterador(){
        return this.vPedido.iterator();
    }
    
    public void descripcion(){
        System.out.print("Pedido");
        for(int i = 0; i < this.vPedido.size(); i++){
            ((ItemPedido) this.vPedido.get(i)).descripcion();
        }
    }

    public double precio(){
        double p = 0.0;
        for(int i = 0; i < this.vPedido.size(); i++){
            p += ((ItemPedido) this.vPedido.get(i)).precio();
        }
        return p;
    }

    public Object yotambien() {
        Pedido p = new Pedido();
        for(int i = 0; i < this.vPedido.size(); i++){
            p.annadir((ItemPedido) ((ItemPedido) this.vPedido.get(i)).yotambien());
        }

        return (Object) p;
    }

}

package org.elvisburger.comedor;


public class EsperaPedido implements EstadoMesa {
    final String sNombre = " esperando el pedido";


    public EsperaPedido () {
    }

    public EstadoMesa siguienteEstado() {
        return new Comiendo();
    }

     public String obtenNombre(){
        return this.sNombre;
     }

}


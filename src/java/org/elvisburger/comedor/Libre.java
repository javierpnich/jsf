package org.elvisburger.comedor;

public class Libre implements EstadoMesa {
    final String sNombre = " libre";

    public Libre () {
    }

     public EstadoMesa siguienteEstado() {
        return new EsperaPedido();
    }

     public String obtenNombre(){
        return this.sNombre;
     }
}


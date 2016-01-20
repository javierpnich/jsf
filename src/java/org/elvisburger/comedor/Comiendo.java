package org.elvisburger.comedor;


public class Comiendo implements EstadoMesa {
    final String sNombre = " comiendo";

    public Comiendo () {
    }

    public EstadoMesa siguienteEstado() {
        return new EsperaCuenta();
    }

    public String obtenNombre(){
        
        return this.sNombre;

    }

}


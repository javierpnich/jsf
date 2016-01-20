package org.elvisburger.comedor;

public class EsperaCuenta implements EstadoMesa {
    final String sNombre = " esperando la cuenta";

    public EsperaCuenta () {
    }

    public EstadoMesa siguienteEstado() {
        return new Libre();
    }
    public String obtenNombre(){
        return this.sNombre;
    }

}


package org.elvisburger.comedor;

import java.util.Observable;
import java.util.Observer;

public class Mesa extends Observable {
    private EstadoMesa eEstadoMesa;
    private String sNombre;
    private String sOcupante;

    public Mesa (String s) {
        this.eEstadoMesa = new Libre();
        this.sNombre = s;
        this.sOcupante = "";
    }

    public void cambiaEstado () {
        this.eEstadoMesa = this.eEstadoMesa.siguienteEstado();
        setChanged();
        notifyObservers();
    }

    public EstadoMesa obtenEstado(){
        return this.eEstadoMesa;
    }

    public String obtenNombre () {
        return this.sNombre;
    }

    @Override
    public void addObserver(Observer o) {
        super.addObserver(o);
        setChanged();
        notifyObservers();
    }

    public void sienta(String s){
        this.sOcupante = s;
    }

    public void levanta(){
        this.sOcupante = "";
    }

    public String quienEsta() {
        return this.sOcupante;
    }

}


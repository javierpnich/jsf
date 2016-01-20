package org.elvisburger.comedor;

import java.util.Observer;
import java.util.Observable;
import java.util.Vector;


public class Camarero implements Observer {
    private String sNombre;
    private Vector vMesasLibres;
    private Vector vListaEspera;

    public Camarero ( String s) {
        this.sNombre = s;
        this.vMesasLibres = new Vector();
        this.vListaEspera = new Vector();
    }
    
    

    public void update(Observable o, Object arg) {
        if ((((Mesa)o).obtenEstado()) instanceof Libre){
            this.vMesasLibres.add((Mesa)o);
            if (((Mesa)o).quienEsta().compareTo("")!=0) {
                System.out.println("..."+((Mesa)o).quienEsta()+" se levanta(n) de la "+((Mesa)o).obtenNombre()+" y se despide(n) coordialmente.");
                ((Mesa)o).levanta();
            }
            if (!this.vListaEspera.isEmpty()) {
                String s = (String) this.vListaEspera.firstElement();
                ((Mesa)o).sienta(s);
                System.out.println(this.sNombre+": sienta a "+s+" en la "+((Mesa)o).obtenNombre());
                this.vListaEspera.remove(s);
                ((Mesa)o).cambiaEstado();
            } else {
                System.out.println(this.sNombre+": ve que la "+((Mesa)o).obtenNombre()+ " se queda libre");
            }
        } else {
            System.out.println("...En "+((Mesa)o).obtenNombre()+", "+((Mesa)o).quienEsta()+" está(n) "+((Mesa)o).obtenEstado().obtenNombre());
        }
    }

    public void annadeListaEspera(String s) {
        System.out.println(s+": quiere(n) una mesa.");
        if (!vMesasLibres.isEmpty()) {
            Mesa m = (Mesa) this.vMesasLibres.firstElement(); this.vMesasLibres.remove(m);
            System.out.println(this.sNombre+": ofrece la "+m.obtenNombre()+" a "+s+".");
            m.sienta(s);
            m.cambiaEstado();
        } else {
            this.vListaEspera.add(s);
            int delante = this.vListaEspera.size()-1;
            if (delante == 0){
                System.out.println(this.sNombre+" indica que tiene(n) que esperar, no hay mesas libres");
            } else {
                System.out.println(this.sNombre+" indica que tiene(n) que esperar, hay "+delante+" delante.");
            }    
        }
    }

    public String obtenNombre(){
        return sNombre;
    }

    public Vector getvListaEspera() {
        return vListaEspera;
    }

}


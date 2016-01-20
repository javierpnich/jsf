/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.elvisburger.main;

import org.elvisburger.comedor.*;
import org.elvisburger.pedidos.*;

/**
 *
 * @author david
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testComedor();
        testPedido();
    }

    static public void testComedor(){

        Camarero johnny = new Camarero("Johnny");
        Mesa m1 = new Mesa("Mesa 1");
        Mesa m2 = new Mesa("Mesa 2");
        Mesa m3 = new Mesa("Mesa 3");
        Mesa m4 = new Mesa("Mesa 4");

        // Añadimos a Johnny como observador
        m1.addObserver(johnny);
        m2.addObserver(johnny);
        m3.addObserver(johnny);
        m4.addObserver(johnny);

        // Simulamos el asunto
        System.out.println("Empieza a llegar gente...");

        // W. S. Burroughs & J. Kerouac e sientan en Mesa 1 y piden
        johnny.annadeListaEspera("W. S. Burroughs & J. Kerouac");
        // H.G. Wells se sienta en la Mesa 2 y pide
        johnny.annadeListaEspera("H.G. Wells");
        // A. Huxley se sienta en la Mesa 3 y pide
        johnny.annadeListaEspera("A. Huxley");
        // T. Wolfe se sienta en la Mesa 4 y pide
        johnny.annadeListaEspera("T. Wolfe");
        // N. Cassady llega y le toca esperar, eso le pone de mal humor:
        // hay que andarse con cuidado.
        johnny.annadeListaEspera("N. Cassady");
        // A. Ginsberg llega y le toca esperar, se sienta en un rincón a
        // escribir poesía.
        johnny.annadeListaEspera("A. Ginsberg");

        // W. S. Burroughs & J. Kerouac empiezan a devorar su comida
        m1.cambiaEstado();
        // W. S. Burroughs & J. Kerouac han terminado su comida y esperan la cuenta
        // mejor darse prisa, estos tipos se van sin pagar
        m1.cambiaEstado();
        // H.G. Wells empieza a comer
        m2.cambiaEstado();
        // W. S. Burroughs & J. Kerouac han pagado, menos mal
        // N. Cassady ocupa su lugar
        m1.cambiaEstado();
        // T. Wolfe empieza a comer
        m4.cambiaEstado();
        // A. Huxley empieza a comer
        m3.cambiaEstado();
        // H.G. Wells espera la cuenta
        m2.cambiaEstado();
        // T. Wolfe espera la cuenta
        m4.cambiaEstado();
        // A. Huxley termina de comer y espera su cuenta
        m3.cambiaEstado();
        // A. Huxley paga y se marcha en silencio asustado de la parroquia
        // A. Ginsberg ocupa su lugar y empieza a comer
        m3.cambiaEstado();
        // Poco a poco van terminando todos...
        m3.cambiaEstado();
        m3.cambiaEstado();
        m3.cambiaEstado(); // A. Ginsberg
        m1.cambiaEstado();
        m1.cambiaEstado();
        m1.cambiaEstado(); // N. Cassady
        m4.cambiaEstado(); // T. Wolfe
        m2.cambiaEstado(); // H.G. Wells
    }

    static public void testPedido(){

        Pedido p = new Pedido();

        p.annadir(new NewYorkCheeseCake()); // Tarte de queso
        MyWay m = new MyWayRelish(new MyWayCheddar(new MyWayRelish(new MyWayBasica())));
        MyWay m2 = (MyWay) m.yotambien();
        p.annadir(m);
        p.annadir(m2);
    }

}

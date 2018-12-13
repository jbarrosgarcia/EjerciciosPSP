/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7psp;

/**
 *
 * @author jose_
 */
public class Hilo2Metodos extends Thread {

    Buzon buzon;
    boolean leer;
    String mensaje;

    public Hilo2Metodos(String name, Buzon b) {
        super(name);
        buzon = b;
        leer = true;
    }

    public Hilo2Metodos(String name, Buzon b,boolean l) {
        super(name);
        buzon = b;
        leer = l;

    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName()+" inicia la "+i+"ª ejecucion");
            if (leer) {
                buzon.leer();
                
            } else if (!leer) {
                buzon.escribir();
                
            }
            System.out.println(this.getName()+" termina la "+i+"ª ejecucion");
        }
    }

}

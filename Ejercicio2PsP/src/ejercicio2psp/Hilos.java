/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2psp;

/**
 *
 * @author jose_
 */
public class Hilos extends Thread {

    public Hilos(String name) {
        super(name);
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i + " " + this.getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Error: " + ex);
            }
        }
        System.out.println(5 + " " + this.getName());
        System.out.println("Termina thread " + this.getName());
    }

}

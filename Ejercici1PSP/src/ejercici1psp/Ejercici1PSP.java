/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercici1psp;

/**
 *
 * @author jose_
 */
public class Ejercici1PSP {

    public static class ThreadEjercicio1 extends Thread {

        public ThreadEjercicio1(String name) {
            super(name);
        }

        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " " + this.getName());
                try {
                    Thread.sleep((long) (Math.random() * 1000));
                } catch (InterruptedException ex) {
                    System.out.println("Error: " + ex);
                }
            }
            System.out.println(10 + " " + this.getName());
            System.out.println("Termina thread " + this.getName());
        }
    }
    //se elimina la clase que no estaba en uso

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new ThreadEjercicio1("Jose").start();
        new ThreadEjercicio1("Marcos").start();
    }

}

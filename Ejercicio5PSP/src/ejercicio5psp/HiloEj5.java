/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio5psp;

/**
 *
 * @author jose_
 */
public class HiloEj5 extends Thread {

    static int count = 1;
    Thread hilo;

    public HiloEj5(String nom) {
        super(nom + " " + count);
    }

    @Override
    public void run() {
        try {
            // Bucle que creara¡ un thread por cada vuelta que da:
            while (count <= 2) {
                // El numero del thread:
                count++;
                // Se crea el siguiente thread:
                hilo = new HiloEj5("Thread");
                // Inicia el siguiente thread
                hilo.start();
                hilo.join();
                // Se señala que el thread esta¡ en ejecucion:
                System.out.println("Hola, soy el thread " + getName());

            }
        } catch (InterruptedException ex) {
            System.out.println("Error: " + ex);
        }
    }

}

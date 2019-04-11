/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3psp;

/**
 *
 * @author jose_
 */
public class Hilos extends Thread {

    Thread thread;
    int conta;

    public Hilos(String name,int cont) {
        super(name);
        conta=cont;
    }

    public void run() {
        
        try {
            // Se indica que el bucle ha comenzado:
            System.out.println("El " + getName() + " ha comenzado");
            // Bucle que crearÃ¡ un thread por cada vuelta que da:
            if (conta < 5) // El numero del thread:
            {
                conta++;
                
                      // Se crea el siguiente thread:
                thread = new Hilos("Thread "+conta, conta);
                // Inicia el siguiente thread
                thread.run();
                // Se señala que el thread esta¡ en ejecucion:
                
              

                System.out.println(getName() + " procesando");
                sleep((long) ((Math.random() * (600 - 100)) + 100));
                   
                  thread.join();
                System.out.println("El " + getName() + " ha terminado");
            }
        } catch (InterruptedException ex) {
            System.out.println("Error: " + ex);
        }
    }

}

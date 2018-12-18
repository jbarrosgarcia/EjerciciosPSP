/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4psp;

/**
 *
 * @author jose_
 */
public class Hilo extends Thread {
    Thread thread;
    static int count = 1;

    public Hilo(String nom) {
        super(nom);
    }

    public static void main(String[] args) {

        new Hilo("Thread" + count).start();
    }

    @Override
    public void run() {
        try {
            // Se indica que el bucle ha comenzado:
            System.out.println("El " + getName()+" "+count + " ha comenzado");
            // Bucle que creara¡ un thread por cada vuelta que da:
            while (count <= 3) {
                int suma = 0;
                // Se crea un Switch para saber que ejecucion realizar:
                switch (count) {
                    case 1:
                        // Se señala que el thread esta¡ en ejecucion:
                        for (int i = 0; i <= 1000; i += 2) {
                            suma = suma + i;
                        }
                        System.out.println(getName()+" "+count + ": (Suma pares) = " + suma);
                        break;
                    case 2:
                        // Se señala que el thread esta¡ en ejecucion:
                        for (int i = 1; i <= 1000; i += 2) {
                            suma = suma + i;
                        }
                        System.out.println(getName() + ": (Suma impares) = " + suma);
                        break;
                    default:
                        // Se señala que el thread esta¡ en ejecucion:
                        for (int i = 1; i <= 1000; i++) {
                            // Se guarda en una variable el ultimo digito del numero:
                            int digito = i % 10;
                            if (digito == 2 || digito == 3) {
                                suma = suma + i;
                            }
                        }
                        System.out.println(getName() + ": (Suma numeros-2/3) = " + suma);
                        break;
                }
                // El numero del thread:
                count++;
                // Se crea el siguiente thread:
                thread = new Hilo("Thread" + count);
                // Condicional para cree tan solo 5 threads:
                if (count <= 3) {
                    // Inicia el siguiente thread
                    thread.start();
                    // Espera a que termine el thread hijo
                    thread.join();
                }
            }
        } catch (InterruptedException ex) {
            System.out.println("Error: " + ex);
        }
    }
}


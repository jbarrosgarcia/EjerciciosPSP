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
public class Ejercicio3PSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Thread hilo1=new Hilos("Thread 0",0);
        hilo1.start();
    }
    
}

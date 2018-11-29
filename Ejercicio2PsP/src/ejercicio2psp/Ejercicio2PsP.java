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
public class Ejercicio2PsP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new Hilos("jose").start();
        new Hilos("oscar").start();
        new Hilos("juan").start();
        new Hilos("ivan").start();
       
    }
    
}

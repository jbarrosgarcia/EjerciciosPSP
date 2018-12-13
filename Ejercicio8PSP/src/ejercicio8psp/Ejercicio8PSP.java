/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8psp;

/**
 *
 * @author jose_
 */
public class Ejercicio8PSP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Liebre l=new Liebre();
        Tortuga t=new Tortuga();
        l.setTortuga(t);
        t.setLiebre(l);
        l.start();        
        t.start();
    }
    
}

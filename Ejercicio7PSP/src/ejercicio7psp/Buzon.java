/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7psp;

import static java.lang.Thread.currentThread;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jose_
 */
public class Buzon {

    String mensaje = "";

    public synchronized void usarBuzon(boolean leer,String mensa){
        if(leer){
            while(mensaje.length()==0){
                try {
                    System.out.println(currentThread().getName()+": Buzon vacio");
                    wait();
                    System.out.println(currentThread().getName()+": sale del wait de leer");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Buzon.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            mensaje="";
            System.out.println(currentThread().getName()+": Buzon vaciado");            
            notifyAll();
        }else{
            while(mensaje.length()>0){
                try {
                    System.out.println(currentThread().getName()+": Buzon lleno");
                    wait();
                    System.out.println(currentThread().getName()+": sale del wait de escribir");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Buzon.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            mensaje=mensa;
            System.out.println(currentThread().getName()+": "+mensaje);
            notifyAll();
        }
    }
    
    //Probando con dos metodos
    public synchronized void leer(){
        while(mensaje.length()==0){
                try {
                    System.out.println(currentThread().getName()+": Buzon vacio");
                    wait();
                    System.out.println(currentThread().getName()+": sale del wait de leer");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Buzon.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            mensaje="";
            System.out.println(currentThread().getName()+": Buzon vaciado");            
            notifyAll();
    }
    
    public synchronized void escribir(){
        while(mensaje.length()>0){
                try {
                    System.out.println(currentThread().getName()+": Buzon lleno");
                    wait();
                    System.out.println(currentThread().getName()+": sale del wait de escribir");
                } catch (InterruptedException ex) {
                    Logger.getLogger(Buzon.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            mensaje=currentThread().getName()+" ha escrito esto";
            System.out.println(currentThread().getName()+": "+mensaje);
            notifyAll();
    }

}

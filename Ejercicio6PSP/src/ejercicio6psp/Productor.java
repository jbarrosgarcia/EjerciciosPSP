/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio6psp;



/**
 *
 * @author jose_
 */
public class Productor extends Thread {
    
    private Caja caja;
    
    
    public Productor(Caja c) {
        //Mantiene una copia propia del objeto compartido
            caja = c;
    }
    
    @Override
    public void run(){
        //Introduzco 10 ingresos de dinero en la caja
        for (int i = 0; i<10;i++){
            //Crea un número aleatorio para retirar
            int dineroAñadir = (int) (Math.random()*1000+1);
            
            try {
                caja.añadir(dineroAñadir);
                //Imprime la cantidad de dinero que se ha retirado
                System.out.println("Se han añadido "+dineroAñadir+" euros");
            } catch (InterruptedException ex) {
                System.out.println("No se pudo añadir el dinero");
            }
            
            try {
                sleep((long) (Math.random()*100));
            } catch (InterruptedException ex) {
                System.out.println("No se ha podido llevar acabo el 'sleep()'");
            }
        }
        
    }
}

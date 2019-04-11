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
public class Consumidor extends Thread {

    private Caja caja;

    public Consumidor(Caja c) {
        caja = c;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            int retirarAleatorio = (int) (Math.random() * 1000 + 1);
            try {
                caja.retirar(retirarAleatorio);
                System.out.println(retirarAleatorio + " euros retirados"+" Fondos"+caja.getDinero());
                //Esperar más para retirar

            } catch (InterruptedException ex) {
                System.out.println("No se pudo ejecutar 'num=retirar'. CONSUMIDOR #ERROR");
            }
            try {
                sleep((long) (Math.random() * 500));
            } catch (InterruptedException ex) {
                System.out.println("No se ha podido llevar acabo el 'sleep()'");
            }

        }
    }

}

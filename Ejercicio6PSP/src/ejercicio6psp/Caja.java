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
public class Caja {
    
    private static float dinero = 1000;
    //Se declaran dos variables para saber el estado de la caja
    private boolean cajaLlena = false;
    private boolean cajaVacia = true;

    //Método para retirar dinero de la caja
    public synchronized void retirar(float dRetiro) throws InterruptedException {

        while (cajaVacia == false) {
            wait(); //Sale del bucle cuando "cajaVacia" cambia a "true"
        }

        dinero -= dRetiro;

        if (dinero == 0 || dinero < 0) {
            cajaVacia = true;
            cajaLlena = false;
            notify();
        }
    }

    //Método para añadr dinero a la caja
    public synchronized void añadir(float dinero) throws InterruptedException {

        while (cajaLlena == true) {
            wait(); //Sale del bucle cuando "cajaLlena" cambie a "false"
        }

        dinero += Caja.dinero;

        if (dinero + Caja.dinero > 5000) {
            cajaLlena = true;
            cajaVacia = false;
            notify();
        }

    }

    public static float getDinero() {
        return dinero;
    }

    public static void setDinero(float dinero) {
        Caja.dinero = dinero;
    }

}

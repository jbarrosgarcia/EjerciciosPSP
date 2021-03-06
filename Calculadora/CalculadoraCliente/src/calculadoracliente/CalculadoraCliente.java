/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracliente;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 *
 * @author jose_
 */
public class CalculadoraCliente {

    /**
     * @param args the command line arguments
     */
     private byte[] respuesta;

       public String ejecutar(String operacion) {
        try {
            System.out.println("Creando socket cliente");
            Socket clienteSocket = new Socket();
            System.out.println("Estableciendo la conexi�n");

            InetSocketAddress addr = new InetSocketAddress("localhost", 5555);
            clienteSocket.connect(addr);

            InputStream is = clienteSocket.getInputStream();
            OutputStream os = clienteSocket.getOutputStream();

            System.out.println("Enviando mensaje");

            String mensaje = operacion;
            byte[] mens=new byte[30];
            byte[] bytesMensaje=mensaje.getBytes();
            for(int i=0;i<mensaje.getBytes().length;i++){
                mens[i]=bytesMensaje[i];
            }           
            
            os.write(mens);
            
            System.out.println("Mensaje enviado");
            
            //Esto es el numero de bytes que leemos? parece que si
            respuesta = new byte[30];
            //el metodo is.read() devuelve el numero de bytes leidos del stream
            int bytesLeidos=is.read(respuesta);
            
            System.out.println(new String(respuesta));

            System.out.println("Cerrando el socket cliente");

            clienteSocket.close();

            System.out.println("Terminado");

        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(respuesta);
    }
    
}
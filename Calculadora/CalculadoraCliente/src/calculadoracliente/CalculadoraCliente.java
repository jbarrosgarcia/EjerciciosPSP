/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracliente;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Arrays;

/**
 *
 * @author jose_
 */
public class CalculadoraCliente {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) throws IOException {
            String numero, cad2,tipo;
            
            String resultado = "";
            
            String urlpuerto = "localhost";
            
            int puertoentrada  =1111;
            
            try{
            Socket sc1 = new Socket(urlpuerto,puertoentrada);
            InputStreamReader isr = new InputStreamReader (System.in);
            	InputStream is = sc1.getInputStream();
			BufferedReader bf = new BufferedReader(isr);	
			OutputStream os1 = sc1.getOutputStream();
			DataOutputStream dos1 = new DataOutputStream(os1);
			DataInputStream dis = new DataInputStream(is);


			System.out.println("Dame un numero para enviar al servidor: ");
			numero = bf.readLine();
			dos1.writeUTF(numero);
                        
                        
                        
                        System.out.println("Que tipo de operacion quieres");
			System.out.println("1)Suma 2)Resta 3)Multiplicacion 4)Division");
			tipo = bf.readLine();
			dos1.writeUTF(tipo);
                        
                       
                        System.out.println("Dame un otro numero para enviar al servidor: ");
			numero = bf.readLine();
			dos1.writeUTF(numero);

			resultado = dis.readUTF();
			System.out.println("El resultado es: " + resultado);

			dos1.flush();	
			dos1.close();
            
            
            
            }
        catch(IOException e ){
        System.out.println("Error : no se encontro el servidor");
        }

}
}
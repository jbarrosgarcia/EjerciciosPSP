/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoraservidor;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
/**
 *
 * @author jose_
 */
public class CalculadoraServidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Estoy en escucha");
            int x, y ;
            ServerSocket ss= null;
            //String url = "localhost";
            String numero1,numero2, tipo;
            int puerto = 1111;
            float resultado = 0 ;
            
            
            try { 
                ss = new ServerSocket(puerto);
                
                Socket s1 = ss.accept();
                
                InputStream is = s1.getInputStream();
                OutputStream os1 = s1.getOutputStream();
                DataInputStream dis = new DataInputStream(is);
                DataOutputStream dos1 = new DataOutputStream(os1);
                
             
                System.out.println("Esperando al 1er numero...");
                numero1 = dis.readUTF();
                
                System.out.println("El numero recibido es "+ numero1);
                
                
                System.out.println("Esperando del tipo de operacion");
                tipo = dis.readUTF();
                System.out.println("El tipo de operacion es : " + tipo );
                
                
                System.out.println(" Esperando el 2º numero");
                numero2= dis.readUTF();
                
                System.out.println("El segundo numero recibido es "+ numero2);
                
                x= Integer.parseInt(numero1);
                y = Integer.parseInt(numero2);
                
                if(tipo.equals("+")||tipo.equals("1")){
                    resultado = x+y ;
                
                }
                
                else if(tipo.equals("-")||tipo.equals("2")){
                    resultado = x-y;
                
                }
                
                else if (tipo.equals("*")||tipo.equals("3")){
                resultado = x * y;
                
                }
                else if (tipo.equals("/")||tipo.equals("4")){
                resultado = x/y ;
                
                }
                
                
                else{
                System.out.println("Error en la operación");
                
                }
                
                System.out.println("El resultado es "+ resultado);
                dos1.writeUTF(Float.toString(resultado));
                
                
                s1.close();
                dis.close();
                
            }
            catch(IOException e ){
            System.out.println("Error en el cliente");
            
            }
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatservidor;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author jose_
 */
public class ChatServidor {

    /**
     * Creamos un Array que nos ayudara a controlar el numero de clientes conectados.
     */
    static ArrayList <Cliente> listaClientes = new ArrayList();

    public static void main(String[] args){
        //Pedimos el puerto del servidor.
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el PUERTO del servidor --> ");
        int puerto = sc.nextInt();
        
        try {
            //Creamos el socket del servidor
            ServerSocket serverSocket=new ServerSocket();
            InetSocketAddress addr=new InetSocketAddress("localhost",puerto);
            serverSocket.bind(addr);
             //El socket del servidor se queda escuchando en la direccion deseada.
            System.out.println("Socket Servidor creado");
            
            InputStream input;
            OutputStream output;
            
            while(true){
                //En cuenato reciba una conexion se crea el objeto Socket
                Socket newSocket= serverSocket.accept();
                if (listaClientes.size() <10) {
                    System.out.println("Aceptando conexiones");
                    input = newSocket.getInputStream();
                    output = newSocket.getOutputStream();
                    
                    if(listaClientes.size()==0){
                        System.out.println("No hay ningun usuario conectado");
                    }
                    
                    String aviso = "true";
                    output.write(aviso.getBytes());
                    System.out.println("Mensaje Enviado"); 

                    //Recibimos el nickname
                    byte[] nicknameRE = new byte[250];
                    input.read(nicknameRE);
                    String nickname = new String(nicknameRE);
                    System.out.println("Usuario solicita conexion:"+nickname);
                    //Se crea un hilo por cada conexion al server
                    
                    //Añadimos un nuevo cliente a la lista y lo iniciamos
                    Cliente nuevoCliente = new Cliente(newSocket,nickname,output,input);
                    nuevoCliente.start();
                    listaClientes.add(nuevoCliente);
                    
                    System.out.println(nickname+" se ha conectado (IP:"+newSocket.getLocalAddress()
                            +", PUERTO: "+newSocket.getLocalPort()+")");
                    System.out.println("Hay " + listaClientes.size() + " cliente/s conectados.");
                    
                    for (Cliente elemento: listaClientes) {
                        String conexionNueva = nickname+" se ha conectado al chat.\n;"+listaClientes.size()+";"; 
                        elemento.enviarMensaje(conexionNueva);
                    }
                }else{
                    System.out.println("Se ha alcanzado el maximo de usuarios permitidos.");
                    output = newSocket.getOutputStream();
                    String aviso = "false";
                    output.write(aviso.getBytes());
                    System.out.println("Mensaje Enviado"); 
                }
            }
        } catch (IOException ex) {
            System.out.println("Se ha producido un error en la conexion.");
        }
    }
}

    


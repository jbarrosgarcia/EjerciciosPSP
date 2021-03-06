/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatservidor;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 *
 * @author jose_
 */
public class Cliente extends Thread{
    
    private Socket socket;
    private InputStream input;
    private OutputStream output;
    private String nickname;
    
    public Cliente(Socket socket,String nickname,OutputStream output,InputStream input) throws IOException{
        this.socket=socket; 
        this.nickname=nickname;
        this.input = input;
        this.output = output;
    }
    
    @Override
    public void run(){
        try{
            while (true) {
                byte[] mensajeRe=new byte[250];
                //Se crea un stream que recibira los mensajes
                input.read(mensajeRe);
                //Mostramos el mensaje
                String mensajeRecibido = new String(mensajeRe);
                System.out.println("Se ha recibido un mensaje: "+nickname+":"+mensajeRecibido);
                if (mensajeRecibido.contains("/bye")){
                    ChatServidor.listaClientes.remove(this);
                    
                    for (Cliente elemento: ChatServidor.listaClientes) {
                        String conexion = nickname+" se ha desconectado.\n;"+ChatServidor.listaClientes.size()+";"; 
                        elemento.enviarMensaje(conexion);
                    }
                    System.out.println("Hay "+ChatServidor.listaClientes.size()+" usuarios conectados");
                    
                    //Cerramos la conexión
                    socket.close();
                    System.out.println(nickname+" se ha desconectado");
                    break;
                }else{
                    for (Cliente elemento: ChatServidor.listaClientes) {
                        String mensaje = nickname+": "+ mensajeRecibido;   
                        elemento.enviarMensaje(mensaje);
                    }
                    System.out.println("Mensaje enviado");
                }
            }
        }catch(IOException ex){
            System.out.println("Se ha producido un error en la conexion");
        }
    }
    
    /**
     * Este metodo se encarga de enviar los mesajes a todos los clientes.
     * @param mensaje texto a enviar.
     */
    public void enviarMensaje(String mensaje){
        try {
            output.write(mensaje.getBytes());
        } catch (IOException ex) {
            System.out.println("Se ha producido un error al enviar el mensaje");
        }
        System.out.println("Mensaje enviado");
    }
}

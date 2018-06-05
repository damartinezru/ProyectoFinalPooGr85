/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perseguido.servidor;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

import javax.swing.DefaultListModel; 
/**
 *
 * @author chamo
 */
public class Servidor {
   
    private int id=1;
    
    
    
     
    BufferedReader input;
    PrintStream output;
    
    private DataInputStream dataInput;
    private DataOutputStream dataOutput;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    public Servidor() 
    {
        try
        {
            ServerSocket socketServidor = new ServerSocket(8085);
            while (true)
            {
                Socket cliente = socketServidor.accept();
                Runnable nuevoCliente = new HiloCliente(cliente);
                Thread hilo = new Thread(nuevoCliente);
                hilo.start();              
            }
            
            
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) 
    {
        new Servidor();
    }
}

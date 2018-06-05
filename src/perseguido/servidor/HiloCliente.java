/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perseguido.servidor;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author chamo
 */
public class HiloCliente implements Runnable, KeyListener{
    
    private Socket socket;
    private DataInputStream dataInput;
    private DataOutputStream dataOutput;
    ArrayList<String> m = new ArrayList<>();
    Servidor s;
    String[] m1;
    int id=1;
   
    public HiloCliente( Socket socket) 
    {
        
        
        try
        {   
            
            dataInput = new DataInputStream(socket.getInputStream());
            dataOutput = new DataOutputStream(socket.getOutputStream());
            
            
        } catch (IOException e)
        {
        }
    }
    
    @Override
    public void run()
    {
        try
        {
            while (true)
            {
                
                String texto = dataInput.readUTF();
                m.add(texto);
                dataOutput.writeUTF(texto);
                  
                    for (int i=0; i<m.size();i++){
                    System.out.println(m.get(i));
                    
                    }
                    
                    
            }
        } catch (IOException e)
        {
        }
    }

    @Override
    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}

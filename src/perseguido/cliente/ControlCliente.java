/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perseguido.cliente;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import perseguido.gui.Lienzo;
import perseguido.gui.Marcador;
import perseguido.gui.Principal;
import perseguido.logica.Heroe;
import perseguido.servidor.HiloCliente;
/**
 *
 * @author chamo
 */
public class ControlCliente implements KeyListener{
    public DataInputStream dataInput;
    public DataOutputStream dataOutput;
    Lienzo lienzo;
    Marcador marcador= new Marcador();
        
<<<<<<< HEAD
    
=======
    //Heroe h= new Heroe();
>>>>>>> d6ad19ed95ad6995b728d7d79860a016dee67d28

    public void setLienzo(Lienzo lienzo) {
        this.lienzo = lienzo;
        lienzo.setDataInput(dataInput);
        lienzo.setDataOutput(dataOutput);
    }
    
    
    
    public ControlCliente(Socket socket)
    {
        
        marcador.setVisible(true);
        try
        {
            dataInput = new DataInputStream(socket.getInputStream());
            dataOutput = new DataOutputStream(socket.getOutputStream());
            
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    
<<<<<<< HEAD

=======
  
//   public void imp(){
//    
//       System.out.println(lienzo.getDataInput());
//   
//   }
>>>>>>> d6ad19ed95ad6995b728d7d79860a016dee67d28

    @Override
    public void keyTyped(KeyEvent e) {
        lienzo.getHeroe().update(e.getKeyChar());
        lienzo.getDataOutput();
        marcador.cuadro.setText(lienzo.getPuntos());
    }

    @Override
    public void keyPressed(KeyEvent e) {
        
//         try {
//            
//            dataOutput.writeUTF(lienzo.getHeroe().movimiento(e.getKeyCode()));
//        } catch (IOException ex) {
//            Logger.getLogger(HiloCliente.class.getName()).log(Level.SEVERE, null, ex);
//        }
//            lienzo.getHeroe().update(e.getKeyCode());
//            lienzo.getDataOutput();
//            marcador.cuadro.setText(lienzo.getPuntos());
           
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
    
     public static void main(String[] args)
    {
        
    }
}

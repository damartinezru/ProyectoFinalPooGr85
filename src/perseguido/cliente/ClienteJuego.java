/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package perseguido.cliente;

import java.net.Socket;
import perseguido.gui.Principal;

/**
 *
 * @author chamo
 */
public class ClienteJuego {

    private Socket socket;

    public ClienteJuego() {
        try {
            socket = new Socket("localhost", 8085);
            ControlCliente control = new ControlCliente(socket);
            Principal p = new Principal(control);
            p.setVisible(true);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new ClienteJuego();  
    }

}

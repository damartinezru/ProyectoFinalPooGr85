/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perseguido.gui;

import java.io.File;
import javax.swing.JFrame;
import perseguido.cliente.ControlCliente;
import perseguido.utils.FileUtils;
import perseguido.musica.musica;
import perseguido.musica.musica2;
/**
 *
 * @author daza
 */
public class Principal extends JFrame{
    Lienzo lienzo = new Lienzo();
    FileUtils fu = new FileUtils();
    String[][] matriz;
    ControlCliente control;
    Marcador marcador= new Marcador();

    
    
    public Principal(ControlCliente c){
        iniciarComponentes(c);
    }
    
    public void iniciarComponentes(ControlCliente c){
//    reproducir.setVisible(true);
        musica2 musicadefondo = new musica2();
        musicadefondo.reproducirCancion();
        control = c;
        String archivo = fu.archivoAleatorio("../archivos");
        matriz = fu.fileToMatriz("../archivos/" + archivo);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        control.setLienzo(lienzo);
        addKeyListener(control);
        add(lienzo);
        pack();
        setBounds(0, 0, matriz.length * 34, 40 + matriz[0].length * 34);
        lienzo.iniciarLienzo(matriz);
        lienzo.setBounds(0, 0, matriz.length * 34, matriz[0].length * 34);
    }
    
}

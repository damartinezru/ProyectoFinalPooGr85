/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perseguido.gui;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimerTask;
import java.util.Timer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
<<<<<<< HEAD
import perseguido.cliente.Datos;
=======
>>>>>>> d6ad19ed95ad6995b728d7d79860a016dee67d28

import perseguido.logica.Enemigo;
import perseguido.logica.Heroe;
import perseguido.logica.Personaje;
import perseguido.logica.Recompenssa;
import perseguido.logica.Roca;
import perseguido.logica.Tesoro;
import perseguido.utils.FileUtils;

/**
 *
 * @author daza
 */
public class Lienzo extends Canvas implements KeyListener {

    Personaje heroe = new Heroe();
    Timer timer;
    BufferedImage imgBuffer;
    String[][] matriz;
    ArrayList<Personaje> rocas;
    ArrayList<Personaje> tesoro;
    ArrayList<Personaje> enemigos;
    ArrayList<Personaje> recompenssa;
    FileUtils fu = new FileUtils();
    DataInputStream dataInput;
    DataOutputStream dataOutput;
    int texto=10;
    int cont=1;
    int texto3=20;
    String puntos;
    String [] m2 = null;
<<<<<<< HEAD
    Datos d;
    boolean a=false;
    String mensaje;
=======
>>>>>>> d6ad19ed95ad6995b728d7d79860a016dee67d28
    
    String texto2;

    public DataInputStream getDataInput() {
        return dataInput;
    }

    public void setDataInput(DataInputStream dataInput) {
        this.dataInput = dataInput;
    }

    public Personaje getHeroe() {
        return heroe;
    }

    public DataOutputStream getDataOutput() {
        return dataOutput;
    }

    public void setDataOutput(DataOutputStream dataOutput) {
        this.dataOutput = dataOutput;
    }

    public String getPuntos() {
        return puntos;
    }

    public void setPuntos(String puntos) {
        this.puntos = puntos;
    }
    
    

    public Lienzo() {
        rocas = new ArrayList<Personaje>();
        tesoro = new ArrayList<Personaje>();
        enemigos = new ArrayList<Personaje>();
        recompenssa = new ArrayList<Personaje>();
        timer = new Timer();
        timer.schedule(new Actualizador(), 0, 100);
        imgBuffer = new BufferedImage(600, 600, BufferedImage.TRANSLUCENT);
<<<<<<< HEAD
        for (int i = 0; i < 4; i++) {
            enemigos.add(new Enemigo());
        }
=======
>>>>>>> d6ad19ed95ad6995b728d7d79860a016dee67d28
        

    }

    public void iniciarLienzo(String[][] matriz) {
        this.matriz = matriz;
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[f].length; c++) {
                if (matriz[f][c].equals("1")) {
                    rocas.add(new Roca(f * 32, c * 32));
                }
                if (matriz[f][c].equals("3")) {
                    recompenssa.add(new Recompenssa(f * 32, c * 32));
                }
                if (matriz[f][c].equals("2")) {
                    tesoro.add(new Tesoro(f * 32, c * 32));
                }
<<<<<<< HEAD
=======
                if (matriz[f][c].equals("5")) {
                    enemigos.add(new Enemigo(f * 32, c * 32));
                }
>>>>>>> d6ad19ed95ad6995b728d7d79860a016dee67d28
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        //super.paint(g); //To change body of generated methods, choose Tools | Templates.

        Graphics miG = imgBuffer.getGraphics();
       // miG.clearRect(0, 0, 800, 600);
        miG.drawImage(new ImageIcon(getClass().getResource("../imagenes/piso1.jpg")).getImage(), 0, 0, null);
        

        for (Iterator<Personaje> iterator = rocas.iterator(); iterator.hasNext();) {
            Personaje next = iterator.next();
            next.draw(miG);

        }
        for (Iterator<Personaje> iterator = enemigos.iterator(); iterator.hasNext();) {
            Personaje next = iterator.next();
            next.draw(miG);

        }
        for (Iterator<Personaje> iterator = tesoro.iterator(); iterator.hasNext();) {
            Personaje next = iterator.next();
            next.draw(miG);

        }
        if (tesoro.isEmpty()) {
            for (Iterator<Personaje> iterator = recompenssa.iterator(); iterator.hasNext();) {
                Personaje next = iterator.next();
                next.draw(miG);

            }
        }

        heroe.draw(miG);
        g.drawImage(imgBuffer, 0, 0, this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
<<<<<<< HEAD
        heroe.update(e.getKeyChar());
=======
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
>>>>>>> d6ad19ed95ad6995b728d7d79860a016dee67d28
    }

    @Override
    public void keyPressed(KeyEvent e) {
<<<<<<< HEAD
        
         
=======
//        heroe.update(e.getKeyCode());
>>>>>>> d6ad19ed95ad6995b728d7d79860a016dee67d28
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public class Actualizador extends TimerTask {

        public void run() {

            Iterator<Personaje> it = rocas.iterator();
            Iterator<Personaje> it2 = enemigos.iterator();
            Iterator<Personaje> it3 = recompenssa.iterator();
            Iterator<Personaje> it4 = tesoro.iterator();
<<<<<<< HEAD
             

            heroe.update();
           

            repaint();
            
            
            while (it.hasNext()) {
                
                Personaje r = it.next();
                
                if (r.getRect().intersects(heroe.getRect())) {
                    heroe.cambiarSentido();
                    
                    break;
                    
                }

                 
=======
//          
            Marcador marcador= new Marcador(); 
            heroe.update();

            repaint();
//             Marcador marcador= new Marcador();
//            marcador.setVisible(true);
            
            while (it.hasNext()) {
                Personaje r = it.next();
                if (r.getRect().intersects(heroe.getRect())) {
                    heroe.cambiarSentido();
                    break;
                }
>>>>>>> d6ad19ed95ad6995b728d7d79860a016dee67d28
            }
            while (it2.hasNext()) {
                Personaje r = it2.next();
                r.update();
                for (Iterator<Personaje> iterator = rocas.iterator(); iterator.hasNext();) {
                    Personaje next = iterator.next();
                    if (r.getRect().intersects(next.getRect())) {
                        r.cambiarSentido();
                        
                        break;
                    }
<<<<<<< HEAD

                }
                 repaint();
               
                 
                 
            } 
            
=======
                    
                    

                }
                
                 
            }
>>>>>>> d6ad19ed95ad6995b728d7d79860a016dee67d28
            
            
            while (it4.hasNext()) {
                
                
                Personaje r = it4.next();
<<<<<<< HEAD
                
=======
>>>>>>> d6ad19ed95ad6995b728d7d79860a016dee67d28
                if (r.getRect().intersects(heroe.getRect())) {
                    tesoro.remove(r);
                    
                    int hola=(texto)*(cont++);
                    puntos= Integer.toString(hola);
<<<<<<< HEAD
                    
                      try {
                        a=true;
                        dataOutput.writeUTF(puntos);                       
=======
                    marcador.cuadro.setText(puntos);
                    try {
                        dataOutput.writeUTF(puntos);
//                        String texto2=dataInput.readUTF();
//                        System.out.println(texto2);
>>>>>>> d6ad19ed95ad6995b728d7d79860a016dee67d28
                        
                    } catch (IOException ex) {
                        Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
                    }
<<<<<<< HEAD
                    
                    
                    break;
                  
                }
                
                
                
                 
=======
//                     try {
//                        String texto2=dataInput.readUTF();
//                        System.out.println(texto2);
//                        if(texto2.equalsIgnoreCase(texto)){
//                        tesoro.remove(r);}
//                    } catch (IOException ex) {
//                        Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
//                    }
                
                    break;
                  
                }
>>>>>>> d6ad19ed95ad6995b728d7d79860a016dee67d28
               
            }
            
             
            while (it3.hasNext()) {
                Personaje r = it3.next();
                
                
                if (r.getRect().intersects(heroe.getRect()) && tesoro.isEmpty()) {
                    rocas.clear();
                    enemigos.clear();
                    recompenssa.clear();
                    String archivo = fu.archivoAleatorio("../archivos");
                    matriz = fu.fileToMatriz("../archivos/" + archivo);
                    Graphics miG = imgBuffer.getGraphics();
                    heroe.reiniciarHeroe();
                    iniciarLienzo(matriz);
                    
                    int hola=(texto3)*(cont++);
                    String puntos= Integer.toString(hola);
<<<<<<< HEAD
                    
                    
                    try {
                        a=true;
                        dataOutput.writeUTF(puntos);                       
=======
                    marcador.cuadro.setText(puntos);
                    try {
                        
                        dataOutput.writeUTF(puntos);
>>>>>>> d6ad19ed95ad6995b728d7d79860a016dee67d28
                        
                    } catch (IOException ex) {
                        Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    }
                    break;
                }
            
<<<<<<< HEAD
             try { 
                
                 if(a==true){
                     
                        a=false;
                        d=new Datos();  
                        
                        d.recibir(dataInput.readUTF());
                        
                        
                } 
                
                
            } catch (IOException ex) {
                Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
            }
=======
            
>>>>>>> d6ad19ed95ad6995b728d7d79860a016dee67d28
            
            }


        }
    }


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perseguido.logica;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author daza
 */
public class Enemigo implements Personaje {

    Image[][] imagenes = {{new ImageIcon(getClass().getResource("../imagenes/V3-D1.png")).getImage(),
        new ImageIcon(getClass().getResource("../imagenes/V3-D2.png")).getImage(),
        new ImageIcon(getClass().getResource("../imagenes/V3-D3.png")).getImage()
    },
    {new ImageIcon(getClass().getResource("../imagenes/V3-F1.png")).getImage(),
        new ImageIcon(getClass().getResource("../imagenes/V3-F2.png")).getImage(),
        new ImageIcon(getClass().getResource("../imagenes/V3-F3.png")).getImage()
    },
    {new ImageIcon(getClass().getResource("../imagenes/V3-I1.png")).getImage(),
        new ImageIcon(getClass().getResource("../imagenes/V3-I2.png")).getImage(),
        new ImageIcon(getClass().getResource("../imagenes/V3-I3.png")).getImage()
    },
    {new ImageIcon(getClass().getResource("../imagenes/V3-B1.png")).getImage(),
        new ImageIcon(getClass().getResource("../imagenes/V3-B2.png")).getImage(),
        new ImageIcon(getClass().getResource("../imagenes/V3-B3.png")).getImage()
    }
    };
    int sentido = 2;
    int cont = 0;
    Image imagen = imagenes[sentido][cont];
    int xPos = 32;
    int yPos = 32;
    int xVel = 0;
    int yVel = 0;
    int contador = 0;
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
    int contador2 = 0;

    public Enemigo (int x, int y){
        Random r = new Random();
        xPos = x;
        yPos = y;
        sentido = r.nextInt(4);
        switch (sentido) {
            case 0:
                xVel = 32;
                yVel = 0;
                break;
            case 1:
                xVel = 0;
                yVel = 32;
                break;
            case 2:
                xVel = -32;
                yVel = 0;
                break;
            case 3:
                xVel = 0;
                yVel = -32;
                break;
        }
    }
>>>>>>> d6ad19ed95ad6995b728d7d79860a016dee67d28
>>>>>>> 59a5ba94116c9643de711254db277efedc07a02d
    public Enemigo() {
        Random r = new Random();
        xPos = r.nextInt(600);
        xPos = r.nextInt(600);
        sentido = r.nextInt(4);
        switch (sentido) {
            case 0:
                xVel = 32;
                yVel = 0;
                break;
            case 1:
                xVel = 0;
                yVel = 32;
                break;
            case 2:
                xVel = -32;
                yVel = 0;
                break;
            case 3:
                xVel = 0;
                yVel = -32;
                break;
        }
    }

    @Override
    public void draw(Graphics g) {

        g.drawImage(imagen, xPos, yPos, null);
    }

    @Override
    public void update() {
        contador++;
        if (contador == 4) {
            xPos += xVel;
            yPos += yVel;
            contador = 0;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
            contador2++;
            if (contador2 == 6){
                this.cambiarSentido();
                contador2=0;
            }
>>>>>>> d6ad19ed95ad6995b728d7d79860a016dee67d28
>>>>>>> 59a5ba94116c9643de711254db277efedc07a02d
        }
        cont++;
        cont = cont % 3;
        imagen = imagenes[sentido][cont];
    }

    public void update(int c) {

    }

    @Override
    public void cambiarSentido() {
        Random r = new Random();
<<<<<<< HEAD
        int opcion = r.nextInt(2);
=======
<<<<<<< HEAD
        int opcion = r.nextInt(2);
=======
        int opcion = r.nextInt(3);
>>>>>>> d6ad19ed95ad6995b728d7d79860a016dee67d28
>>>>>>> 59a5ba94116c9643de711254db277efedc07a02d
        switch (sentido) {
            case 0:
                xPos += -32;
                yPos += 0;
                if (opcion == 0) {
                    xVel = 0;
                    yVel = 32;
                    sentido = 1;
<<<<<<< HEAD
                } else {
=======
<<<<<<< HEAD
                } else {
=======
                } else if (opcion == 1) {
>>>>>>> d6ad19ed95ad6995b728d7d79860a016dee67d28
>>>>>>> 59a5ba94116c9643de711254db277efedc07a02d
                    xVel = 0;
                    yVel = -32;
                    sentido = 3;
                }
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
                else {
                    xVel = -32;
                    yVel = 0;
                    sentido = 2;
                }
>>>>>>> d6ad19ed95ad6995b728d7d79860a016dee67d28
>>>>>>> 59a5ba94116c9643de711254db277efedc07a02d
                break;
            case 1:
                xPos += 0;
                yPos += -32;
                if (opcion == 0) {
                    xVel = 32;
                    yVel = 0;
                    sentido = 0;
<<<<<<< HEAD
                } else {
=======
<<<<<<< HEAD
                } else {
=======
                } else if (opcion == 1) {
>>>>>>> d6ad19ed95ad6995b728d7d79860a016dee67d28
>>>>>>> 59a5ba94116c9643de711254db277efedc07a02d
                    xVel = -32;
                    yVel = 0;
                    sentido = 2;
                }
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
                else {
                    xVel = 0;
                    yVel = -32;
                    sentido = 3;
                }
>>>>>>> d6ad19ed95ad6995b728d7d79860a016dee67d28
>>>>>>> 59a5ba94116c9643de711254db277efedc07a02d
                break;
            case 2:
                xPos += 32;
                yPos += 0;
                if (opcion == 0) {
                    xVel = 0;
                    yVel = 32;
                    sentido = 1;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 59a5ba94116c9643de711254db277efedc07a02d
                } else {
                    xVel = 0;
                    yVel = -32;
                    sentido = 3;
<<<<<<< HEAD
=======
=======
                } else if (opcion == 1) {
                    xVel = 0;
                    yVel = -32;
                    sentido = 3;
                } else {
                    xVel = 32;
                    yVel = 0;
                    sentido = 0;
>>>>>>> d6ad19ed95ad6995b728d7d79860a016dee67d28
>>>>>>> 59a5ba94116c9643de711254db277efedc07a02d
                }
                break;
            case 3:
                xPos += 0;
                yPos += 32;
                if (opcion == 0) {
                    xVel = 32;
                    yVel = 0;
                    sentido = 0;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 59a5ba94116c9643de711254db277efedc07a02d
                } else {
                    xVel = -32;
                    yVel = 0;
                    sentido = 2;
<<<<<<< HEAD
=======
=======
                } else if (opcion == 1) {
                    xVel = -32;
                    yVel = 0;
                    sentido = 2;
                } else {
                    xVel = 0;
                    yVel = 32;
                    sentido = 1;
>>>>>>> d6ad19ed95ad6995b728d7d79860a016dee67d28
>>>>>>> 59a5ba94116c9643de711254db277efedc07a02d
                }
                break;
        }
    }

    @Override
    public Rectangle getRect() {
        Rectangle rect = null;
        rect = new Rectangle(xPos, yPos, imagen.getWidth(null), imagen.getHeight(null));
        return rect;
    }

    @Override
    public String movimiento(int c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reiniciarHeroe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void update(char c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

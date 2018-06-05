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
        int opcion = r.nextInt(3);
        switch (sentido) {
            case 0:
                xPos += -32;
                yPos += 0;
                if (opcion == 0) {
                    xVel = 0;
                    yVel = 32;
                    sentido = 1;
                } else if (opcion == 1) {
                    xVel = 0;
                    yVel = -32;
                    sentido = 3;
                }
                else {
                    xVel = -32;
                    yVel = 0;
                    sentido = 2;
                }
                break;
            case 1:
                xPos += 0;
                yPos += -32;
                if (opcion == 0) {
                    xVel = 32;
                    yVel = 0;
                    sentido = 0;
                } else if (opcion == 1) {
                    xVel = -32;
                    yVel = 0;
                    sentido = 2;
                }
                else {
                    xVel = 0;
                    yVel = -32;
                    sentido = 3;
                }
                break;
            case 2:
                xPos += 32;
                yPos += 0;
                if (opcion == 0) {
                    xVel = 0;
                    yVel = 32;
                    sentido = 1;
                } else if (opcion == 1) {
                    xVel = 0;
                    yVel = -32;
                    sentido = 3;
                } else {
                    xVel = 32;
                    yVel = 0;
                    sentido = 0;
                }
                break;
            case 3:
                xPos += 0;
                yPos += 32;
                if (opcion == 0) {
                    xVel = 32;
                    yVel = 0;
                    sentido = 0;
                } else if (opcion == 1) {
                    xVel = -32;
                    yVel = 0;
                    sentido = 2;
                } else {
                    xVel = 0;
                    yVel = 32;
                    sentido = 1;
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

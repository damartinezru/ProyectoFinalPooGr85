/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perseguido.logica;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.ImageIcon;

/**
 *
 *
 */

public class Heroe implements Personaje {

    Image[][] imagenes = {{new ImageIcon(getClass().getResource("../imagenes/H2-B1.png")).getImage(),
        new ImageIcon(getClass().getResource("../imagenes/H2-B2.png")).getImage(),
        new ImageIcon(getClass().getResource("../imagenes/H2-B3.png")).getImage()
    },
    {new ImageIcon(getClass().getResource("../imagenes/H2-D1.png")).getImage(),
        new ImageIcon(getClass().getResource("../imagenes/H2-D2.png")).getImage(),
        new ImageIcon(getClass().getResource("../imagenes/H2-D3.png")).getImage()
    },
    {new ImageIcon(getClass().getResource("../imagenes/H2-F1.png")).getImage(),
        new ImageIcon(getClass().getResource("../imagenes/H2-F2.png")).getImage(),
        new ImageIcon(getClass().getResource("../imagenes/H2-F3.png")).getImage()
    },
    {new ImageIcon(getClass().getResource("../imagenes/H2-I1.png")).getImage(),
        new ImageIcon(getClass().getResource("../imagenes/H2-I2.png")).getImage(),
        new ImageIcon(getClass().getResource("../imagenes/H2-I3.png")).getImage()
    }
    };
    int sentido = 2;
    int cont = 0;
    Image imagen = imagenes[sentido][cont];
    int xPos = 32;
    int yPos = 32;
    int xVel = 0;
    int yVel = 0;

    @Override
    public void draw(Graphics g) {

        g.drawImage(imagen, xPos, yPos, null);
    }

    @Override
    public void update() {
        cont++;
        cont = cont % 3;
        imagen = imagenes[sentido][cont];

    }

    @Override
    public void update(int c) {

    }

    @Override
    public void update(char c) {
        switch (c) {
            case 'a':
                sentido = 3;
                xPos += -32;
                yPos += 0;
                break;
            case 'w':
                sentido = 0;
                xPos += 0;
                yPos += -32;
                break;
            case 'd':
                sentido = 1;
                xPos += 32;
                yPos += 0;
                break;
            case 's':
                sentido = 2;
                xPos += 0;
                yPos += 32;
                break;
        }
    }

//    @Override
//    public String movimiento(int c) {
//        String m = null;
//        update(c);
//        if (c == 37) {
//            m = "izquierda";
//        } else if (c == 38) {
//            m = "abajo";
//        } else if (c == 39) {
//            m = "derecha";
//        } else if (c == 40) {
//            m = "arriba";
//        }
//        return m;
//    }

    @Override
    public void cambiarSentido() {
        switch (sentido) {
            case 0:
                xPos += 0;
                yPos += 32;
                break;
            case 1:
                xPos += -32;
                yPos += 0;
                break;
            case 2:
                xPos += 0;
                yPos += -32;
                break;
            case 3:
                xPos += 32;
                yPos += 0;
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
    public void reiniciarHeroe() {
        xPos = 32;
        yPos = 32;
        xVel = 0;
        yVel = 0;
        sentido = 2;
    }

    @Override
    public String movimiento(int c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

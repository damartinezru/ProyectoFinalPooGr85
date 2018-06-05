/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perseguido.musica;

import java.io.*;
import javax.sound.sampled.*;

public class musica2 {
    File Archivo;
    AudioInputStream stream;
    AudioFormat format;
    DataLine.Info info;
    Clip clip;
    public void musica2(){
        
    }
    public void reproducirCancion() {
        try {
            stream = AudioSystem.getAudioInputStream(new File("../perseguido/musica/BGM.wav"));
            System.out.println("here is johnny");
            format = stream.getFormat();
            info = new DataLine.Info(Clip.class, format);
            clip = (Clip) AudioSystem.getLine(info);
            clip.open(stream);
            clip.start();
        } catch (Exception e) {
            System.out.println("Habemus error");
        }
    }
}

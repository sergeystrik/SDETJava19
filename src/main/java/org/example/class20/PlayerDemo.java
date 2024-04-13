package org.example.class20;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PlayerDemo {
    public static void main(String[] args) throws FileNotFoundException, JavaLayerException {

        FileInputStream fits=new FileInputStream("C:\\Users\\ssiry\\IdeaProjects\\SDETJava19\\src\\main\\java\\org\\example\\class20\\Ambient-music-free.mp3");

        Player p=new Player(fits);

        p.play();
    }
}

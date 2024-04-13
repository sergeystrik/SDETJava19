package org.example.class20;

import javax.swing.*;
import java.awt.*;

public class MyDrawing {
    public static void main(String[] args) {
        JFrame j = new JFrame();
        j.setSize(1000, 1000);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setVisible(true);
    }

    class MyCanvas extends Canvas {

        @Override
        public void paint(Graphics g) {
            g.setColor(Color.GRAY);
            g.fillOval(200, 200, 500, 500);
            g.setColor(Color.GREEN);
            g.fillRect(400, 400, 200, 200);
        }
    }
}
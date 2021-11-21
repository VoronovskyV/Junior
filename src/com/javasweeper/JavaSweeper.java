package com.javasweeper;

import javax.swing.*;
import java.awt.*;
import java.util.Objects;

public class JavaSweeper extends JFrame {
    private JPanel panel;
    private final int COLS = 15;
    private final int ROWS = 1;
    private final int IMAGE_SIZE = 50;

    public static void main(String[] args) {

        new JavaSweeper();
    }

    private JavaSweeper() {
        initPanel();
        initFrame();
    }

    private void initPanel() {
        panel = new JPanel() {
            @Override
            protected  void  paintComponent (Graphics g) {
                super.paintComponent(g);
                g.drawImage(getImage("bomb"), 500,500,this);
            }
        };
        panel.setPreferredSize(new Dimension(COLS * IMAGE_SIZE, ROWS * IMAGE_SIZE));
        add(panel);
    }

    private void initFrame() {
        pack();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("JavaSweeper");
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

    }
    private  Image getImage ( String name) {
        String filename = "img/" + name.toLowerCase() + ".png";
        ImageIcon icon = new ImageIcon(Objects.requireNonNull(getClass().getResource(filename)));
        return icon.getImage();
    }
}



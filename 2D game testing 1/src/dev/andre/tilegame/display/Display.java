package dev.andre.tilegame.display;

import javax.swing.*;

public class Display {
    private JFrame frame;
    private String title;
    private int width, height;

    //CONSTRUCTOR
    public Display(String title, int width, int height) {
        this.title = title;
        this.width = width;
        this.height = height;
        createDisplay();
    }

    private void createDisplay(){
        frame = new JFrame(title);
        frame.setSize(width, height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Asegura que al apretar la x de la ventana el progama cierra
        frame.setResizable(false); //Setea si se puede ajustar el tamano de la ventana
        frame.setLocationRelativeTo(null); //La ventana aparece centrada
        frame.setVisible(true); //Setea la ventana visible, por defecto vienen false
    }
}

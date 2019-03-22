package View;

import javax.swing.*;
import java.awt.*;

public class menu extends JFrame {
    private static final String WINDOW_TITLE = "Smartpiano";

    private JPanel jp;
    private JLabel jlSuperior;
    private JButton opcion2;
    private JButton opcion3;
    private JButton opcion4;
    private JButton opcion5;
    private JButton opcion6;

    public menu() {
        superior();
        centro();

        this.setSize(500, 500);
        this.setTitle(WINDOW_TITLE);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setResizable(true);
    }
    private void superior(){
        jlSuperior = new JLabel("Menú principal");
        jlSuperior.setFont(new java.awt.Font("Arial", 0, 15));
        jlSuperior.setForeground(new java.awt.Color(13, 39, 245));
        jlSuperior.setBounds(10,20,300,30);
        getContentPane().add(jlSuperior, BorderLayout.NORTH);
    }
    private void centro(){
        jp = new JPanel(new BorderLayout());
        jp.setBackground(new java.awt.Color(174, 240, 245));
        jp.setBorder(BorderFactory.createTitledBorder("Escoja una opción"));
        jp.setLayout(new GridLayout(5,1,10,15));

            opcion2 = new JButton("Tocar el piano");
            opcion3 = new JButton("Registrar una canción");
            opcion4 = new JButton("Reproducir una canción");
            opcion5 = new JButton("Añadir amigos");
            opcion6 = new JButton("Cerrar sesión o eliminar cuenta");

            jp.add(opcion2);
            jp.add(opcion3);
            jp.add(opcion4);
            jp.add(opcion5);
            jp.add(opcion6);

        this.getContentPane().add(jp, BorderLayout.CENTER);
    }
}

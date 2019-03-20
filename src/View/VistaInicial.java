package View;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class VistaInicial extends JFrame implements ActionListener {

    private JButton btn;
    private JLabel picLabel;
    private BufferedImage logo;

    public VistaInicial() {
        //Se muestra el logo y bienvenida
        setVisible(true);
        setSize(600, 410);
        setLayout(null);
        getContentPane().setBackground(Color.lightGray);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("SmartPiano");
        btn = new JButton("Empezar");
        try{
            logo = ImageIO.read(new File("/Users/Sofi/Documents/Barcelona/Segundo Año/Clases/DPO/Práctica 02/Logo.png"));
        } catch (IOException ex) {
            // handle exception...
        }
        picLabel = new JLabel(new ImageIcon(logo));
        btn.addActionListener(this);
        btn.setBounds(250, 336, 100, 30);
        picLabel.setBounds(100, 15, 400, 316);
        add(btn);
        add(picLabel);
    }
    public void actionPerformed(ActionEvent e) {
        //Botón para empezar
        if (e.getSource() == btn)
        {
            //Se abre la Vista Principal
        }
        else
        {
        }
    }
    public static void main(String args[]) {
        new VistaInicial();
    }
}

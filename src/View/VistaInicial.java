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

    private JButton btnInicio;
    private JButton btnRegistro;
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
        btnInicio = new JButton("Iniciar Sesión");
        btnRegistro = new JButton("Registrarse");
        try{
            logo = ImageIO.read(new File("~/C3_SmartPiano/src/Logo.png"));
        } catch (IOException ex) {
            // handle exception...
        }
        picLabel = new JLabel(new ImageIcon(logo));
        btnInicio.addActionListener(this);
        btnInicio.setBounds(130, 336, 150, 30);
        btnRegistro.addActionListener(this);
        btnRegistro.setBounds(320, 336, 150, 30);
        picLabel.setBounds(100, 15, 400, 316);
        add(btnInicio);
        add(btnRegistro);
        add(picLabel);
    }
    public void actionPerformed(ActionEvent e) {
        //Botón para empezar
        if (e.getSource() == btnInicio)
        {
            dispose();  // Se abre InciarSesión
            new IniciarSesion().setVisible(true);
        }
        else
        {
            dispose();  // Se abre Registrarse
            new Registrarse().setVisible(true);
        }
    }
    public static void main(String args[]) {
        new VistaInicial();
    }
}

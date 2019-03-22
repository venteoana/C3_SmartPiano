package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Registrarse extends JFrame implements ActionListener {

    private JLabel titulo;
    private JLabel nombre;
    private JLabel email;
    private JLabel contraseña;
    private JLabel confirmar;
    private JTextField tf1;
    private JTextField tf2;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JPasswordField p1;
    private JPasswordField p2;

    public Registrarse() {
        //Se crea el formulario
        setVisible(true);
        setSize(600, 350);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Registrarse");
        titulo = new JLabel("Registrarse");
        titulo.setFont(new Font("Sans-Serif", Font.BOLD,25));
        nombre = new JLabel("Nombre de usuario:");
        email = new JLabel("Correo electrónico:");
        contraseña = new JLabel("Crear contraseña:");
        confirmar = new JLabel("Confirmar contraseña:");
        tf1 = new JTextField();
        tf2 = new JTextField();
        p1 = new JPasswordField();
        p2 = new JPasswordField();
        btn1 = new JButton("Enviar");
        btn2 = new JButton("Limpiar");
        btn3 = new JButton("Volver");
        btn1.addActionListener(this);
        btn3.addActionListener(this);
        btn2.addActionListener(this);
        titulo.setBounds(100, 30, 400, 30);
        nombre.setBounds(100, 85, 200, 30);
        email.setBounds(100, 125, 200, 30);
        contraseña.setBounds(100, 165, 200, 30);
        confirmar.setBounds(100, 205, 200, 30);
        tf1.setBounds(300, 85, 200, 30);
        tf2.setBounds(300, 125, 200, 30);
        p1.setBounds(300, 165, 200, 30);
        p2.setBounds(300, 205, 200, 30);
        btn1.setBounds(90, 265, 100, 30);
        btn2.setBounds(190, 265, 100, 30);
        btn3.setBounds(290, 265, 100, 30);
        add(titulo);
        add(nombre);
        add(tf1);
        add(email);
        add(tf2);
        add(contraseña);
        add(p1);
        add(confirmar);
        add(p2);
        add(btn1);
        add(btn2);
        add(btn3);
    }
    public void actionPerformed(ActionEvent e) {
        //Condición si se elige el botón Enviar
        if (e.getSource() == btn1)
        {
            //Se obtienen los datos
            int x = 0;
            String s1 = tf1.getText();
            String s2 = tf2.getText();
            char[] s3 = p1.getPassword();
            char[] s4 = p2.getPassword();
            String s5 = new String(s3);
            String s6 = new String(s4);
            //Si las contraseñas coinciden
            if (s5.equals(s6) && s5 != null && s1 != null && s2 != null && s5.length() > 7 && !s1.isEmpty() && !s2.isEmpty())
            {
                try
                {

                }
                catch (Exception ex)
                {
                    System.out.println(ex);
                }
            }
            else if (!s5.equals(s6))
            {
                JOptionPane.showMessageDialog(btn1, "La contraseña no coincide.");
            }
            else if(s5 == null || s6 == null || s1 == null || s2 == null || s1.isEmpty() || s2.isEmpty() || s5.isEmpty() || s6.isEmpty())
            {
                JOptionPane.showMessageDialog(btn1, "Ningún campo puede estar vacío.");
            }
            else
            {
                JOptionPane.showMessageDialog(btn1, "La contraseña debe tener al menos 8 carácteres.");
            }
        }
        else if (e.getSource() == btn2)
        {
            tf1.setText("");
            tf2.setText("");
            p1.setText("");
            p2.setText("");
        }
        else {
            dispose();  // Se vuelve a la VistaInicial
            new VistaInicial().setVisible(true);
        }
    }
    public static void main(String args[]) {
        new Registrarse();
    }
}

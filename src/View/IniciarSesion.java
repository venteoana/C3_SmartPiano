package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IniciarSesion extends JFrame implements ActionListener {

    private JLabel titulo;
    private JLabel nombre;
    private JLabel contraseña;
    private JTextField tf;
    private JButton btn;
    private JButton btn2;
    private JPasswordField pwd;

    public IniciarSesion() {
        //Se pide usuario y contraseña
        setVisible(true);
        setSize(500, 280);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Iniciar Sesión");
        titulo = new JLabel("Iniciar Sesión");
        titulo.setFont(new Font("Sans-Serif", Font.BOLD,25));
        nombre = new JLabel("Usuario:");
        contraseña = new JLabel("Contraseña:");
        tf = new JTextField();
        pwd = new JPasswordField();
        btn = new JButton("Entrar");
        btn.addActionListener(this);
        btn2 = new JButton("Volver");
        btn2.addActionListener(this);
        titulo.setBounds(100, 30, 400, 30);
        nombre.setBounds(100, 95, 200, 30);
        contraseña.setBounds(100, 135, 200, 30);
        tf.setBounds(200, 95, 200, 30);
        pwd.setBounds(200, 135, 200, 30);
        btn.setBounds(200, 205, 100, 30);
        btn2.setBounds(300, 205, 100, 30);
        add(titulo);
        add(nombre);
        add(tf);
        add(contraseña);
        add(pwd);
        add(btn);
        add(btn2);
    }
    public void actionPerformed(ActionEvent e) {
        //Condición si se elige el botón Entrar
        if (e.getSource() == btn)
        {
           /*
            //Se obtienen los datos
            int x = 0;
            String s1 = tf.getText();
            char[] s2 = pwd.getPassword();
            String s3 = new String(s1);
            String s4 = new String(s2);
            //Condiciones para ver que el usuario y contraseña existan y que coincidan con las creadas
            if (condicion)
            {
                try
                {
                    Class.forName(""); //Driver
                    Connection con = DriverManager.getConnection("", "", ""); //Conexión BBDD
                    PreparedStatement ps = con.prepareStatement("insert into reg values(?,?,?,?,?,?)");
                    ps.setString(1, s1);
                    ps.setString(2, s2);
                    ps.setString(3, s3);
                    ps.setString(4, s4);
                    ResultSet rs = ps.executeQuery();
                    x++;
                    if (x > 0)
                    {
                        JOptionPane.showMessageDialog(btn, "Se ha creado el usuario satisfactoriamente.");
                    }
                }
                catch (Exception ex)
                {
                    System.out.println(ex);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(btn1, "La contraseña no coincide.");
            }*/
        }
        else
        {
            dispose();  // Se vuelve a la VistaInicial
            new VistaInicial().setVisible(true);
        }
    }
    public static void main(String args[]) {
        new IniciarSesion();
    }
}

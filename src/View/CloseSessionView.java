package View;

import javax.swing.*;
import java.awt.*;

/**
 * Created by len on 14/03/2019.
 */
public class CloseSessionView extends JFrame{
    private JButton jbclose;
    private JButton jbdelete;
    private JLabel jltext;

    public CloseSessionView(){
        JPanel jpSuperior = new JPanel();
        //jpSuperior.setLayout(new GridLayout(3, 1));
        jltext = new JLabel("       ¿Desea cerrar sesion?");
        JPanel jpView = new JPanel();
        jbclose = new JButton("Cerrar sesion");
        jbclose.setActionCommand("close");
        jbdelete = new JButton("Eliminar Cuenta");
        jbdelete.setActionCommand("delete");

        jbclose.setPreferredSize(new Dimension(150, 50));
        jbdelete.setPreferredSize(new Dimension(150, 50));
        jpSuperior.add(jbclose, BorderLayout.CENTER);
        jpSuperior.add(jbdelete, BorderLayout.CENTER);
        getContentPane().setLayout(new GridLayout(2, 0));
        getContentPane().add(jltext, BorderLayout.CENTER);
        getContentPane().add(jpSuperior, BorderLayout.CENTER);
        this.setSize(400, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cerrar/eliminar sesion");
        setLocationRelativeTo(null);

    }
}

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JButton button1;
    private JButton button2;
    private JLabel uno;
    private JLabel dos;
    public JPanel panelPrincipal;
    private JTextField textoVariables;
    private JLabel tres;
    private JButton button3;

    public form1() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JFrame componente = new JFrame();
                componente.setContentPane(new componentes().componentePanel);
                componente.setVisible(true);
                componente.setSize(500,200);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame variable = new JFrame();
                variable.setContentPane(new variables(textoVariables).variablePanel);
                variable.setVisible(true);
                variable.setSize(500,200);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame combox = new JFrame();
                combox.setContentPane(new combox().comboBox);
                combox.setVisible(true);
                combox.setSize(500,200);

            }
        });
    }
}

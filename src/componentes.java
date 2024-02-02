import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class componentes {
    private JLabel ejemplo;
    private JLabel cambioComponente;
    public JPanel componentePanel;
    private JButton cambio;
    public JTextField cambiotexto;

    public componentes() {
        cambio.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambioComponente.setText(cambiotexto.getText());
            }
        });
    }

}


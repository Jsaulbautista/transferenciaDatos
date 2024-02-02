import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class combox {
    private JComboBox combox;
    private JLabel titulo;
    public JPanel comboBox;
    private JLabel resultado;


    public combox() {
        combox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String color = "color";
                color = (combox.getSelectedItem()).toString();
                resultado.setText(color);

            }
        });
    }
}



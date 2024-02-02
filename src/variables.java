import javax.swing.*;

public class variables {
    private JLabel ejemplo2;
    private JTextField cambioVariable;
    public JPanel variablePanel;
    String valor1;

    public variables(JTextField valor1){
        this.valor1 = String.valueOf(valor1);
        cambioVariable.setText(String.valueOf(valor1.getText()));


    }
}

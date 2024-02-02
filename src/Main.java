import javax.swing.*;

public class Main {
    static JFrame paneliPrincipal = new JFrame("Panel Principal");
    public static void main(String[] args) {

        paneliPrincipal.setContentPane(new form1().panelPrincipal);
        paneliPrincipal.setVisible(true);
        paneliPrincipal.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        paneliPrincipal.setSize(500,300);


    }
}
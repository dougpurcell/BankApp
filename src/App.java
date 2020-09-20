import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App {
    private JPanel main;
    private JPanel login;
    private JPanel account;
    private JPanel logout;
    private JButton loginButton;
    private JLabel loginText;
    private JLabel accountText;
    private JLabel accountText2;
    private JLabel accountText3;
    private JTextField checkingTotal;
    private JLabel checkingLabel;
    private JLabel savingsLabel;
    private JTextField savingsTotal;
    private JComboBox accountAction;
    private JLabel optionSelectText;
    private JLabel optionAmount;
    private JTextField textField1;
    private JButton amountUpdateButton;

    public App() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                account.setVisible(true);
                login.setVisible(false);
            }
        });

    }
    // Main Method
    public static void main(String args[]) {
        JFrame frame = new JFrame("Banking Application");
        frame.setContentPane(new App().main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

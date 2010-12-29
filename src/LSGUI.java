import javax.swing.*;

/**
 * Created by Jeff Stokes.
 * Date: 12/28/10
 * Time: 7:47 PM
 */
public class LSGUI extends JFrame {
    private JButton btnStart;
    private JTextField txtUser;
    private JPasswordField passwordField;
    private JPanel mainPanel;

    LSGUI() {
        add(mainPanel);
        setVisible(true);
        pack();
    }

    public String getTxtUser() {
        return txtUser.getText();
    }

    public char[] getPassword() {
        return passwordField.getPassword();
    }
}

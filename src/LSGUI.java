import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

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
    private JTextField txtURL;
    private JButton btnBrowse;
    private JTextField txtParam;
    private JButton btnHelp;
    private JLabel lblParam;
    private File paramFile;

    /**
     * Initialize the GUI
     * Add button listeners
     */
    LSGUI() {
        btnStart.addActionListener(startListener);
        btnBrowse.addActionListener(browseListener);
        btnHelp.addActionListener(helpListener);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(mainPanel);
        setVisible(true);
        pack();
    }

    /**
     * Listen for start button click to start the spamming
     *
     */
    ActionListener startListener = new ActionListener() {
        public void actionPerformed(ActionEvent actionEvent) {
            GUISpammer run = new GUISpammer(LSGUI.this);
            run.spam();
        }
    };

    /**
     * Listen for browse button click to display file chooser
     */
    ActionListener browseListener = new ActionListener() {
        public void actionPerformed(ActionEvent actionEvent) {
            JFileChooser chooser = new JFileChooser();
            FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "Text Files", "txt");
            chooser.setFileFilter(filter);

            int rVal = chooser.showOpenDialog(LSGUI.this);

            if (rVal == JFileChooser.APPROVE_OPTION) {
                paramFile = chooser.getSelectedFile();
                txtParam.setText(paramFile.getAbsolutePath());
            }
        }
    };

    /**
     * Listen for help click to display help dialog
     */
    ActionListener helpListener = new ActionListener() {
        public void actionPerformed(ActionEvent actionEvent) {
            new helpDialog();
        }
    };

    public String getTxtUser() {
        return txtUser.getText();
    }

    public char[] getPassword() {
        return passwordField.getPassword();
    }

    public String getURL() {
        return txtURL.getText();
    }

    public File getParamFile() {
        return paramFile;
    }
}

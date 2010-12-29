import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class helpDialog extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JLabel lblHelp;
    private boolean readFile = false;

    /**
     * Initializer
     * add button listeners
     */
    public helpDialog() {
        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });

// call onOK() when cross is clicked
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                onOK();
            }
        });

// call onOK() on ESCAPE
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0),
                JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        fill(lblHelp);
        if (readFile) {
            pack();
            setVisible(true);
        }
    }

    private void onOK() {
        this.dispose();
    }

    /**
     * Fill in the help dialog label with the text from the README file
     * @param lbl The label that fills the Dialog (contains help information)
     */
    private void fill(JLabel lbl) {
        try {
            File readme = new File("README.txt");
            FileReader fr = new FileReader(readme);
            BufferedReader br = new BufferedReader(fr);
            StringBuilder sb = new StringBuilder();
            String text;

            // JLabel's recognize HTML
            // Read each line and add it to label
            sb.append("<html>");
            while ((text = br.readLine()) != null) {
                sb.append(text);
                sb.append("<br>");
            }
            sb.append("</html>");

            lbl.setText(sb.toString());
            readFile = true;
            
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "README not found! Perhaps" +
                    " it was deleted?", "Warning", JOptionPane.WARNING_MESSAGE);
            e.printStackTrace();
            readFile = false;
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error while trying to read" +
                    " README file", "Warning", JOptionPane.WARNING_MESSAGE);
            e.printStackTrace();
            readFile = false;
        }
    }
}

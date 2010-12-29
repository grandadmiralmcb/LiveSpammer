import java.io.PrintStream;
import java.net.URL;

/**
 * Created by Jeff Stokes.
 * Date: 12/29/10
 * Time: 12:51 PM
 */
public class testMain extends CommandLineSpammer {

    static PrintStream log = new PrintStream(System.out);
    public static void main(String[] args) {

    }

    private void testCreateConnection() {
        UserCredentials cred = this.getCredentials();
        URL xboxURL = this.createConnection();
        log.format("Trying to log into URL: %s", xboxURL.toString());
        log.format("Logging in with user name: %s", cred.getUserName());


    }

    /**
    private void testGetParams() {
        GUISpammer test = new GUISpammer(new LSGUI());

        File params = new File("parameters.txt");

        try {
            test.getParametersFromFile(params);
        } catch (MalformedParameterException e) {
            System.err.println("Illegal parameter file!");
            e.printStackTrace();
        }
    }
    */

}



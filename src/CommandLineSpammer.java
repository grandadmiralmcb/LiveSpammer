/**
 * Created by Jeff Stokes.
 * Date: 12/28/10
 * Time: 2:26 PM
 */

import java.io.*;
import java.util.HashMap;

/**
 * A command line implementation of the LiveSpammer :)
 */
public class CommandLineSpammer extends LSInterface {

    CommandLineSpammer() {
        spam();
    }

    // I get damn tired of typing System.out
    static PrintStream out = new PrintStream(System.out);

    //And System.in
    static InputStreamReader isr = new InputStreamReader(System.in);
    static BufferedReader in = new BufferedReader(isr);

    protected UserCredentials getCredentials() {
        try {
            out.println("Enter username:");
            String user = in.readLine();

            Console console = System.console();

            out.println("Enter password:");
            char[] pass = console.readPassword();

            return new UserCredentials(user, pass);
        } catch (IOException e) {
            System.err.print("Error!: ");
            e.printStackTrace();
            System.exit(-3);
        }

        return null; //will never get here
    }

    //TODO
    @Override
    HashMap<String, String> getParametersFromFile(File file)
            throws MalformedParameterException {
        return null;
    }

    //TODO
    @Override
    PostParameters getParameters() throws MalformedParameterException {
        return null;
    }
}

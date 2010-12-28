/**
 * Created by Jeff Stokes.
 * Date: 12/28/10
 * Time: 2:26 PM
 */

import java.io.*;

/**
 * A command line implementation of the LiveSpammer :)
 */
public class CommandLineSpammer extends LSInterface {

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
            String password = new String(pass);

            return new UserCredentials(user, password);
        } catch (IOException e) {
            System.err.print("Error!: ");
            e.printStackTrace();
            System.exit(-3);
        }

        return null; //will never get here
    }
}
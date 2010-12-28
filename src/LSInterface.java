
/**
 * Created by Jeff Stokes.
 * Date: 12/28/10
 * Time: 11:16 AM
 */

import java.io.IOException;
import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Superclass for command line interface and GUI
 */
public abstract class LSInterface {


    /**
    * Overloaded create connection, just calls with default paramater
    * of the xbox live messaging site
    * @return The created connection
    */
    public URL createConnnection() {
        return createConnection(
                "http://live.xbox.com/en-US/MessageCenter/Compose");
    }
    
    /**
     * Create the connection
     * @param url The url to connect to
     * @return The created connection
     */
    public URL createConnection(String url) {
        try {
            return new URL(url);
        } catch (MalformedURLException e) {
            System.err.print("Error!: ");
            e.printStackTrace();
            System.exit(-1);
        }
        return null; //never going to get here.
    }

    /**
     * Log in to the system
     * @param cred The user name and password of the person logging in.
     */
    public void logIn(UserCredentials cred) {
        Authenticator auth = new MyAuthenticator(cred);
        Authenticator.setDefault(auth);
    }

    /**
     * Post parameters to website
     * @param postP The POST parameters
     * @param url The url to POST to
     * @return true if message sent successfully, false if otherwise
     */
    public void post(URL url, PostParameters postP) {

        try {
            ClientHttpRequest con = new ClientHttpRequest(url);
            con.setParameters(postP.parameterMap);
        } catch (IOException e) {
            System.err.print("Error!: ");
            e.printStackTrace();
            System.exit(-2);
        }
    }
}

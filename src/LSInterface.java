
/**
 * Created by Jeff Stokes.
 * Date: 12/28/10
 * Time: 11:16 AM
 */

import java.io.File;
import java.io.IOException;
import java.net.Authenticator;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

/**
 * Superclass for command line interface and GUI
 */
public abstract class LSInterface {

    /**
    * Overloaded create connection, just calls with default paramater
    * of the xbox live messaging site
    * @return The created connection
    */
    protected URL createConnection() {
        return createConnection(
                "http://live.xbox.com/en-US/MessageCenter/Compose");
    }
    
    /**
     * Create the connection
     * @param url The url to connect to
     * @return The created connection
     */
    protected URL createConnection(String url) {
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
    protected void logIn(UserCredentials cred) {
        Authenticator auth = new MyAuthenticator(cred);
        Authenticator.setDefault(auth);
    }

    /**
     * Post parameters to website
     * @param postP The POST parameters
     * @param url The url to POST to
     */
    protected void post(URL url, PostParameters postP) {

        try {
            ClientHttpRequest con = new ClientHttpRequest(url);
            con.setParameters(postP.parameterMap);
        } catch (IOException e) {
            System.err.print("Error!: ");
            e.printStackTrace();
            System.exit(-2);
        }
    }

    /**
     * Force implementation of this method
     * will differ from CL to GUI
     * @return The credentials (containing username and password)
     */
    abstract UserCredentials getCredentials();

    abstract HashMap<String, String> getParametersFromFile(File file)
            throws MalformedParameterException;

    abstract PostParameters getParameters() throws MalformedParameterException;

    /**
     * Start the spamming
     */
    protected void spam() {
        URL url = this.createConnection();

        //Get those UserCredentials and use them to log in
        UserCredentials UC = this.getCredentials();
        this.logIn(UC);

        // For testing purposes go ahead and add default parameters
        PostParameters postP = null;
        try {
            postP = this.getParameters();
        } catch (MalformedParameterException e) {
            System.err.print(e.toString());
            System.exit(-3);
        }

        // Post those parameters!
        this.post(url, postP);
    }
}

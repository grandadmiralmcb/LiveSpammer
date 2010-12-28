import java.net.Authenticator;
import java.net.PasswordAuthentication;

/**
 * Created by Jeff Stokes.
 * Date: 12/28/10
 * Time: 11:52 AM
 */

/**
 * Class for holding username and password authentication
 */
public class MyAuthenticator extends Authenticator {

    PasswordAuthentication auth;

    MyAuthenticator(UserCredentials cred) {
        auth = getPasswordAuthentication(cred);    
    }

    /**
     * Create PasswordAuthentication using supplied user credentials
     * @param cred The username and password for authentication
     * @return The PasswordAuthentication object with information of
     * the username and password
     */
    protected PasswordAuthentication getPasswordAuthentication(UserCredentials
                                                               cred) {
            return new PasswordAuthentication(cred.getUserName(),
                    cred.getPassword().toCharArray());

        }


}

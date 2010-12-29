/**
 * Created by Jeff Stokes.
 * Date: 12/28/10
 * Time: 9:49 PM
 */
public class GUISpammer extends LSInterface {
    LSGUI window;

    /**
     * Constructor for GUISpammer
     * Starts the spamming!
     * @param window The GUI window containing user information
     */
    GUISpammer(LSGUI window) {
        this.window = window;
        spam();
    }

    /**
     * Get credentials from GUI form
     * @return UserCredential object containing username and password
     */
    protected UserCredentials getCredentials() {
        String user = window.getTxtUser();
        char[] pwd = window.getPassword();

        return new UserCredentials(user, pwd);
    }
}

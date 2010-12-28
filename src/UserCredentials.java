/**
 * Created by Jeff Stokes.
 * Date: 12/28/10
 * Time: 11:20 AM
 */
public class UserCredentials {
    /**
     * userName: The log in name of the user
     * password: The password of the user
     */
    private String userName;
    private char[] password;

    /**
     * Create UserCredential object with userName and password supplied
     * @param userName The username
     * @param password The password
     */
    UserCredentials(String userName, char[] password) {
        this.userName = userName;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public char[] getPassword() {
        return password;
    }
}

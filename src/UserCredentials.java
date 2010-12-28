/**
 * Created by Jeff Stokes.
 * Date: 12/28/10
 * Time: 11:20 AM
 */
public class UserCredentials {
    /**
     * Getters and setters document themselves
     * userName: The log in name of the user
     * password: The password of the user
     */
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Default constructor for blank UC object
     */
    UserCredentials() {
        // do nothing :)
    }

    /**
     * Create UserCredential object with userName and password supplied
     * @param userName The username
     * @param password The password
     */
    UserCredentials(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }
}

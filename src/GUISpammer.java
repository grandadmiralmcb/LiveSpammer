import java.io.*;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

    /**
     * Tries to read from file the key:value pair for parameters. Stores
     * this information in a HashMap and returns it.
     * @param file The file to read parameters from.
     * @return The HashMap containing key:value pairs
     * @throws MalformedParameterException Thrown if file is not correctly
     * formatted, i.e., is not in the form of param:value
     */
    protected HashMap<String, String> getParametersFromFile(File file)
        throws MalformedParameterException {

        HashMap<String, String> paramMap = new HashMap<String, String>();
        String key;
        String value;
        Pattern p = Pattern.compile("(\\w+):(\\w+)");
        String text;
        Matcher m;
        try {
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while ((text = br.readLine()) != null) {
                m = p.matcher(text);
                if (m.matches()) {
                    key = m.group(1);
                    value = m.group(2);
                    paramMap.put(key, value);
                } else {
                    System.out.println("No match found for: " + text);
                    throw new MalformedParameterException();
                }
            }

        return paramMap;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Either get the POST parameters from the file chosen by the
     * chooser, or initialize the POST parameters to default values
     * @return The POST parameter object
     * @throws MalformedParameterException If the file is not in the correct
     * format (param:value)
     */
    @Override
    protected PostParameters getParameters()
            throws MalformedParameterException {
        File paramFile = window.getParamFile();
        if (paramFile.exists()) {
            return new PostParameters(getParametersFromFile(paramFile));
        } else {
            PostParameters defaultPost = new PostParameters();
            defaultPost.addDefaults();
            return defaultPost;
        }
    }
}

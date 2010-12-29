import java.io.File;

/**
 * Created by Jeff Stokes.
 * Date: 12/29/10
 * Time: 12:51 PM
 */
public class testMain {

    public static void main(String[] args) {
        GUISpammer test = new GUISpammer(new LSGUI());

        File params = new File("parameters.txt");

        try {
            test.getParametersFromFile(params);
        } catch (MalformedParameterException e) {
            System.err.println("Illegal parameter file!");
            e.printStackTrace();
        }
    }
}



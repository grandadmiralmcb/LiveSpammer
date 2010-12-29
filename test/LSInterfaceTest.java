import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * LSInterface Tester.
 *
 * @author <Authors name>
 * @since <pre>12/29/2010</pre>
 * @version 1.0
 */
public class LSInterfaceTest extends TestCase {
    public LSInterfaceTest(String name) {
        super(name);
    }

    public void setUp() throws Exception {
        super.setUp();
    }

    public void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     *
     * Method: getCredentials()
     *
     */
    public void testGetCredentials() throws Exception {
        //TODO: Test goes here...
    }

    /**
     *
     * Method: getParametersFromFile(File file)
     *
     */
    public void testGetParametersFromFile() throws Exception {
        //TODO: Test goes here...
    }

    /**
     *
     * Method: getParameters()
     *
     */
    public void testGetParameters() throws Exception {
        //TODO: Test goes here...
    }

    /**
     *
     * Method: spam()
     *
     */
    public void testSpam() throws Exception {
        //TODO: Test goes here...
    }


    /**
     *
     * Method: createConnection()
     *
     */
    public void testCreateConnection() throws Exception {
        //TODO: Test goes here...

        }

    /**
     *
     * Method: createConnection(String url)
     *
     */
    public void testCreateConnectionUrl() throws Exception {
        //TODO: Test goes here...
        /*
        try {
           Method method = LSInterface.class.getMethod("createConnection", String.class);
           method.setAccessible(true);
           method.invoke(<Object>, <Parameters>);
        } catch(NoSuchMethodException e) {
        } catch(IllegalAccessException e) {
        } catch(InvocationTargetException e) {
        }
        */
        }

    /**
     *
     * Method: logIn(UserCredentials cred)
     *
     */
    public void testLogIn() throws Exception {
        //TODO: Test goes here...
        /*
        try {
           Method method = LSInterface.class.getMethod("logIn", UserCredentials.class);
           method.setAccessible(true);
           method.invoke(<Object>, <Parameters>);
        } catch(NoSuchMethodException e) {
        } catch(IllegalAccessException e) {
        } catch(InvocationTargetException e) {
        }
        */
        }

    /**
     *
     * Method: post(URL url, PostParameters postP)
     *
     */
    public void testPost() throws Exception {
        //TODO: Test goes here...
        /*
        try {
           Method method = LSInterface.class.getMethod("post", URL.class, PostParameters.class);
           method.setAccessible(true);
           method.invoke(<Object>, <Parameters>);
        } catch(NoSuchMethodException e) {
        } catch(IllegalAccessException e) {
        } catch(InvocationTargetException e) {
        }
        */
        }


    public static Test suite() {
        return new TestSuite(LSInterfaceTest.class);
    }
}

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jeff Stokes.
 * Date: 12/28/10
 * Time: 1:59 PM
 */

/**
 * This class holds a map of the parameters you would like to post
 */
public class PostParameters {
    Map<String, String> parameterMap;

    /**
     * Creates a new empty Hashmap<String, String> named parameterMap
     */
    PostParameters() {
        parameterMap = new HashMap<String, String>();
    }

    /**
     * Adds a key/value combination to your parameter map
     * @param key The key of the combination
     * @param value The value of the combination
     */
    void addParam(String key, String value) {
        parameterMap.put(key, value);
    }

    /**
     * add default information (for live.xbox.com)
     * can be removed if not using for that..
     */
    void addDefaults(String gamertag, String message) {
        addParam("newrecipient", gamertag);
        addParam("reply0", message);
    }

    /**
     * Just for now if you don't want to supply gamertag and message
     */
    void addDefaults() {
        addDefaults("ECUxPIRATE", "Testing");
    }
}

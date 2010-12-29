/**
 * Created by Jeff Stokes.
 * Date: 12/29/10
 * Time: 1:31 PM
 */
public class MalformedParameterException extends Throwable {

        @Override
        public String toString() {
            return "Parameter file was not formatted correctly!";
        }
}

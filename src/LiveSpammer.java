/**
 * This application right now is only for live.xbox.com
 * However the way it is made it can be used for any site that takes POST
 * data 
 */

public class LiveSpammer {

    /**
     * Gets everything gooooiiiiinnnnn
     * @param args The arguments, duh
     */
    public static void main(String[] args) {

        //Create new command line interface
        //This can be changed to GUISpammer later
        //For right now just connects to live.xbox.com
        //new CommandLineSpammer();

        LSGUI window = new LSGUI();
        new GUISpammer(window);

        /**
         * TODO
         * - There's no direct access to the recipient field, so the javascript
         *   function Compose.AddRecipient() is going to have to be called.
         *
         * - After calling AddRecipient, we need to submit the form by calling
         *   Compose.SendMessage()
         *
         * - Add a loop to continue sending messages (up to a user specified
         *   amount) 
         */
    }
}


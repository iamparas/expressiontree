package expressiontree;

public class VerboseModeInputHandler extends InputHandler {
    /** Keeps track of whether we've prompted the user already. */
    private boolean prompted;
	
    /** Ctor */
    VerboseModeInputHandler() {
        prompted = false;
    }

    /** This hook method verbosely prompts the user for input. */
    public void promptUser() {
        Platform platform = Platform.instance();

        if (!prompted) {
            platform.disableAll(verboseField);
            platform.outputMenu("", "", "");  
            platform.outputMenu("1a.", "format", "[in-order]");
            platform.outputMenu("1b.", "set", "[variable=value]");
            platform.outputMenu("2.", "expr", "[expression]");
            platform.outputMenu("3a.", "eval", "[post-order]");
            platform.outputMenu("3b.", "print", "[in-order | pre-order | post-order| level-order]");
            platform.outputMenu("0c.", "quit", "");
            platform.outputMenu("", "", "");

            prompted = true;
        }
        /** Output the '>' prompt character. */
        platform.outputString("> ");
    }

    /** 
     * This hook method makes the appropriate command based on the
     * user input.
     */
    public UserCommand makeUserCommand(String userinput) {
        return userCommandFactory.makeUserCommand(userinput);
    }	
}
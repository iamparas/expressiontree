package expressiontree;

public class SuccinctModeInputHandler extends InputHandler {
    /** This hook method succinctly prompts the user for input. */
    public void promptUser() {
        if (Platform.instance().isCommandLinePlatform())
            Platform.instance().outputString("> ");
    }

    /** 
     * This hook method makes the appropriate set of macro commands
     * based on the user input.
     */
    public UserCommand makeUserCommand(String userInputExpression) {
        /**
         * Create a MacroCommand by prefixing the keyword "macro" in
         * front of the userInputExpression.
         */
        return userCommandFactory.makeUserCommand("macro " + userInputExpression);
    }
}
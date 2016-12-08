package expressiontree;

public class QuitCommand extends UserCommand {
    /** 
     * Constructor that provides the appropriate @a TreeOps.
     */
    QuitCommand(TreeOps context) {
        super.treeOps = context;
    }

    /** Quit the input dispatching loop. */
    public void execute() {
        InputDispatcher.instance().endInputDispatching();
    }

    /** Print the valid commands available to users. */
    public void printValidCommands(boolean verboseField) {
    }
}
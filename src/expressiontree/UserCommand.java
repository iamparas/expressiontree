package expressiontree;

public abstract class UserCommand {
    /** 
     * Holds the expression tree that is the target of the
     * commands. 
     */
    protected TreeOps treeOps;
	
    /** Runs the command. */
    abstract void execute() throws Exception;

    /** Print the valid commands available to users. */
    abstract void printValidCommands(boolean verboseField);
}
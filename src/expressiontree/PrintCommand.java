package expressiontree;

public class PrintCommand extends UserCommand {
    /** Format to print out the tree.*/
    private String format;

    /**
     * Constructor that provides the appropriate @a
     * TreeOps and the requested format.
     */
    PrintCommand(TreeOps context,
                 String printFormat) {
        super.treeOps = context;
        format = printFormat;
    }

    /** Print the expression tree. */
    public void execute() throws Exception {
        treeOps.print(format);
    }

    /** Print the valid commands available to users. */
    public void printValidCommands(boolean verboseField) {
        Platform platform = Platform.instance();
    	platform.disableAll(verboseField);
        platform.outputMenu("",
                            "",
                            "");
        platform.outputMenu("1a.",
                            "eval",
                            "[post-order]");
        platform.outputMenu("1b.",
                            "print",
                            "[in-order | pre-order | post-order| level-order]");
        platform.outputMenu("0a.",
                            "format",
                            "[in-order]");
        platform.outputMenu("0b.",
                            "set",
                            "[variable = value]");
        platform.outputMenu("0c.",
                            "quit",
                            "");
        platform.outputMenu("",
                            "",
                            "");
    }
}
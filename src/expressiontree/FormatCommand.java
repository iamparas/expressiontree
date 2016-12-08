package expressiontree;

public class FormatCommand extends UserCommand {
    /** Requested format. */
    private String format;

  
    FormatCommand(TreeOps context, String newformat) {
    	super.treeOps = context;
    	format = newformat;
    }

    /** Set the desired format. */
    public void execute() throws Exception {
        treeOps.format(format);
    }

    /** Print the valid commands available to users. */
    public void printValidCommands(boolean verboseField) {
        Platform platform = Platform.instance();
    	platform.disableAll(verboseField);
        platform.outputMenu("",
                            "",
                            "");
        platform.outputMenu("1.",
                            "expr",
                            "[expression]");
        platform.outputMenu("2a.",
                            "eval",
                            "[post-order]");
        platform.outputMenu("2b.",
                            "print", "[in-order | pre-order | post-order| level-order]");
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

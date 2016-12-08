package expressiontree;

public class ExprCommand extends UserCommand {
    /** Requested expression. */
    private String expr;


    public ExprCommand(TreeOps context, String newexpr) {
        super.treeOps = context;
        expr = newexpr;
    }

  
    public void execute() throws Exception {
        treeOps.makeTree(expr);
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

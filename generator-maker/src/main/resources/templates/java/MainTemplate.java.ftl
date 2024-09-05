package ${basePackage};

import ${basePackage}.cli.CommandExecutor;

public class MainTemplate {

    public static void main(String[] args) {
        CommandExecutor commandExecutor = new CommandExecutor();
        commandExecutor.doExecute(args);
    }
}

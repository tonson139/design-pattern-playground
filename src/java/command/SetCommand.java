package src.java.command;

public class SetCommand implements Command {
    private final Connection connection;

    public SetCommand(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void execute() {
        connection.runCommand(String.class, "SET", "String");
    }
}

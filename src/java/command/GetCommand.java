package src.java.command;

public class GetCommand implements Command {
    private final Connection connection;

    public GetCommand(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void execute() {
        connection.runCommand(String.class, "GET", "String");
    }
}

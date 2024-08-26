package src.java.command;

public class Client {
    public static void main(String[] args) {
        final var connection = new Connection();
        final var getCommand = new GetCommand(connection);
        final var setCommand = new SetCommand(connection);
        final var invoker = new Invoker();
        invoker.execute(getCommand);
        invoker.execute(setCommand);
    }
}

package src.java.command;

public class Connection {

    public <T> T runCommand(T returnType, Object... args) {
        System.out.println("running");
        for (Object arg : args) {
            System.out.println(STR." ==> arg::\{arg}");
        }
        return returnType;
    }
}

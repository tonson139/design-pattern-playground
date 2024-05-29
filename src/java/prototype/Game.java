package src.java.prototype;

public abstract class Game {
    protected String title;
    protected String username;

    Game(String title, String username) {
        this.title = title;
        this.username = username;
    }

    public String getTitle() {
        return title;
    }

    public String getUsername() {
        return username;
    }
    public abstract Game getSnapshot();
    public abstract void nextTurn();
    abstract void initializeBoard();
}

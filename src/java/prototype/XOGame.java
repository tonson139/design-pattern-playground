package src.java.prototype;

public class XOGame extends Game {
    private final String[] board = new String[9];

    public XOGame(String title, String username) {
        super(title, username);
    }

    @Override
    public Game getSnapshot() {
        return new XOGame(this.getTitle(), this.getUsername());
    }

    @Override
    public void nextTurn() {
        var random = Math.random() * 9;
        this.board[0] = random % 2 == 0 ? "player1" : "player2";
    }

    @Override
    public String toString() {
        return STR."XOGame{title='\{title}\{'\''}, username='\{username}\{'\''}, board='\{board}";
    }

    public void initializeBoard() {
        for (int i = 0; i < 9; i++) {
            board[i] = "empty";
        }
    }
}

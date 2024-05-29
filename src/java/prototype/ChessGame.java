package src.java.prototype;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ChessGame extends Game {
    private String[] board = new String[64];
    private int turnNumber = 0;

    public ChessGame(String title, String username) {
        super(title, username);
    }

    private ChessGame(String title, String username, String[] board) {
        super(title, username);
        this.board = board;
    }

    @Override
    public Game getSnapshot() {
        return new ChessGame(this.getTitle(), this.getUsername(), this.board.clone());
    }

    @Override
    public void nextTurn() {
        String random = String.valueOf(Math.random() * 10);
        this.board[turnNumber] = random;
        System.out.println(STR."Turn \{turnNumber} by \{this.board[turnNumber]} - random: \{random}");
        this.turnNumber++;
    }

    @Override
    public String toString() {
        return STR."ChessGame{title='\{title}\{'\''}, username='\{username}\{'\''}, board='\{Arrays.toString(board)}";
    }


    public void initializeBoard() {
        for (int i = 0; i < 64; i++) {
            board[i] = "empty";
        }
    }
}

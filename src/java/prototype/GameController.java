package src.java.prototype;

public class GameController {
    public static void main(String[] args) {
        GameHistory gameHistory = new GameHistory();
        Game game = new ChessGame("Chess", "player1");
        game.initializeBoard();
        // playing
        for (int i = 0; i < 10; i++) {
            game.nextTurn();
            gameHistory.save(i, game);
        }
        gameHistory.display();

        ChessGame history1 = (ChessGame) gameHistory.loadLastSave();
        history1.initializeBoard();
        history1.nextTurn();

        gameHistory.display();
    }
}

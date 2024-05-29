package src.java.prototype;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class GameHistory {
    private Map<Integer, Game> game = new HashMap<>();
    private Game lastSave;

    public void save(Integer turnNumber, Game game) {
        this.lastSave = game;
        this.game.put(turnNumber, game.getSnapshot());
    }

    public Game loadLastSave() {
        return lastSave;
    }

    public Game loadSave(Integer turnNumber) {
        return game.get(turnNumber);
    }

    public void display() {
        StringBuilder result = new StringBuilder("History of games: \n");
        for (Map.Entry<Integer, Game> entry : game.entrySet()) {
            result.append(STR."\{entry.getKey()} -> \{entry.getValue()}").append("\n");
        }
        System.out.println(result.toString());
    }
}

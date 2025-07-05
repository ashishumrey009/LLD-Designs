 import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Snake> snakes = Arrays.asList(
            new Snake(98, 54),
            new Snake(76, 25),
            new Snake(93, 73)
        );

        List<Ladder> ladders = Arrays.asList(
            new Ladder(2, 38),
            new Ladder(15, 44),
            new Ladder(22, 58)
        );

        List<Player> players = Arrays.asList(
            new Player("Alice"),
            new Player("Bob")
        );

        Board board = new Board(100, snakes, ladders);
        Game game = new Game(board, players);
        game.start();
    }
}


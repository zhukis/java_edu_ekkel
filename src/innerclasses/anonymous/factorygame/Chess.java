package innerclasses.anonymous.factorygame;

import interfaces.factory2.Game;
import interfaces.factory2.GameFactory;

public class Chess implements Game {
    private Chess() {}
    private int moves = 0;
    private static final int MOVES = 4;

    public boolean move() {
        System.out.println("Chess move " + moves);
        return ++moves != MOVES;
    }

    public static GameFactory factory = new GameFactory() {
        public Game getGame() {
            return new Chess();
        }
    };
}

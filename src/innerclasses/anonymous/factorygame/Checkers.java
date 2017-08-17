package innerclasses.anonymous.factorygame;

import interfaces.factory2.Game;
import interfaces.factory2.GameFactory;

public class Checkers implements Game {
    private Checkers() {}
    private int moves = 0;
    private static final int MOVES = 3;

    public boolean move() {
        System.out.println("Checkers move " + moves);
        return ++moves != MOVES;
    }

    public static GameFactory factory = new GameFactory() {
        @Override
        public Game getGame() {
            return new Checkers();
        }
    };
}

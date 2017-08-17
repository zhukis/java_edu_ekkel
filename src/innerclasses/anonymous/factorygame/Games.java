package innerclasses.anonymous.factorygame;

import interfaces.factory2.Game;
import interfaces.factory2.GameFactory;

public class Games {
    public static void playGame(GameFactory factory) {
        Game s = factory.getGame();
        while (s.move())
            ;
    }

    public static void main(String[] args) {
        playGame(Checkers.factory);
        playGame(Chess.factory);
    }
}

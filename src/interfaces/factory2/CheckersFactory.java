package interfaces.factory2;

public class CheckersFactory implements GameFactory {
    public Game getGame() {
        return new Checkers();
    }
}

package interfaces.factory2;

public class ChessFactory implements GameFactory {
    @Override
    public Game getGame() {
        return new Chess();
    }
}

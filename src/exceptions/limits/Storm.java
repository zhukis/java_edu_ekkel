package exceptions.limits;

public interface Storm {
    public void event() throws RainedOut;
    public void rainHard() throws RainedOut;
}

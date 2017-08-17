package interfaces.tasks.task19;

public class HeadTailFactory implements RandomableFactory {
    public Randomable getRandomable() {
        return new HeadTail();
    }
}

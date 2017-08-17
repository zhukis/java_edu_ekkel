package interfaces.tasks.task19;

public class DiceFactory implements RandomableFactory {
    public Randomable getRandomable() {
        return new Dice();
    }
}

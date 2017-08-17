package interfaces.tasks.task18;

public class BiCycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new BiCycle();
    }
}

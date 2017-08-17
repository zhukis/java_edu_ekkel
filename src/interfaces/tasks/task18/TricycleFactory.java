package interfaces.tasks.task18;

public class TricycleFactory implements CycleFactory {
    public Cycle getCycle() {
        return new Tricycle();
    }

}

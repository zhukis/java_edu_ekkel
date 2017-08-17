package interfaces.tasks.task18;

public class Demo {
    static void show(CycleFactory factory) {
        Cycle c = factory.getCycle();
        c.showCountWheels();
    }

    public static void main(String[] args) {
        show(new UnicycleFactory());
        show(new BiCycleFactory());
        show(new TricycleFactory());
    }
}

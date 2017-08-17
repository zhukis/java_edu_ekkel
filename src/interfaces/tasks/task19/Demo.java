package interfaces.tasks.task19;

public class Demo {
    public static void perform(RandomableFactory factory) {
        Randomable r = factory.getRandomable();
        System.out.println(r.makeAction());
    }

    public static void main(String[] args) {
        perform(new HeadTailFactory());
        perform(new DiceFactory());
    }
}

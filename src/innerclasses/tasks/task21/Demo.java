package innerclasses.tasks.task21;

public class Demo {
    public static void main(String[] args) {
        A[] array = {
                new A(),
                new A(),
                new A(),
        };
        B b = new B();

        for (A a : array) {
            b.setArray(a.makeU());
        }

        b.iterate();
        b.clearArray();
    }
}

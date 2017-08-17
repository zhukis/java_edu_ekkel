package innerclasses.closure;

public class MyIncrement {
    public void increment() {
        System.out.println("Another operation");
    }

    public static void f(MyIncrement mi) {
        mi.increment();
    }
}

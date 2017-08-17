package innerclasses.closure;

public class Callee1 implements Incrementable {
    private int i = 0;

    public void increment() {
        System.out.println(++i);
    }
}

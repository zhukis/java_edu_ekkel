package generics.generators;

import java.util.Iterator;

public class IterableFib implements Iterable<Integer> {
    private Fibonacci fibonacci;
    private int count = 0;

    public IterableFib(int count) {
        this.count = count;
        fibonacci = new Fibonacci();
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() {
                return count > 0;
            }

            public Integer next() {
                count--;
                return fibonacci.next();
            }
        };
    }

    public static void main(String[] args) {
        for (int i : new IterableFib(18))
            System.out.print(i + " ");
    }
}

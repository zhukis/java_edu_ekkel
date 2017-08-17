package collections.foreachanditerators;

import java.util.Arrays;

public class ArrayIsNotIterable {
    static <T> void test(Iterable<T> ib) {
        for (T t : ib)
            System.out.print(t + " ");
    }

    public static void main(String[] args) {
        test(Arrays.asList(1, 2, 3));
        int[] ints = new int[] {1, 2, 3, 4, 5};
//        test(ints);
        test(Arrays.asList(ints));

    }
}

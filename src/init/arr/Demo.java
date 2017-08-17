package init.arr;

import java.util.Arrays;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        int[] b = { 1, 2, 3, 4, 5 };
        int[] a;
        Random rand = new Random(47);
        a = new int[rand.nextInt(20)];
        System.out.println("Length a = " + a.length);
        System.out.println(Arrays.toString(a));

        Integer[] a1 = new Integer[rand.nextInt(20)];
        System.out.println("a1.length " + a1.length);

        for (int i = 0; i < a1.length; i++)
            a1[i] = rand.nextInt(500);

        System.out.println(Arrays.toString(a1));

        Integer[] a2 = {
                new Integer(1),
                new Integer(2),
                3
        };

        Integer[] a3 = new Integer[] {
                new Integer(1),
                new Integer(2),
                3
        };

        System.out.println(Arrays.toString(a2));
        System.out.println(Arrays.toString(a3));
    }
}

package operators.ariphm;

import java.util.Random;

public class Ariphm {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i, j, k;
        j = rand.nextInt(100) + 1;
        float v = rand.nextFloat();
        System.out.println(v);

        Random rand2 = new Random();
        double length = rand2.nextDouble() * 100;
        double time = rand2.nextInt();

        System.out.println(length + " " + time);
        System.out.println(length / time);

        int a;
        System.out.println(a = j);
    }

}

package manage.swch;

import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        Random rand = new Random(47);

//        for (int i = 0; i < 100; i++) {
//            int c = rand.nextInt(26) + 'a';
//            System.out.println((char) c + ", " + c + ": ");
//
//            switch (c) {
//                case 'a':
//                case 'e':
//                case 'i':
//                case 'o':
//                case 'u':
//                    System.out.println("glasnaya");
//                    break;
//                case 'y':
//                case 'w':
//                    System.out.println("condition glasnaya");
//                    break;
//                default:
//                    System.out.println("soglasnaya");
//            }
//        }

        System.out.println(fib(6));

    }

    static int fib(int value) {
        if (value < 3)
            return 1;

        return fib(value - 1) + fib(value - 2);
    }
}

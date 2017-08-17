package manage.For;

import java.util.Random;

public class ForDemo {
    public static void main(String[] args) {
        boolean isSimple = true;

        for (int i = 2; i < 100; i++) {
            isSimple = true;

            for (int j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    isSimple = false;
                    break;
                }
            }
            if (isSimple) System.out.println(i);
        }
    }
}

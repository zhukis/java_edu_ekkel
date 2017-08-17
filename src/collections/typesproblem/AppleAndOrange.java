package collections.typesproblem;

import java.util.ArrayList;

public class AppleAndOrange {

    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList();

        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
        }

//        apples.add(new Orange());

        for (Apple c : apples) {
            System.out.println(c.id());
        }
    }
}

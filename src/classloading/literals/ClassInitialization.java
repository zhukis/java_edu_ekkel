package classloading.literals;

import java.util.Random;

public class ClassInitialization {
    public static Random rand = new Random(47);

    public static void main(String[] args) {
        Class initable = Initable.class;

        System.out.println("After creation link on initable");

        // Not start process for initialization
        System.out.println(Initable.staticFinal);

        // Start initializtion
        System.out.println(Initable.staticFinal2);

        // Start initialization
        System.out.println(Initable2.staticNonFinal);

        System.out.println("After creations link on Initable3");
        System.out.println(Initable3.staticNonFinal);
    }
}

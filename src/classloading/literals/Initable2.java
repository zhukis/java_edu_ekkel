package classloading.literals;

public class Initable2 {
    static int staticNonFinal = 147;
    static {
        System.out.println("Initializations Initable2");
    }
}

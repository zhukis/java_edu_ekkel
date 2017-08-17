package classloading.literals;

public class Initable3 {
    static int staticNonFinal = 74;
    static {
        System.out.println("Initializtion Initable3");
    }
}

package operators.inc;

public class Demo {
    public static void main(String[] args) {
        int i = 1;

        System.out.println("i = " + i); // 1
        System.out.println("++i = " + ++i); // 2
        System.out.println("i++ = " + i++); // 2
        System.out.println("i = " + i); // 3
        System.out.println("--i = " + --i); // 2
        System.out.println("i-- = " + i--); // 2
        System.out.println("i = " + i); // 1
    }
}

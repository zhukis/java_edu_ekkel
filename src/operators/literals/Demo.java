package operators.literals;

public class Demo {
    public static void main(String[] args) {
        int i1 = 0x2f;
        byte b1 = (byte) 1000;
        byte b2 = 100;
        long n1 = 200L;
        long n3 = 200;
        long n4 = 0xf123;
        long n5 = 0123;
        float f1 = 1F;
        float f2 = 0.2f;

        System.out.println(Integer.toBinaryString(i1));
        System.out.println(Long.toBinaryString(n4));
        System.out.println(Long.toBinaryString(n5));
        System.out.println(Double.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
    }
}

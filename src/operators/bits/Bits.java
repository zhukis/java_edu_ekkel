package operators.bits;

public class Bits {
    public static void main(String[] args) {
        int a = 170;
        int b = 255;
        System.out.println(Integer.toBinaryString(a));
        System.out.println(Integer.toBinaryString(b));
        int result = a | b;
        System.out.println(Integer.toBinaryString(result));

        byte bt = 10;
        System.out.println(Integer.toBinaryString(bt << 10));

    }
}

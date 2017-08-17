package operators.bits;

public class Bits2 {
    static void printBinaryLong(String s, long l) {
        System.out.println("123");
    }

    public static void main(String[] args) {
        int i = -1;
        System.out.println(Integer.toBinaryString(i));
        i >>>= 10;
        System.out.println(Integer.toBinaryString(i));

        long l = -1;
        System.out.println("\n" + Long.toBinaryString(l));
        l >>>= 10;
        System.out.println(Long.toBinaryString(l));

        short s = -1;
        System.out.println("\n" + Integer.toBinaryString(s));
        s >>>= 10;
        System.out.println(Integer.toBinaryString(s));

        byte b = -1;
        System.out.println("\n" + Integer.toBinaryString(b));
        b >>>= 10;
        System.out.println(Integer.toBinaryString(b));
        b = -1;
        System.out.println(Integer.toBinaryString(b));
        System.out.println(Integer.toBinaryString(b >>> 10));

        long l1 = 2;
        printBinaryLong("123", 1);

        everyBit(189);
        System.out.println(Integer.toBinaryString('x'));
    }

    static void everyBit(int value) {
        System.out.println("\n\n\n\n\n\n\n");
        int length = (Integer.toBinaryString(value) + "").length();
        for (int i = 0; i < length; i++) {
            System.out.println(Integer.toBinaryString(value >>= 1));
        }
    }
}

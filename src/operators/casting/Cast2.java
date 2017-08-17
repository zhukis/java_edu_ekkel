package operators.casting;

public class Cast2 {
    public static void main(String[] args) {
        byte b = 127;
        int a = 500;
        System.out.println((byte) a);
        System.out.println(Byte.MIN_VALUE);
        System.out.println(500 % 127 + Byte.MIN_VALUE);

        comare("Ones", "One");
    }

    static void comare(String st1, String st2) {
        System.out.println(st1.compareTo(st2));
    }
}

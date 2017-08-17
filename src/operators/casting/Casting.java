package operators.casting;

public class Casting {
    public static void main(String[] args) {
        int i = 200;
        long lng = (long) i;
        lng = i;
        long lng2 = (long) 200;
        lng2 = 200;
        i = (int) lng2;
        float fabove = 0.7f;

        byte b1 = 100;
        byte b2 = 10;
        byte b3 = (byte) (b1 + b2);
    }
}

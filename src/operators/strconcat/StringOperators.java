package operators.strconcat;

public class StringOperators {
    public static void main(String[] args) {
        int x = 0, y = 1, z = 2;
        String s = "x, y, z";
        System.out.println(s + x + y + z); // "x, y, z012"
        System.out.println(x + " " + s); // "0 xyz"
        s += "(summed) = ";
        System.out.println(s + (x + y + z)); // "(summed) = 3"
        System.out.println("" + x); // 0
    }
}

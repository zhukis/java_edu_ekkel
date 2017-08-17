package strings.operations.format;

public class Demo {
    public static void main(String[] args) {
        int x = 5;
        double y = 5.332542;
        System.out.printf("Row 1: [%d %f]\n", x, y);
        System.out.format("Row 1: [%d %f]\n", x, y);
    }
}

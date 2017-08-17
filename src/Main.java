import java.io.IOException;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[][] a = new int[2][];
        a[0] = new int[] {1, 2, 3};
        a[1] = new int[] {4, 5, 6, 8};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

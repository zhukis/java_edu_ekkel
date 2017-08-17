package arrays.multy;

import java.util.Arrays;
import java.util.Random;

public class MultidimentionalArray {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6}
        };
        System.out.println(Arrays.deepToString(a));

        int[][][] a1 = new int[2][2][4];
        System.out.println(Arrays.deepToString(a1));



        Random rand = new Random(47);
        int a2[][][] = new int[rand.nextInt(7)][][];

        for (int i = 0; i < a2.length; i++) {
            a2[i] = new int[rand.nextInt(5)][];

            for (int j = 0; j < a2[i].length; j++)
                a2[i][j] = new int[rand.nextInt(5)];
        }

        System.out.println(Arrays.deepToString(a2));

    }
}

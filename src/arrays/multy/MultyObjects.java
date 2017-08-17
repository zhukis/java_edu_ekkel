package arrays.multy;

import arrays.basic.BerylliumSphere;

import java.util.Arrays;

public class MultyObjects {
    public static void main(String[] args) {
        BerylliumSphere[][] spheres = {
                { new BerylliumSphere(), new BerylliumSphere() },
                { new BerylliumSphere(), new BerylliumSphere(),
                        new BerylliumSphere(), new BerylliumSphere() },
                { new BerylliumSphere(), new BerylliumSphere(),
                    new BerylliumSphere(), new BerylliumSphere(),
                    new BerylliumSphere(), new BerylliumSphere(),
                    new BerylliumSphere(), new BerylliumSphere() }
        };

        System.out.println(Arrays.deepToString(spheres));
    }
}

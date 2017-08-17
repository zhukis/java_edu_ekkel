package collections.sets;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class SetOfInteger {
    public static void main(String[] args) {
        Random rand = new Random(47);
        Set<Integer> intset = new TreeSet<>();

        for (int i = 0; i < 10000; i++)
            intset.add(rand.nextInt(30));

        System.out.println(intset);
    }
}

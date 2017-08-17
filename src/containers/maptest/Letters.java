package containers.maptest;

import containers.mapgen.Pair;
import util.Generator;

import java.util.Iterator;

public class Letters implements Generator<Pair<Integer, String>>, Iterable<Integer> {
    private int size = 9;
    private int number = 1;
    private char letter = 'A';

    public Pair<Integer, String> next() {
        return new Pair<Integer, String>(number++, "" + letter++);
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            public boolean hasNext() {
                return number < size;
            }

            public Integer next() {
                return number++;
            }
        };
    }
}

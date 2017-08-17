package containers.fillgen;

import util.Generator;

import java.util.LinkedHashSet;
import java.util.Set;

class Government implements Generator<String> {
    String[] foundation = ("strange women lying in ponds " +
        "distributing swords is no basis for a system of " +
        "government").split(" ");
    private int index;

    public String next() {
        return foundation[index++];
    }
}

public class CollectionDataSet {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>(
                new CollectionData<String>(new Government(), 15));
        System.out.println(set);
        set.addAll(CollectionData.list(new Government(), 15));
        System.out.println(set);
    }
}

package arrays.generators;

import util.CollectionData;

public class Generated {
    public static <T> T[] array(T[] a, util.Generator<T> gen) {
        return new CollectionData<T>(gen, a.length).toArray(a);
    }

    @SuppressWarnings("unchecked")
    public static <T> T[] array(Class<T> type, util.Generator<T> gen, int size) {
        T[] a = (T[])java.lang.reflect.Array.newInstance(type, size);

        return new CollectionData<T>(gen, size).toArray(a);
    }
}

package generics.clearing.arrays;

import java.lang.reflect.Array;

public class GenericArrWithTypeToken<T> {
    private T[] array;

    @SuppressWarnings("unchecked")
    public GenericArrWithTypeToken(Class<T> type, int sz) {
        array = (T[]) Array.newInstance(type, sz);
    }

    public void put(int index, T item) {
        array[index] = item;
    }

    public T get(int index) {
        return array[index];
    }

    public T[] rep() {
        return array;
    }

    public static void main(String[] args) {
        GenericArrWithTypeToken<Integer> gai = new GenericArrWithTypeToken<>(
                Integer.class, 10);
        Integer[] ia = gai.rep();
    }
}

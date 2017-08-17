package generics.clearing.a3;

public class GenericBase<T> {
    private T element;
    public void set(T arg) {
        arg = element;
    }

    public T get() {
        return element;
    }
}

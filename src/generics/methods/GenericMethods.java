package generics.methods;

public class GenericMethods {
    public <T> void f(T x) {
        System.out.println(x.getClass().getName());
    }

    public <T, U, V> void g(T x, U y, V z) {
        f(x);
        f(y);
        f(z);
    }

    public static void main(String[] args) {
        GenericMethods gm = new GenericMethods();

        gm.f("");
        gm.f(1);
        gm.f(1.0);
        gm.f(1.0F);
        gm.f('c');
        gm.f(gm);

        gm.g(1, 1.2, "Google");
    }
}

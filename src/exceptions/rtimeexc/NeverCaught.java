package exceptions.rtimeexc;

public class NeverCaught {
    static void f() {
        throw new RuntimeException("From f()");
    }

    static void g() {
        f();
    }

    public static void main(String[] args) {
        g();
        System.out.println("123");
    }
}

package inhcompos.inherit.a3;

public class C extends A {
    private B b = new B();

    C() {
        System.out.println("C constr");
    }

    public static void main(String[] args) {
        C c = new C();
    }
}

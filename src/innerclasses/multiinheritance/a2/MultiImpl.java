package innerclasses.multiinheritance.a2;

class D {}
abstract class E {}

class Z extends D {
    E makeE() {
        return new E() {};
    }
}

public class MultiImpl {
    static void takesD(D d) {}
    static void takesE(E e) {}

    public static void main(String[] args) {
        Z z = new Z();
        takesD(z);
        takesE(z.makeE());
    }
}

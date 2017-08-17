package classloading.comparison;

class Base { }
class Derived extends Base { }

public class FamilyBsExactType {
    static void test(Object x) {
        System.out.println("test x " + x.getClass());
        System.out.println("x instance of Base: " + (x instanceof Base));
        System.out.println("x instance of Derived: " + (x instanceof Derived));
        System.out.println("Base.isInstance(x): " + Base.class.isInstance(x));
        System.out.println("Derived.isInstance(x): " + Derived.class.isInstance(x));
        System.out.println("x.getClass() == Base.class " + (x.getClass() == Base.class));
        System.out.println("x.getClass == Derived.class " + (x.getClass() == Derived.class));
        System.out.println("x.getClass().equals(Base.class) " + (x.getClass().equals(Base.class)));
        System.out.println("x.getClass().equals(Derived.class) " + (x.getClass().equals(Derived.class)));
    }

    public static void main(String[] args) {
        test(new Base());
        System.out.println();
        test(new Derived());
    }
}

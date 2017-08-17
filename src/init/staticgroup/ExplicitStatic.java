package init.staticgroup;

public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.cup1.f(99);

        System.out.println("\n");
        TaskClass.showStatic();
    }

    static Cups cups1 = new Cups();
    static Cups cups2 = new Cups();
}

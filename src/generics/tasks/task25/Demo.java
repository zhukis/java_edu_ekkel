package generics.tasks.task25;

public class Demo {
    public static void main(String[] args) {
        Impls impls = new Impls();
        Impls impls2 = new Impls();

        impls.doA(impls2);
        impls.doB(impls2);
    }
}

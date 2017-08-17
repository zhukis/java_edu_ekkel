package generics.tasks.task25;

interface A {
    void showA();
}
interface B {
    void showB();
}

public class Impls implements A, B {
    public void showA() {
        System.out.println("This is A");
    }

    public void showB() {
        System.out.println("This is B");
    }

    public <T extends A> void doA(T t) {
        t.showA();
    }

    public <T extends B> void doB(T t) {
        t.showB();
    }
}

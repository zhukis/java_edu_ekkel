package innerclasses.tasks.task9;

public class MyParcell {
    private class HidedClass implements OpenInterface {
        public void doSmth() {
            System.out.println("Make smth");
        }
    }

    OpenInterface getObject() {
        return new HidedClass();
    }
}

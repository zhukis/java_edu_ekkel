package innerclasses.tasks.task9;

public class Test {
    public static void main(String[] args) {
        MyParcell p = new MyParcell();
        OpenInterface o = p.getObject();
        o.doSmth();
    }
}

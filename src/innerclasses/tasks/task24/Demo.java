package innerclasses.tasks.task24;

public class Demo {
    public static void main(String[] args) {
        A a = new A();
        C c = new C(a, 10);
        System.out.println(c.getValue());
    }
}

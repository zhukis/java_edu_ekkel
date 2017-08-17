package inhcompos.inherit.fnl.a1;

public class Demo {
    int a;

    public Demo() {
        a = 10;
    }

    public static void main(String[] args) {
        final int a;
        a = 5;

        Demo demo = new Demo();
        System.out.println(demo.a);
    }
}

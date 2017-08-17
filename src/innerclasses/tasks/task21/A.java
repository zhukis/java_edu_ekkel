package innerclasses.tasks.task21;

public class A {
    U makeU() {
        return new U() {
            public void u1(String s) {
                System.out.println(s);
            }
            public void u2(int i) {
                System.out.println(i);
            }
            public void u3(boolean b) {
                System.out.println(b);
            }
        };
    }
}

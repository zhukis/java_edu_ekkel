package init.staticgroup;

public class TaskClass {
    static String st1 = "init1";
    static String st2;
    static {
        st2 = "init2";
    }

    static void showStatic() {
        System.out.println("St1: " + st1);
        System.out.println("St2: " + st2);
    }
}

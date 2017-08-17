package annotations.junit;

import atunit.Test;
import io.process.OSExecute;

public class AtUnitExample1 {
    public String methodOne() {
        return "This is methodOne";
    }

    public int methodTwo() {
        System.out.println("This is methodTwo");
        return 2;
    }

    @Test boolean methodOneTest() {
        return methodOne().equals("This is methodOne");
    }

    @Test boolean m2() {
        return methodTwo() == 2;
    }

    @Test private boolean m3() {
        return true;
    }

    @Test boolean failureTest() {
        return false;
    }

    @Test boolean anotherDissappointment() {
        return false;
    }

    public static void main(String[] args) throws Exception {
        OSExecute.command("java d:\\Programming\\Idea\\JAVA_EDU\\java_edu_ekkel\\out\\production\\java_edu_ekkel\\atunit\\AtUnit d:\\Programming\\Idea\\JAVA_EDU\\java_edu_ekkel\\out\\production\\java_edu_ekkel\\annotations\\junit\\AtUnitExample1");
    }
}

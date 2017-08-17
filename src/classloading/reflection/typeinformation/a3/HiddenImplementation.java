package classloading.reflection.typeinformation.a3;

import classloading.reflection.typeinformation.a1.A;
import classloading.reflection.typeinformation.a2.HiddenC;

import java.lang.reflect.Method;

public class HiddenImplementation {
    static void callHiddenMethod(Object a, String methodName) throws Exception {
        Method g = a.getClass().getDeclaredMethod(methodName);
        g.setAccessible(true);
        g.invoke(a);
    }

    public static void main(String[] args) throws Exception {
        A a = HiddenC.makeA();
        a.f();
        System.out.println(a.getClass().getName());

        /*if (a instanceof C) {
            C c = (C) a;
            c.g();
        }*/

        // Suprose
        callHiddenMethod(a, "g");
        callHiddenMethod(a, "v");
        callHiddenMethod(a, "w");
    }
}

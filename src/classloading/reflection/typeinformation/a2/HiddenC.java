package classloading.reflection.typeinformation.a2;

import classloading.reflection.typeinformation.a1.A;

public class HiddenC {
    public static A makeA() {
        return new C();
    }
}

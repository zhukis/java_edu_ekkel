package accessmanag.pckg.access2;

public class Lunch {
    void testPrivate() {
//        Soup1 soup = new Soup1();
    }

    void testStatic() {
        Soup1 soup = Soup1.makeSoup();
    }

    void testSingleton() {
        Soup2.access().f();
    }
}

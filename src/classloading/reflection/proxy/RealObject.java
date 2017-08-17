package classloading.reflection.proxy;

public class RealObject implements Interface {
    public void doSomething() {
        System.out.println("Do something");
    }

    public void somethingElse(String arg) {
        System.out.println("Something else " + arg);
    }
}

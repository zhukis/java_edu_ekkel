package innerclasses.anonymous.factory;

import interfaces.factory.Implementation2;
import interfaces.factory.Implementations1;
import interfaces.factory.Service;
import interfaces.factory.ServiceFactory;

public class Implementation1 implements Service {
    private Implementation1() {}

    public void method1() {
        System.out.println("Implementation1 method1");
    }

    public void method2() {
        System.out.println("Implementation1 method2");
    }

    public static ServiceFactory factory = new ServiceFactory() {
        public Service getService() {
            return new Implementation1();
        }
    };
}

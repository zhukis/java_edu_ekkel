package classloading.getclass;

public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() + "; Is interface: " +
            cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName());
        System.out.println("Canonical name: " + cc.getCanonicalName());

    }

    public static void main(String[] args) {
        Class c = null;

        try {
            c = Class.forName("classloading.getclass.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Cannot find FancyToy");
            System.exit(1);
        }

        printInfo(c);

        System.out.println();
        for (Class face : c.getInterfaces())
            printInfo(face);

        Class up = c.getSuperclass();
        Object obj = null;

        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Cannot create object");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Access denied");
            System.exit(1);
        }

        printInfo(obj.getClass());
    }
}

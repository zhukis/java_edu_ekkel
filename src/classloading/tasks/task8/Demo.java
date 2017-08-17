package classloading.tasks.task8;

import classloading.getclass.FancyToy;

import java.lang.reflect.Field;

public class Demo {
    static void getHierarchy(Class c) {
        Class superClass = c.getSuperclass();

        if (!superClass.getSimpleName().equals("Object")) {
            getHierarchy(superClass);
        }

        System.out.println(c.getSimpleName());

        System.out.println("Fields:");
        for (Field f : c.getDeclaredFields()) {
            System.out.println(f.getName());
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        getHierarchy(Class.forName("classloading.getclass.FancyToy"));
    }
}

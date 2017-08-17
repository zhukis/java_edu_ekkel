package enums.strangevalues;

import io.process.OSExecute;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Enumeration;
import java.util.Set;
import java.util.TreeSet;

public class Reflection {
    public static Set<String> analizy(Class<?> enumClass) {
        System.out.println("------- Analyzing " + enumClass + " -------");
        System.out.println("Interfaces:");

        for (Type t : enumClass.getGenericInterfaces())
            System.out.println(t);

        System.out.println("Base: " + enumClass.getSuperclass());

        System.out.println("Methods: ");

        Set<String> methods = new TreeSet<>();
        for (Method m : enumClass.getMethods())
            methods.add(m.getName());

        System.out.println(methods);

        return methods;
    }

    public static void main(String[] args) {
        Set<String> exploreMethods = analizy(Explore.class);
        Set<String> enumMethods = analizy(Enum.class);

        System.out.println("Explore.containsAll(Enum)? " +
            exploreMethods.containsAll(enumMethods));

        System.out.print("Explore.removeAll(Enum): ");
        exploreMethods.removeAll(enumMethods);

        System.out.println(exploreMethods);

        OSExecute.command("javap Explore");
    }
}

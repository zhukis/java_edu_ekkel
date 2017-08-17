package objects.hello;

import java.util.Date;

//: object/ShowProperties.java

public class Demo {
    public static void main(String args[]) {
        System.out.println("Hello, today is ");
        System.out.println(new Date());

        System.getProperties().list(System.out);
        System.out.println(System.getProperty("user.name"));
        System.out.println(System.getProperty("java.library.path"));
    }
} /// :~

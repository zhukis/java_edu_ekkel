package classloading.literals;

public class Demo {
    public static void main(String[] args) {
        System.out.println(boolean.class.equals(Boolean.TYPE));
        System.out.println(Boolean.class.equals(boolean.class));
    }
}

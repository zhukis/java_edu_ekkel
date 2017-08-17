package init.constr;

public class Demo {
    public static void main(String[] args) {
        A a = new A();
        A a1 = new A("123");
        Dog dog = new Dog();
        dog.bark(1);
        dog.bark(1.1);

        new Person().eat(new Apple());
    }
}

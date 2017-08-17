package init.constrcallconstr;

public class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(int petals) {
        petalCount = petals;
        System.out.println("Constructor with params int, petalCount = "
                + petalCount);
    }

    Flower(String ss) {
        System.out.println("constructor with params String, s = " + ss);
        s = ss;
    }

    Flower(String s, int petals) {
        this(petals);
        // this(s);
        this.s = s;
        System.out.println("Args String and int");
    }

    Flower() {
        this("hi", 47);
        System.out.println("Constructor without params");
    }

    void printPetalCount() {
        // this(11); // Forbidden. Only in constructors
        System.out.println("petalCount = " + petalCount + " s = " + s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}

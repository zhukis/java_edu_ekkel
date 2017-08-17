package init.init;

public class InitialValues {
    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitialValues reference;

    void printInitValues() {
        System.out.println(t);
        System.out.println(c);
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
    }

    public static void main(String[] args) {
        InitialValues iv = new InitialValues();
        iv.printInitValues();
//        new InitialValues().printInitValues();
    }
}

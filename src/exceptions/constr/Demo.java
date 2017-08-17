package exceptions.constr;

class MyException1 extends Exception {
    private String str;

    MyException1() {}

    public MyException1(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }
}

public class Demo {
    public static void doSmth() throws MyException1 {
        throw new MyException1("Google Chrome");
    }

    public static void main(String[] args) {
        try {
            doSmth();
        } catch (MyException1 e) {
            System.out.println(e.getStr());
        }
    }
}

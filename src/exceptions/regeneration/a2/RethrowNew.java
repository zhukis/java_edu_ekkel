package exceptions.regeneration.a2;

class OneException extends Exception {
    public OneException(String s) {
        super(s);
    }
}

class TwoException extends Exception {
    public TwoException(String s) {
        super(s);
    }
}

public class RethrowNew {
    public static void f() throws OneException {
        System.out.println("Creation of exceptions in f()");
        throw new OneException(" from f()");
    }

    public static void main(String[] args) {
        try {
            try {
                f();
            } catch (OneException e) {
                System.out.println("Caught in internal try, e.printStackTrace");
                e.printStackTrace(System.out);
                throw new TwoException("from internal block try");
            }
        } catch (TwoException e) {
            System.out.println("Caught in internal block try, e.printStackTrace()");
            e.printStackTrace(System.out);
        }
    }
}

package exceptions.fnl;

class ThreeException extends Exception {}

public class FinallyWorks {
    static int count = 0;

    public static void main(String[] args) {
        while (true) {
            try {
                if (count++ == 0)
                    throw new ThreeException();
                System.out.println("No Excepion");
            } catch (ThreeException e) {
                System.out.println("ThreeException");
            } finally {
                System.out.println("In blovk finally");
                if (count == 2) break;
            }
        }
    }
}
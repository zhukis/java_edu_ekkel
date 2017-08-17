package exceptions.infoclass;

public class ExceptionMethods {
    public static void main(String[] args) {
        try {
            throw new Exception("My exceptions");
        } catch (Exception e) {
            System.out.println("Caught");
            System.out.println("getMessage(): " + e.getMessage() + "\n\n");
            System.out.println("getLocalizedMessage(): " + e.getLocalizedMessage() + "\n\n");
            System.out.println("toString(): " + e + "\n\n");
            System.out.println("printStackTrace(): ");
            e.printStackTrace(System.out);
        }
    }
}

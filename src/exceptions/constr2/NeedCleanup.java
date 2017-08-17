package exceptions.constr2;

public class NeedCleanup {
    private static long counter = 1;
    private final long id = counter++;
    public void dispose() {
        System.out.println("NeedsCleanup " + id + " released");
    }
}

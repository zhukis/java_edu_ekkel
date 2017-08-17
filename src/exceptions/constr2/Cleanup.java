package exceptions.constr2;

public class Cleanup {
    public static void main(String[] args) {
        try {
            InputFile in = new InputFile("Cleanup.java");

            try {
                String s;
                int i = 1;
                while ((s = in.getLine()) != null)
                    ; // Reading lines
            } catch (Exception e) {
                System.out.println("Caught from Exception in main");
                e.printStackTrace(System.out);
            } finally {
                in.dispose();
            }
        } catch (Exception e) {
            System.out.println("Error during construction");
        }
    }
}

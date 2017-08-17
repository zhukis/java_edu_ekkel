package exceptions.fnlreturn;

public class MultipleReturns {
    public static void f(int i) {
        System.out.println("Initialization, need closing");

        try {
            System.out.println("Point 1");
            if (i == 1) return;

            System.out.println("Point 2");
            if (i == 2) return;

            System.out.println("POint 3");
            System.out.println("Finish");
            return;
        } finally {
            System.out.println("Completing actions...\n");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            f(i);
        }
    }
}

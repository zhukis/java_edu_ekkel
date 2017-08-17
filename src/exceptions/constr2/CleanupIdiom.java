package exceptions.constr2;

public class CleanupIdiom {
    public static void main(String[] args) {
        // Part1
        NeedCleanup nc1 = new NeedCleanup();
        try {
            //
        } finally {
            nc1.dispose();
        }

        // Part2
        NeedCleanup nc2 = new NeedCleanup();
        NeedCleanup nc3 = new NeedCleanup();
        try {
            // ...
        } finally {
            nc3.dispose();
            nc2.dispose();
        }

        // Part3
        try {
            NeedCleanup2 nc4 = new NeedCleanup2();
            try {
                NeedCleanup2 nc5 = new NeedCleanup2();
                try {
                    // ...
                } finally {
                    nc5.dispose();
                }
            } catch (ConstructionException e) {
                System.out.println(e);
            } finally {
                nc4.dispose();
            }
        } catch (ConstructionException e) {
            System.out.println(e);
        }
    }
}

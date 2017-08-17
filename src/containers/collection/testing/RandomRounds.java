package containers.collection.testing;

public class RandomRounds {
    static void usage() {
        System.out.println("Usage:");
        System.out.println("\tRandomBounds lower");
        System.out.println("\tRandom upper");
        System.exit(1);
    }

    public static void main(String[] args) {
        if (args.length != 1) usage();

        if (args[0].equals("lower")) {
            while (Math.random() != 0.0);
            System.out.println("Produced 0.0!");
        } else if (args[0].equals("upper")) {
            while (Math.random() != 1.0);
            System.out.println("Produced 1.0!");
        } else
            usage();
    }
}

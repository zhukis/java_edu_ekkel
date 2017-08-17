package generics.anonymous;

import generics.generators.Generator;

public class Teller {
    private static long counter = 1;
    private final long id = counter++;
    public String toString() { return "Teller " + id; }
    private Teller() {}

    public static Generator<Teller> generator =
            new Generator<Teller>() {
                public Teller next() {
                    return new Teller();
                }
            };
}

package generics.problems.selfbounded;

class GenericType<T> {}

public class CuriouslyRecurringGeneric
        extends GenericType<CuriouslyRecurringGeneric> {
}

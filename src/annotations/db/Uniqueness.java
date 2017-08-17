package annotations.db;

public @interface Uniqueness {
    Constraints constraints() default @Constraints(unique = true);
}

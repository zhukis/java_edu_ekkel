package generics.clearing.createobject.a3_patternmethod;

abstract class GenericWithCreate<T> {
    final T element;
    GenericWithCreate() {
        element = create();
    }
    abstract T create();
}

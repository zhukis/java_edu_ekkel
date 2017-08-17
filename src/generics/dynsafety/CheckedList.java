package generics.dynsafety;

import collections.typeinfo.pets.*;
import java.util.*;

public class CheckedList {
    @SuppressWarnings("unchecked")
    static void oldStyleMethod(List probablyDogs) {
        probablyDogs.add(new Cat());
    }

    public static void main(String[] args) {
        List<Dog> dog1 = new ArrayList<Dog>();
        oldStyleMethod(dog1);

        List<Dog> dog2 = Collections.checkedList(
                new ArrayList<Dog>(), Dog.class);

        try {
            oldStyleMethod(dog2);
        } catch (Exception e) {
            System.out.println(e);
        }

        List<Pet> pets = Collections.checkedList(
                new ArrayList<Pet>(), Pet.class);

        pets.add(new Dog());
        pets.add(new Cat());
    }
}

package generics.tasks.task1;

import classloading.casting.Animals.Pet;
import classloading.casting.Animals.Rat;

public class Demo {
    public static void main(String[] args) {
        PetContainer<Pet> container = new PetContainer<>(new Rat("Mock"));

    }
}

package collections.linked;

import collections.typeinfo.pets.Hamster;
import collections.typeinfo.pets.Pet;
import collections.typeinfo.pets.Pets;
import collections.typeinfo.pets.Rat;

import java.util.LinkedList;

public class LinkedListFeatures {
    public static void main(String[] args) {
        LinkedList<Pet> pets = new LinkedList<>(Pets.arrayList(5));
        System.out.println(pets);

        // Equals
        System.out.println("pets.getFirst(): " + pets.getFirst());
        System.out.println("pets.element(): " + pets.element());
        // null instead of exceptions
        System.out.println("pets.peek(): " + pets.peek());

        // remove and return first value
        System.out.println("pets.remove(): " + pets.remove());
        System.out.println("pets.removeFirst(): " + pets.removeFirst());

        // Empty difference
        System.out.println("pets.poll(): " + pets.poll());
        System.out.println(pets);

        pets.addFirst(new Rat());
        System.out.println("After addFirst(): " + pets);

        // Add to last
        pets.offer(Pets.randomPet());
        System.out.println("After offer(): " + pets);

        pets.add(Pets.randomPet());
        System.out.println("After add(): " + pets);

        pets.addLast(new Hamster());
        System.out.println("After addLast(): " + pets);

        System.out.println("pets.removeLast(): " + pets.removeLast());
    }
}

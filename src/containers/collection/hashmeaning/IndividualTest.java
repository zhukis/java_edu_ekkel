package containers.collection.hashmeaning;

import collections.maps.MapOfList;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class IndividualTest {
    public static void main(String[] args) {
        Set<collections.typeinfo.pets.Pet> pets = new TreeSet<>();

        for (List<? extends collections.typeinfo.pets.Pet> lp : MapOfList.petPeople.values())
            for (collections.typeinfo.pets.Pet p : lp)
                pets.add(p);

        System.out.println(pets);
    }
}

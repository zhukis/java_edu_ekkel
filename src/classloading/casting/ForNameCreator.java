package classloading.casting;

import classloading.casting.Animals.Pet;

import java.util.*;

public class ForNameCreator extends PetCreator {
    private static List<Class<? extends Pet>> types =
            new ArrayList<Class<? extends Pet>>();

    private static String[] typeNames = {
            "classloading.casting.Animals.Mutt",
            "classloading.casting.Animals.Pug",
            "classloading.casting.Animals.EgyptianMau",
            "classloading.casting.Animals.Manx",
            "classloading.casting.Animals.Cymric",
            "classloading.casting.Animals.Rat",
            "classloading.casting.Animals.Mouse",
            "classloading.casting.Animals.Hamster",
    };

    @SuppressWarnings("unchecked")
    private static void loader() {
        try {
            for (String name : typeNames)
                types.add(
                        (Class<? extends Pet>) Class.forName(name));
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    static {
        loader();
    }

    public List<Class<? extends Pet>> types() {
        return types;
    }
}

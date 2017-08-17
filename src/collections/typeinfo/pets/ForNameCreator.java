//: typeinfo/pets/ForNameCreator.java
package collections.typeinfo.pets;
import java.util.*;

public class ForNameCreator extends PetCreator {
  private static List<Class<? extends Pet>> types =
    new ArrayList<Class<? extends Pet>>();
  // Types that you want to be randomly created:
  private static String[] typeNames = {
    "collections.typeinfo.pets.Mutt",
    "collections.typeinfo.pets.Pug",
    "collections.typeinfo.pets.EgyptianMau",
    "collections.typeinfo.pets.Manx",
    "collections.typeinfo.pets.Cymric",
    "collections.typeinfo.pets.Rat",
    "collections.typeinfo.pets.Mouse",
    "collections.typeinfo.pets.Hamster"
  };	
  @SuppressWarnings("unchecked")
  private static void loader() {
    try {
      for(String name : typeNames)
        types.add(
          (Class<? extends Pet>)Class.forName(name));
    } catch(ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
  static { loader(); }
  public List<Class<? extends Pet>> types() {return types;}
} ///:~

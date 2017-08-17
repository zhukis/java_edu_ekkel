//: typeinfo/pets/Cat.java
package classloading.casting.Animals;

public class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }

    public Cat() {
        super();
    }

    public static void main(String[] args) {
        Pet pet = new Pet("Mikky");
        System.out.println(pet instanceof Cat);
    }
} ///:~

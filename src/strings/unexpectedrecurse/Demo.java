package strings.unexpectedrecurse;

import strings.coffee.Coffee;
import strings.coffee.CoffeeGenerator;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Coffee> coffees = new ArrayList<Coffee>();
        for (Coffee c : new CoffeeGenerator(10))
            coffees.add(c);
        System.out.println(coffees);
    }
}

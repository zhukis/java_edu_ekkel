package generics.jokers.restriction;

import java.util.ArrayList;
import java.util.List;

public class GenericsAndCovariance {
    public static void main(String[] args) {
        List<? extends Fruit> flist = new ArrayList<Apple>();
//        flist.add(new Apple());
//        flist.add(new Fruit());
//        flist.add(new Object());
        flist.add(null);
        Fruit f = flist.get(0);
    }
}

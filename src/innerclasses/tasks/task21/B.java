package innerclasses.tasks.task21;

import java.util.ArrayList;
import java.util.List;

public class B {
    List<U> array;

    public B() {
        array = new ArrayList<U>();
    }

    public void setArray(U elem) {
        array.add(elem);
    }

    public void clearArray() {
        array = null;
    }

    public void iterate() {
        for (U u : array) {
            u.u1("My string");
            u.u2(10);
            u.u3(false);
        }
    }

}

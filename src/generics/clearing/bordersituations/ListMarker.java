package generics.clearing.bordersituations;

import java.util.ArrayList;
import java.util.List;

public class ListMarker<T> {
    List<T> create() {
        return new ArrayList<T>();
    }

    public static void main(String[] args) {
        ListMarker<String> stringListMarker = new ListMarker<>();
        List<String> stringList = stringListMarker.create();
    }
}

package enums.enumset;

import java.util.EnumSet;
import static enums.enumset.AlarmPoints.*;

public class EnumSets {
    public static void main(String[] args) {
        EnumSet<AlarmPoints> points = EnumSet.noneOf(AlarmPoints.class);
        points.add(BATHROOM);
        points.addAll(EnumSet.of(STAIR1, STAIR2, KITCHEN));

        System.out.println(points);

        points = EnumSet.allOf(AlarmPoints.class);
        points.removeAll(EnumSet.of(STAIR1, STAIR2, KITCHEN));

        System.out.println(points);

        points = EnumSet.complementOf(points);
        System.out.println(points);
    }
}

package enums.enummap;

import enums.enumset.AlarmPoints;
import static enums.enumset.AlarmPoints.*;
import java.util.EnumMap;
import java.util.Map;

public class EnumMaps {
    public static void main(String[] args) {
        EnumMap<AlarmPoints, Command> em = new EnumMap<>(AlarmPoints.class);

        em.put(KITCHEN, () -> System.out.println("Kitchen fire!"));

        em.put(BATHROOM, () -> System.out.println("Bathroom alert!"));

        em.put(STAIR1, () -> System.out.println("STAIR1 alert!"));

        for (Map.Entry<AlarmPoints, Command> e : em.entrySet()) {
            System.out.print(e.getKey() + ": ");
            e.getValue().action();
        }

        try { // If there's no value for a particular key:
            em.get(UTILITY).action();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

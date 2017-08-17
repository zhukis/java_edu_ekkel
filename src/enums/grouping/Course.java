package enums.grouping;

import enums.randchoise.Enums;

public enum Course {
    APPETIZER(Food.MainCourse.class),
    MAINCOURS(Food.MainCourse.class),
    DESSERT(Food.Dessert.class),
    COFFEE(Food.Coffee.class);

    private Food[] values;

    private Course(Class<? extends Food> kind) {
        values = kind.getEnumConstants();
    }

    public Food randomSelection() {
        return Enums.random(values);
    }
}

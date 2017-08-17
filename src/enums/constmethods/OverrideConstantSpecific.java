package enums.constmethods;

public enum OverrideConstantSpecific {
    NUT, BOLT,
    WASHER {
        void f() {
            System.out.println("Overridden method");
        }
    };
    void f() {
        System.out.println("default behavior");
    }

    public static void main(String[] args) {
        for (OverrideConstantSpecific osc : values()) {
            System.out.print(osc + ": ");
            osc.f();
        }
    }
}

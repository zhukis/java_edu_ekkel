package polymorh.distruct;

public class Characteristic {
    private String s;

    Characteristic(String s) {
        this.s = s;
        System.out.println("Create Characteristic " + s);
    }

    protected void dispose() {
        System.out.println("Complete Characteristic " + s);
    }
}

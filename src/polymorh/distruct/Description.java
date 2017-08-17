package polymorh.distruct;

public class Description {
    private String s;

    Description(String s) {
        this.s = s;
        System.out.println("Create Description " + s);
    }

    protected void dispose() {
        System.out.println("Complete Description " + s);
    }
}

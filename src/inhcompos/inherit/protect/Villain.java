package inhcompos.inherit.protect;

public class Villain {
    private String name;
    protected void set(String name) {
        this.name = name;
    }
    public Villain(String name) {
        this.name = name;
    }

    public String toString() {
        return "I am Villain and my name is " + name;
    }
}

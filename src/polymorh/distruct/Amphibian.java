package polymorh.distruct;

public class Amphibian extends Animal {
    private Characteristic p = new Characteristic("can live in water");
    private Description t = new Description("both in water and on the groud");

    Amphibian() {
        System.out.println("Amphibian()");
    }

    protected void dispose() {
        System.out.println("dispose() in Amphibian ");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

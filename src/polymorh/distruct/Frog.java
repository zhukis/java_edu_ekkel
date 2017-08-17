package polymorh.distruct;

public class Frog extends Amphibian {
    private Characteristic p = new Characteristic("quack");
    private Description t = new Description("eat beetles");
    public Frog() {
        System.out.println("Frog()");
    }

    protected void dispose() {
        System.out.println("dispose() in Frog ");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        frog.dispose();
    }
}

package polymorh.distruct;

public class Animal extends LivingCreature {
    private Characteristic p = new Characteristic("has heard");
    private Description t = new Description("animal, not plant");

    Animal() {
        System.out.println("Animal()");
    }

    protected void dispose() {
        System.out.println("dispose() in Animal ");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

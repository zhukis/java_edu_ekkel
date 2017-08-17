package polymorh.distruct;

public class LivingCreature {
    private Characteristic p = new Characteristic("live being");
    private Description t = new Description("simple live being");

    LivingCreature() {
        System.out.println("LivingCreature()");
    }

    protected void dispose() {
        System.out.println("dispose() in LivingCreature ");
        t.dispose();
        p.dispose();
    }
}

package inhcompos.inherit.fnl.initinherit;

public class Beetle extends Insect {
    private int k = printInit("Field Beetle.k inited");

    public Beetle() {
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }

    private static int x2 = printInit("Field static Beetle.x2 inited");

    public static void main(String[] args) {
        System.out.println("Constructor Beetle");
        Beetle b = new Beetle();
    }
}

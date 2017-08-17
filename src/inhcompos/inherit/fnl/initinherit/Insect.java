package inhcompos.inherit.fnl.initinherit;

public class Insect {
    private int i = 9;
    protected int j;
    private int p = printInit("Field Insect.p inited");

    Insect() {
        System.out.println("i = " + i + ", j = " + j);
        j = 39;
    }

    private static int x1 = printInit("Filed static Insect.x1 inited");

    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }

}

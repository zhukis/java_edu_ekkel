package inhcompos.inherit.convert.task;

public class Demo {
    public static void main(String[] args) {
        Frog frog = new Frog();
        Amphibian amphibian = frog;

        amphibian.sound();
        amphibian.move();
    }
}

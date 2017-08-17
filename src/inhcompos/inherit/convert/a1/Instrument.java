package inhcompos.inherit.convert.a1;

public class Instrument {
    public void play() {}
    static void tune(Instrument i) {
        i.play();
    }
}

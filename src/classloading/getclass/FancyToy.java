package classloading.getclass;

public class FancyToy extends Toy
        implements HasBatteries, Waterproof, Shoots, Portable {
    FancyToy() {
        super(1);
    }
}

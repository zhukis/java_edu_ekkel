package polymorh.basic;

public class Accordeon extends Percussion {
    public void play(Note n) {
        System.out.println("Accordeon.play() " + n);
    }

    String what() {
        return "Accordeon";
    }

    void adjust() {
        System.out.println("Adjusting Accordeon");
    }
}

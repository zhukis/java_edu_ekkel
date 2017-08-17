package interfaces.interfinstr;

import polymorh.basic.Note;

public class Wind implements Instrument, Playable {
    public void play(Note n) {
        System.out.println(this + ".play() " + n);
    }

    public String toString() {
        return "Wind";
    }

    public void adjust() {
        System.out.println(this + ".adjust()");
    }
}

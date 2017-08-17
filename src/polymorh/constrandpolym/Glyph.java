package polymorh.constrandpolym;

public class Glyph {
    void draw() {
        System.out.println("Glyph.draw()");
    }

    Glyph() {
        System.out.println("Glyph() before calling draw()");
        draw();
        System.out.println("Glyph() after calling draw()");
    }
}

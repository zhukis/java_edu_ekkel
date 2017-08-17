package inhcompos.inherit.complete;

public class Line extends Shape {
    private int start, end;

    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Draw line " + start + ", " + end);
    }

    void dispose() {
        System.out.println("Clear line " + start + ", " + end);
    }
}

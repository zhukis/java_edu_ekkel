package inhcompos.inherit.complete;

public class Triangle extends Shape {
    Triangle(int i) {
        super(i);
        System.out.println("Draw Triangle");
    }

    void dispose() {
        System.out.println("Clear Triangle");
        super.dispose();
    }
}

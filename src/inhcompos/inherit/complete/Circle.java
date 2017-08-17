package inhcompos.inherit.complete;

public class Circle extends Shape {
    Circle(int i) {
        super(i);
        System.out.println("Draw Circle");
    }

    void dispose() {
        System.out.println("Clear Circle");
        super.dispose();
    }
}

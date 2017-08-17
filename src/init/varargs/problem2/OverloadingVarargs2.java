package init.varargs.problem2;

public class OverloadingVarargs2 {
    static void f(float i, Character... args) {
        System.out.println("first");
    }

    static void f_err(Character... args) {
        System.out.print("second");
    }

    static void f(char c, Character... args) {
        System.out.print("second");
    }

    public static void main(String[] args) {
        f(1, 'a');
        f('a', 'b');
    }
}

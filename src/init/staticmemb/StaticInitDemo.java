package init.staticmemb;

public class StaticInitDemo {
    public static void main(String[] args) {
        System.out.println("Creation of new object Cupboard in main()");
        new Cupboard();

        System.out.println("Creation of new object Cupboard in main()");
        new Cupboard();

        table.f2(1);
        cupboard.f3(1);
    }

    static Table table = new Table();
    static Cupboard cupboard = new Cupboard();
}

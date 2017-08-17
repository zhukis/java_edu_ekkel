package init.staticmemb;

public class Table {
    static Bowl bowl = new Bowl(1);

    Table() {
        System.out.println("Table()");
        bowl2.f1(1);
    }

    void f2(int marker) {
        System.out.println();
    }

    static Bowl bowl2 = new Bowl(2);
}

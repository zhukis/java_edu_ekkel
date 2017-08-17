package init.varargs.task1;

public class Task1 {
    static void showArray(String... strs) {
        for (String st : strs)
            System.out.println(st);
    }

    public static void main(String[] args) {
        showArray("123",
                new String("1"),
                "1");
        showArray(new String[] { "1", "2", "3"});
    }
}

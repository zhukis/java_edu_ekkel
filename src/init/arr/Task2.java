package init.arr;

public class Task2 {
    Task2(String str) {
        System.out.print(str);
    }

    public static void main(String[] args) {
        new Task2("Hello");

        Task2[] arr = new Task2[] {
                new Task2("I"),
                new Task2(" "),
                new Task2("am "),
                new Task2(" "),
                new Task2("Ihar")
        };

    }
}

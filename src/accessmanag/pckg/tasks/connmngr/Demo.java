package accessmanag.pckg.tasks.connmngr;

public class Demo {
    public static void main(String[] args) {
        Connection cm = ConnectionManager.getConnection(8);

        System.out.println(cm);

    }
}

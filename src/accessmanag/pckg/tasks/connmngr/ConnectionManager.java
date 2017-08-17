package accessmanag.pckg.tasks.connmngr;

public class ConnectionManager {
    private static Connection[] arrayOfConnection = new Connection[10];

    private ConnectionManager() {}

    public static Connection getConnection(int i) {
        if (i > 10 || i < 0) return null;

        return arrayOfConnection[i - 1];
    }
}

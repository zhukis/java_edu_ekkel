package exceptions.lostexception;

class VeryImportantException extends Exception {
    public String toString() {
        return "Very important exceptions";
    }
}

class HoHumException extends Exception {
    public String toString() {
        return "Second exceptions";
    }
}

public class LostMessage {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();

            try {
                lm.f();
            } finally {
                lm.dispose();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

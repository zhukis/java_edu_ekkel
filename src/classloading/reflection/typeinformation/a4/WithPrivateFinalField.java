package classloading.reflection.typeinformation.a4;

public class WithPrivateFinalField {
    private int i = 1;
    private final String s = "I'm totally safe";
    private String s2 = "Am I Safe";
    public String toString() {
        return "i = " + i + ", " + s + ", " + s2;
    }
}

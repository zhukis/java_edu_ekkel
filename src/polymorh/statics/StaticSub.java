package polymorh.statics;

public class StaticSub extends StaticSuper {
    public static String staticGet() {
        return "Static Sub version staticGet()";
    }

    public String dynamicGet() {
        return "Extended version dynamicGet";
    }

}

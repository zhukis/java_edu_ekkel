package interfaces.tasks.task11;

import interfaces.separationimpl.Processor;

public class StringProcess {
    public String name() {
        return getClass().getSimpleName();
    }

    public String process(Object input) {
        StringBuilder sb = new StringBuilder((String) input);
        char buf;

        for (int i = 1; i < sb.length(); i += 2) {
            buf = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(i - 1));
            sb.setCharAt(i - 1, buf);
        }

        return sb.toString();
    }

}

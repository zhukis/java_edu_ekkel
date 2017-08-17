package interfaces.tasks.task11;

import interfaces.separationimpl.Processor;

public class StringAdapter implements Processor {
    StringProcess sp;

    public StringAdapter(StringProcess sp) {
        this.sp = sp;
    }

    public String name() {
        return sp.name();
    }

    public String process(Object input) {
        return sp.process(input);
    }
}


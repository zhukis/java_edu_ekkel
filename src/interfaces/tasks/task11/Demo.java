package interfaces.tasks.task11;

import interfaces.separationimpl.Apply;

public class Demo {
    public static void main(String[] args) {
        Apply.process(new StringAdapter(new StringProcess()), "Google Chrome");
    }
}

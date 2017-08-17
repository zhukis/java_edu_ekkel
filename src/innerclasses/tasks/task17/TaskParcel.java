package innerclasses.tasks.task17;

public class TaskParcel {
    private static class A {
        static int i = 10;

        static class B {
            static int bi = i;
        }
    }

}

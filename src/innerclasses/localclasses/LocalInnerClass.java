package innerclasses.localclasses;

public class LocalInnerClass {
    private int count = 0;

    Counter getCounter(String name) {
        class LocalCounter implements Counter {
            public LocalCounter() {
                System.out.println("LocalCounter()");
            }

            public int next() {
                System.out.print(name);
                return count++;
            }
        }

        return new LocalCounter();
    }

    Counter getcounter2(String name) {
        return new Counter() {
            {
                System.out.println("Counter()");
            }

            public int next() {
                System.out.print(name);
                return count++;
            }
        };
    }

    public static void main(String[] args) {
        LocalInnerClass lic = new LocalInnerClass();
        Counter
                c1 = lic.getCounter("Local "),
                c2 = lic.getcounter2("Anonymous ");

        for (int i = 0; i < 5; i++) {
            System.out.println(c1.next());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(c2.next());
        }
    }
}

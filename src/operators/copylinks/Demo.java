package operators.copylinks;

public class Demo {
    public static void main(String[] args) {
        Tank t1 = new Tank();
        Tank t2 = new Tank();
        t1.level = 9;
        t2.level = 47;

        System.out.println("1: t1.level: " + t1.level +
            ", t2.level: " + t2.level);

        t1 = t2;
        System.out.println("1: t1.level: " + t1.level +
                ", t2.level: " + t2.level);

        t1.level = 27;
        System.out.println("1: t1.level: " + t1.level +
                ", t2.level: " + t2.level);

        TestFloat tf = new TestFloat();
        TestFloat tf2 = new TestFloat();
        tf.value = 1;
        tf2.value = 2;
        tf = tf2;

        System.out.println(tf.value + " " + tf2.value);
    }
}

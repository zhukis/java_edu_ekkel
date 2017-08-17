package objects.fields;

public class Demo {
    public static void main(String[] args) {
        DataOnly data1 = new DataOnly();
        DataOnly data2 = new DataOnly();
        data1.i++;
        System.out.println(data2.i);

    }
}

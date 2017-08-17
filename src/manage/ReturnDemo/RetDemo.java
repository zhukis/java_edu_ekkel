package manage.ReturnDemo;

public class RetDemo {
    static int test(int testval, int target, int begin, int end) {
        if ((testval > target) && (testval >= begin) && (testval <= end))
            return 1;
        else if ((testval < target) && (testval >= begin) && (testval <= end))
            return -1;

        return 0;
    }

    public static void main(String[] args) {
        int array[] = new int[10];

        for (int i : array)
            System.out.println(i);
    }
}

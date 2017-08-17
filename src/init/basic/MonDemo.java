package init.basic;

public class MonDemo {
    public static void main(String[] args) {
        Money money = Money.BLR;

        switch (money) {
            case UK:
                System.out.println("Irland " + money.ordinal());
                break;
            case BLR:
                System.out.println("National currency " + money.ordinal());
                break;
            default:
                System.out.println("WTF?");
        }
    }
}

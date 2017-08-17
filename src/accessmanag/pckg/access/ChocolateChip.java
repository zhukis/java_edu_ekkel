package accessmanag.pckg.access;

import accessmanag.pckg.access.dessert.Cookie;

public class ChocolateChip extends Cookie {
    public ChocolateChip() {
        System.out.println("Choko constr");
    }

    public void chomp() {
        bite();
    }

    public static void main(String[] args) {
        ChocolateChip x = new ChocolateChip();
        x.chomp();
    }
}

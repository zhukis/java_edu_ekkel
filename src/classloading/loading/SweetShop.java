package classloading.loading;

public class SweetShop {
    public static void main(String[] args) {
        System.out.println("int main method");
        new Candy();
        System.out.println("After Candy creations");
        try {
            Class.forName("Gum");
        } catch (ClassNotFoundException e) {
            System.out.println("Cannot find Gum");
        }

        System.out.println("After calling Class.ForName");
        new Cookie();
        System.out.println("After Cookie");
    }
}

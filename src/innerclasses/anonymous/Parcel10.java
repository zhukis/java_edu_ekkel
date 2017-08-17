package innerclasses.anonymous;

import innerclasses.upcasting.Destination;

public class Parcel10 {
    public Destination destination(String dest, float price) {
        return new Destination() {
            private int cost;
            {
                cost = Math.round(price);
                if (cost > 100) {
                    System.out.println("Exceed money");
                }

            }

            private String label = dest;
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel10 p = new Parcel10();
        Destination d = p.destination("Tansania", 101.395F);
    }
}

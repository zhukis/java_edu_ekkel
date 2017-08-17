package enums.impl;

import util.Generator;

public class EnumImplementation {
    public static <T> void printNext(Generator<T> rg) {
        System.out.print(rg.next() + ", ");
    }

    public static void main(String[] args) {
        CartoonCharacter cc = CartoonCharacter.BOB;

        for (int i = 0; i < 10; i++) {
            printNext(cc);
        }
    }
}

package interfaces.tasks.task3.impl;

import interfaces.tasks.task3.inter.A;

public class B implements A {
    B() {
        System.out.println(CONST);
    }

    public void first() {};
    public void second(){};
    public void third() {};

    public static void main(String[] args) {
        new B();
    }
}

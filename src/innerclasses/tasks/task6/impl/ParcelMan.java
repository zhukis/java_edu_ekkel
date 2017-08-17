package innerclasses.tasks.task6.impl;

import innerclasses.tasks.task6.pack.Manager;

public class ParcelMan {
    protected class ManagerImpl implements Manager {
        public void order(String s) {
            System.out.println("Gau, Gau " + s);
        }
    }

    public Manager manage() {
        return new ManagerImpl();
    }
}

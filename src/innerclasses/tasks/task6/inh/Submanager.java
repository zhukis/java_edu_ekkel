package innerclasses.tasks.task6.inh;

import innerclasses.tasks.task6.impl.ParcelMan;
import innerclasses.tasks.task6.pack.Manager;

public class Submanager extends ParcelMan {
    public void orderSubPeople() {
        Manager a = super.manage();
    }
}

package init.constr;

public class Apple {
    Apple getPeeled() {
        return Peeler.peel(this);
    }
}

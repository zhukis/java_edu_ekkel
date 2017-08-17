package innerclasses.tasks.task13;

public class Modification {
    public Basis getBasis(int value) {
        return new Basis(value) {
            @Override
            void doAction() {
                super.doAction();
            }
        };
    }

    public static void main(String[] args) {
        Modification m = new Modification();
        Basis b = m.getBasis(12);
        b.doAction();
    }
}

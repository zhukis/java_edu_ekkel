package enums.dispatching.roshambo1;

public class Paper implements Item {
    public Outcome compete(Item it) {
        return it.eval(this);
    }

    public Outcome eval(Paper p) {
        return Outcome.DRAW;
    }

    public Outcome eval(Scissors s) {
        return Outcome.WIN;
    }

    public Outcome eval(Rock r) {
        return Outcome.LOSE;
    }

    public String toString() {
        return "Paper";
    }
}

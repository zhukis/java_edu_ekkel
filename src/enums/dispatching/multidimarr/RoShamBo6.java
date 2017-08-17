package enums.dispatching.multidimarr;

import enums.dispatching.roshambo1.Outcome;
import static enums.dispatching.roshambo1.Outcome.*;
import enums.dispatching.roshambo2.Competitor;
import enums.dispatching.roshambo2.RoShamBo;

public enum RoShamBo6 implements Competitor<RoShamBo6> {
    PAPER, SCISSORS, ROCK;

    private static Outcome[][] table = {
            { DRAW, LOSE, WIN },
            { WIN, DRAW, LOSE },
            { LOSE, WIN, DRAW },
    };

    @Override
    public Outcome compete(RoShamBo6 competitor) {
        return table[this.ordinal()][competitor.ordinal()];
    }

    public static void main(String[] args) {
        RoShamBo.play(RoShamBo6.class, 20);
    }
}

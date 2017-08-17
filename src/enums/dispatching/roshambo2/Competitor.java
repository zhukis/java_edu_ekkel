package enums.dispatching.roshambo2;

import enums.dispatching.roshambo1.Outcome;

public interface Competitor<T extends Competitor<T>> {
    Outcome compete(T competitor);
}

package interfaces.tasks.task19;

import java.util.Random;

public class Dice implements Randomable {
    Random rand = new Random();

    public int makeAction() {
        return rand.nextInt(6) + 1;
    }
}

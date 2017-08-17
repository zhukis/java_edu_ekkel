package interfaces.tasks.task19;

import java.util.Random;

public class HeadTail implements Randomable {
    Random rand = new Random(47);

    public int makeAction() {
        return rand.nextInt(2);
    }
}

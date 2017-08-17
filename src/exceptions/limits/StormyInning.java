package exceptions.limits;

import java.io.IOException;

public class StormyInning extends Inning implements Storm {
    public StormyInning() throws BaseBallException, RainedOut {
    }

    public StormyInning(String s)
        throws Foul, BaseBallException {}

    // Regular methods must conform to base class:
//! void walk() throws PopFoul {} //Compile error

    // Interface CANNOT add exceptions to existing
    // methods from the base class:
//! public void event() throws RainedOut {}

    // If the method doesn't already exist in the
    // base class, the exceptions is OK:
    public void rainHard() throws RainedOut {}

    // You can choose to not throw any exceptions,
    // even if the base version does:
    public void event() {}

    // Overridden methods can throw inherited exceptions:
    public void atBat() throws PopFoul {}

    public void whistle() {}

    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
            si.whistle();
        } catch(PopFoul e) {
            System.out.println("Pop foul");
        } catch(RainedOut e) {
            System.out.println("Rained out");
        } catch (UmpireException e) {
            System.out.println("Umpire");
        } catch(BaseBallException e) {
            System.out.println("Generic baseball exceptions");
        }

        // Strike not thrown in derived version.
        try {
            // What happens if you upcast?
            Inning i = new StormyInning();
            i.atBat();
            // You must catch the exceptions from the
            // base-class version of the method:
        } catch(Strike e) {
            System.out.println("Strike");
        } catch(Foul e) {
            System.out.println("Foul");
        } catch(RainedOut e) {
            System.out.println("Rained out");
        } catch(BaseBallException e) {
            System.out.println("Generic baseball exceptions");
        }
    }
}

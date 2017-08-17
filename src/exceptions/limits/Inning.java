package exceptions.limits;

class BaseBallException extends Exception { }

class Foul extends BaseBallException { }

class Strike extends BaseBallException { }

class UmpireException extends BaseBallException {}



class StormException extends Exception {}

class RainedOut extends StormException {}

class PopFoul extends Foul {}






abstract class Inning {
    public Inning() throws BaseBallException { }

    public void event() throws BaseBallException { }

    public abstract void atBat() throws Strike, Foul;

    public void walk() { }

    public void whistle() throws UmpireException {}
}

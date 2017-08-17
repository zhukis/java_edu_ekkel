package interfaces.multiinherit;

public class Hero extends ActionCharacter
        implements CanFight, CanSwim, CanFly {
    public void swim() {}
    public void fly() {}
}

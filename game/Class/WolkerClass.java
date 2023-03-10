package game.Class;

public abstract class WolkerClass extends UnitClass {

    int endurance;

    public WolkerClass(float hp, int speed, int damage, int endurance) {
        super(hp, speed, damage);
        this.endurance = endurance;
    }

}

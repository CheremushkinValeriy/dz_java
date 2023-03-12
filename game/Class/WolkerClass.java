package game.Class;

public abstract class WolkerClass extends UnitClass {

    int endurance;

    public WolkerClass(float hp, int speed, int damage, int target,int endurance) {
        super(hp, speed, damage, target);
        this.endurance = endurance;
    }

}

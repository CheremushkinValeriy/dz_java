package game.Class;

public abstract class MagesClass extends UnitClass {

    int magic;

    public MagesClass(float hp, int speed, int damage, int target, int magic) {
        super(hp, speed, damage, target);
        this.magic = magic;
    }

}

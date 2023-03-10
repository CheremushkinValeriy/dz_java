package game.Class;

public abstract class MagesClass extends UnitClass {

    int magic;

    public MagesClass(float hp, int speed, int damage, int magic) {
        super(hp, speed, damage);
        this.magic = magic;
    }

}

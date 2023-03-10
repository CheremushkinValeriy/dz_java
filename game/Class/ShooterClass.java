package game.Class;

public abstract class ShooterClass extends UnitClass { // если класс является основой для других то
    // его необходимо делать abstract

    int shells;

    public ShooterClass(float hp, int speed, int damage, int shells) {
        super(hp, speed, damage);
        this.shells = shells;
    }

}

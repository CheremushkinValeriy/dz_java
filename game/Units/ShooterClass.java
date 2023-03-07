package game.Units;

public class ShooterClass extends UnitClass{

    int shells;

    public ShooterClass(float hp, int speed, int damage, int shells) {
        super(hp, speed, damage);
        this.shells = shells;
    }

    public int getShells() {
        return shells;
    }

    public void setShells(int shells) {
        this.shells = shells;
    }
    
}








package game.Units;

public class WolkerClass extends UnitClass {

    int endurance;

    public WolkerClass(float hp, int speed, int damage, int endurance) {
        super(hp, speed, damage);
        this.endurance = endurance;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }
    
}

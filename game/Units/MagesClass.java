package game.Units;

public class MagesClass extends UnitClass {

    int magic;

    public MagesClass(float hp, int speed, int damage, int magic) {
        super(hp, speed, damage);
        this.magic = magic;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }
    
}

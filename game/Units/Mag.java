package game.Units;

import game.Class.MagesClass;

           //колдун
public class Mag extends MagesClass {

    // public Mag(float hp, int speed, int damage, int magic) {
    // super(hp, speed, damage, magic);
    // }

    public Mag() {
        super(10f, 10, 10, 10, 10);
    }

    // public void cast() {
    //     System.out.println("Бум");
    // }

    // @Override
    // public void step() {
    //     System.out.println("Колдун произнес заклинание!");
    // }

    @Override
    public String getInfo() {
        return "Mag";
    }

}

package game.Units;

import game.Class.ShooterClass;

           //арбалетчик
public class Crossbow extends ShooterClass {

    // public Crossbow(float hp, int speed, int damage, int shells) {
    // super(hp, speed, damage, shells);
    // }

    public Crossbow() {
        super(50f, 50, 50, 50, 50);
    }

    // public void shot(){
    // System.out.println("Бум");
    // }

    // @Override
    // public void step() {
    //     System.out.println("Арбалетчик выстрелил!");
    // }

    @Override
    public String getInfo() {
        return "Crossbow";
    }

}

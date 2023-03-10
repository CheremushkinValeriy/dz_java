package game.Units;

import game.Class.ShooterClass;

           //копейщик
public class Spear extends ShooterClass {

    // public Spear(float hp, int speed, int damage, int shells) {
    //     super(hp, speed, damage, shells);
    // }

    public Spear() {
        super(30f, 30, 30, 30);
    }

    // public void shot(){
	// 	System.out.println("Бум");
	// }

    @Override
    public void step() {
        System.out.println("Копейщик кинул копьё!");
    }

    @Override
    public String getInfo() {
        return "Spear";
    }
    

    

}

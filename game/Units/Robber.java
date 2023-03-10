package game.Units;

import game.Class.WolkerClass;

           //разбойник
public class Robber extends WolkerClass {

    // public Robber(float hp, int speed, int damage, int endurance) {
    //     super(hp, speed, damage, endurance);
    // }

    public Robber() {
        super(40, 40, 40, 40);
    }

    // public void step(){
	// 	System.out.println("Топ");
	// }

    @Override
    public void step() {
        System.out.println("Разбойник прыгнул!");
    }

    @Override
    public String getInfo() {
        return "Robber";
    }
    
}

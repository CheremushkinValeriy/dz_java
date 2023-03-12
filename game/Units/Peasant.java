package game.Units;

import game.Class.WolkerClass;

           //крестьянин
public class Peasant extends WolkerClass {

    // public Peasant(float hp, int speed, int damage, int endurance) {
    //     super(hp, speed, damage, endurance);
    // }

    public Peasant() {
        super(20, 20, 20, 20, 20);
    }

    // public void step(){
	// 	System.out.println("Топ");
	// }
    // @Override
    // public void step() {
    //     System.out.println("Крестьянин пригнулся!");
    // }

    @Override
    public String getInfo() {
        return "Peasant";
    }
    
}

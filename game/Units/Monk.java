package game.Units;

import game.Class.MagesClass;

           //монах
public class Monk extends MagesClass {

    // public Monk(float hp, int speed, int damage, int magic) {
    //     super(hp, speed, damage, magic);
    // }

    public Monk() {
        super(15, 15, 15, 15);
    }
    
    // public void cast(){
	// 	System.out.println("Бум");
	// }

    @Override
    public void step() {
        System.out.println("Монах выпил воды!");
    }

    @Override
    public String getInfo() {
        return "Monk";
    }
}

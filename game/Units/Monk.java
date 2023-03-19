package game.Units;

import game.Class.MagesUnit;

public class Monk extends MagesUnit {    //монах

    public Monk(String name, int x, int y) {
        super(12, 7, 4, 30f, 5, 1, name, x, y);
    }



    

    // public Monk(float hp, int speed, int damage, int magic) {
    //     super(hp, speed, damage, magic);
    // }

    // public Monk() {
    //     super(15, 15, 15, 15, 15);
    // }
    
    // public void cast(){
	// 	System.out.println("Бум");
	// }

    // @Override
    // public void step() {
    //     System.out.println("Монах выпил воды!");
    // }

    @Override
    public String getInfo() {
        return "Monk";
    }
}

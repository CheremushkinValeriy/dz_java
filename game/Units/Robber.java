package game.Units;

import game.Class.ShooterUnit;


           
public class Robber extends ShooterUnit {   //разбойник

    public Robber(String name, int x, int y) {
        super(12, 10, 4, 10f, 6, 0, name, x, y);
    }
    



    

    // public Robber(float hp, int speed, int damage, int endurance) {
    //     super(hp, speed, damage, endurance);
    // }



    // public void step(){
	// 	System.out.println("Топ");
	// }

    // @Override
    // public void step() {
    //     System.out.println("Разбойник прыгнул!");
    // }

    @Override
    public String getInfo() {
        return "Robber";
    }
    
}

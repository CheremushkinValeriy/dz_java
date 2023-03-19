package game.Units;

import game.Class.WolkerUnit;

public class Peasant extends WolkerUnit {  //крестьянин

    public Peasant(String name, int x, int y) {
        super(1, 1, 1, 1, 3, 1, name, x, y);
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

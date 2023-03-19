package game.Units;

import game.Class.ShooterUnit;

public class Crossbow extends ShooterUnit {   //арбалетчик
    
    public Crossbow(String name, int x, int y) {
        super(6, 3, 4, 10f, 4, 10, name, x, y);
    }





    @Override
    public String getInfo() {
        return "Crossbow";
    }

}

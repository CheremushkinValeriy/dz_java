package game.Units;

import game.Class.ShooterUnit;

           
public class Spear extends ShooterUnit {    //копейщик

    public Spear(String name, int x, int y) {
        super(4, 5,2, 10f, 4, 0, name, x, y);
    }

    @Override
    public String getInfo() {
        return "Spear";
    }
    

    

}

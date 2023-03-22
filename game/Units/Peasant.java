package game.Units;

import game.Class.WolkerUnit;

public class Peasant extends WolkerUnit {  //крестьянин

    public Peasant(String name, int x, int y) {
        super(1, 1, 1, 1f, 3, 1, name, x, y);
    }

    @Override
    public String getInfo() {
        return "Peasant";
    }

    @Override
    public String getName() {
        return "Peasant";
    }
    
}

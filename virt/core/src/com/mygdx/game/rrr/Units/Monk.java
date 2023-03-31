package game.Units;

import game.Class.MagesUnit;

public class Monk extends MagesUnit {    //монах

    public Monk(String name, int x, int y) {
        super(12, 7, 4, 30f, 5, 1, name, x, y);
    }

    @Override
    public String getInfo() {
        return "Monk";
    }

    @Override
    public String getName() {
        return "Monk";
    }
}

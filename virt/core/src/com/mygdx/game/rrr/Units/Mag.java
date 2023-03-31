package game.Units;

import game.Class.MagesUnit;

public class Mag extends MagesUnit {     //колдун

        public Mag(String name, int x, int y) {
            super(12, 12, 5, 30f, 9, 1, name, x, y);
    }

    @Override
    public String getInfo() {
        return "Mag";
    }

    @Override
    public String getName() {
        return "Mag";
    }

}

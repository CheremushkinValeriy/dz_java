package game.Units;

import game.Class.MagesUnit;

public class Mag extends MagesUnit {     //колдун

        public Mag(String name, int x, int y) {
            super(12, 12, 5, 30f, 9, 1, name, x, y);
    }

    // public void cast() {
    //     System.out.println("Бум");
    // }

    // @Override
    // public void step() {
    //     System.out.println("Колдун произнес заклинание!");
    // }

 

    @Override
    public String getInfo() {
        return "Mag";
    }

}

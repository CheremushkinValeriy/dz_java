package game.Class;

import java.util.ArrayList;

public interface UnitInterface {

    void step(ArrayList<BaseUnit> team, ArrayList<BaseUnit> team2);

    String getInfo();

}




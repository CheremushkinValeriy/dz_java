package game.Units;

import game.Class.ShooterUnit;


           
public class Robber extends ShooterUnit {   //разбойник

    public Robber(String name, int x, int y) {
        super(12, 10, 4, 10f, 6, 0, name, x, y);
    }
  
    @Override
    public String getInfo() {
        return "Robber";
    }

    @Override
    public String getName() {
        return "Robber";
    }
    
}

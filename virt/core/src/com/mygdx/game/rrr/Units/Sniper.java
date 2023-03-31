package game.Units;

import game.Class.ShooterUnit;


public class Sniper extends ShooterUnit {   //снайпер

	public Sniper(String name, int x, int y) {
		super(12, 10, 32, 10f, 15, 9, name, x, y);
	}


    @Override
	public String getInfo() {
		return "Sniper";
	}

	@Override
	public String getName() {
		return "Sniper";
	}

}

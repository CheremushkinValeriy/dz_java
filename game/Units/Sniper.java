package game.Units;

import game.Class.ShooterUnit;


public class Sniper extends ShooterUnit {   //снайпер

	public Sniper(String name, int x, int y) {
		super(12, 10, 32, 10, 15, 9, name, x, y);
	}

	// public void shot(){
	// System.out.println("Бум");
	// }

	// @Override
	// public void step() {
	// 	System.out.println("Снайпер выстрелил!");
	// }

	@Override
	public String getInfo() {
		return "Sniper";
	}

}

package game.Units;

import game.Class.ShooterClass;

//снайпер
public class Sniper extends ShooterClass {

	// public Sniper(float hp, int speed, int damage, int shells) {
	// super(hp, speed, damage, shells);
	// }

	public Sniper() {
		super(25, 25, 25, 25, 25);
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

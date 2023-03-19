package game.Class;

import java.util.ArrayList;

public abstract class ShooterUnit extends BaseUnit { // если класс является основой для других то, его необходимо делать
                                                     // abstract

    protected int shot; // заряд/ стрелы

    public ShooterUnit(int attack, int protection, int damage, float hp, int speed, int shot, String name, int x, int y) {
        super(attack, protection, damage, hp, speed, name, x, y);
        this.shot = shot;
    }

    @Override // метод переопределен в супер классе
    public void step(ArrayList<BaseUnit> team, ArrayList<BaseUnit> team2) {
        if (!state.equals("Die") && shot == 0) {
            System.out.println("Выстрел!");
        }
    }

    // @Override
    // public void step(ArrayList< BaseUnit> team) {
    // if (this.arrows > 0 && this.hp > 0) {
    // System.out.println("Могу стрелять!");
    // for ( BaseUnit unit : team) {
    // if (unit.hp > 0) {
    // this.attack(unit, this.damage);
    // this.arrows--;
    // break;
    // }
    // }
    // }
    // System.out.println("Осталось стрел:" + String.valueOf(this.arrows));

    // for ( UnitClass unit) {
    // if (unit.getInfo().equals("Peasant")) {
    // this.arrows++;
    // break;
    // }
    // }
    // System.out.println("Осталось стрел:" + String.valueOf(this.arrows));

    // }

}

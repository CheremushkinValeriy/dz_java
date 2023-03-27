package game.Class;

import java.lang.annotation.Target;
import java.util.ArrayList;

public abstract class ShooterUnit extends BaseUnit { // если класс является основой для других то, его необходимо делать
                                                     // abstract

    protected int shot; // заряд/ стрелы

    public ShooterUnit(int attack, int protection, int damage, float hp, int speed, int shot, String name, int x,
            int y) {
        super(attack, protection, damage, hp, speed, name, x, y);
        this.shot = shot;
    }

    // @Override // метод переопределен в супер классе
    // public void step(ArrayList<BaseUnit> whiteSide, ArrayList<BaseUnit> darkSide)
    // {
    // if (!state.equals("Die") && shot == 0) {
    // System.out.println("Выстрел!");
    // for (BaseUnit unit : whiteSide) {
    // if (unit.getHp() > 0) {
    // this.attack(unit, this.damage);
    // this.shot--;
    // break;
    // } else {
    // System.out.println("пропустить шаг");
    // }
    // }
    // System.out.println(toString());
    // for (BaseUnit unit : darkSide) {
    // if (unit.getInfo().equals("Peasant")) {
    // this.speed++;
    // break;
    // }

    // }
    // this.position.direction(target.position);
    // this.attack(target, this.damage);
    // this.protection--;
    // }

    // }

    @Override
    public void step(ArrayList<BaseUnit> whiteSide, ArrayList<BaseUnit> darkSide) {
        if (this.protection > 0 && this.maxHp > 0) {

            BaseUnit target = whiteSide.get(0);
            double minDistance = this.position.getDistance(whiteSide.get(0));

            for (BaseUnit unit : darkSide) {
                if (this.position.getDistance(unit) < minDistance && unit.maxHp > 0) {
                    minDistance = this.position.getDistance(unit);
                    target = unit;
                }
            }
            if (this.position.getDistance(target) >= 10) {
                this.position.direction(target.position);
            }
            this.position.direction(target.position);
            this.attack(target, this.damage);
            this.protection--;

        }
    }
}

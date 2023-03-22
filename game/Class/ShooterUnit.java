package game.Class;

import java.util.ArrayList;

public abstract class ShooterUnit extends BaseUnit { // если класс является основой для других то, его необходимо делать
                                                     // abstract

    protected int shot; // заряд/ стрелы

    public ShooterUnit(int attack, int protection, int damage, float hp, int speed, int shot, String name, int x,
            int y) {
        super(attack, protection, damage, hp, speed, name, x, y);
        this.shot = shot;
    }

    @Override // метод переопределен в супер классе
    public void step(ArrayList<BaseUnit> list1, ArrayList<BaseUnit> list2) {
        if (!state.equals("Die") && shot == 0) {
            System.out.println("Выстрел!");
            for (BaseUnit unit : list2) {
                if (unit.getHp() > 0) {
                    this.attack(unit, this.damage);
                    this.shot--;
                    break;
                } else {
                    System.out.println("пропустить шаг");
                }
            }
            System.out.println(toString());
            for (BaseUnit unit : list2) {
                if (unit.getInfo().equals("Peasant")) {
                    this.speed++;
                    break;
                }

            }
        }

    }

    private void attack(BaseUnit unit, int damage) {
    }

}

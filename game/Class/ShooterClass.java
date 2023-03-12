package game.Class;

import java.util.ArrayList;

public abstract class ShooterClass extends UnitClass { // если класс является основой для других то
    // его необходимо делать abstract

    int arrows;

    public ShooterClass(float hp, int speed, int damage, int target, int arrows) {
        super(hp, speed, damage, target);
        this.arrows = arrows;
    }

    @Override
    public void step(ArrayList< UnitClass> team) {
        if (this.arrows > 0 && this.hp > 0) {
            System.out.println("Могу стрелять!");
            for ( UnitClass unit : team) {
                if (unit.hp > 0) {
                    this.attack(unit, this.damage);
                    this.arrows--;
                    break;
                }
            }
        }
        System.out.println("Осталось стрел:" + String.valueOf(this.arrows));

        // for ( UnitClass unit) {
        //     if (unit.getInfo().equals("Peasant")) {
        //         this.arrows++;
        //         break;
        //     }
        // }
        // System.out.println("Осталось стрел:" + String.valueOf(this.arrows));

    }

}

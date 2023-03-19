package game.Class;

import java.util.ArrayList;

public abstract class MagesUnit extends BaseUnit {

    protected int magic;

    public MagesUnit(int attack, int protection, int damage, float hp, int speed, int magic, String name, int x, int y) {
        super(attack, protection, damage, hp, speed, name, x, y);
        this.magic = magic;
    }

    @Override // метод переопределен в супер классе
    public void step(ArrayList<BaseUnit> team, ArrayList<BaseUnit> team2) {
        // if (!state.equals("Die") && magic == 0) {
        //     System.out.println("Магия");
        // }
        System.out.println("Магия");
    }





}

package game.Class;

import java.util.ArrayList;

public abstract class WolkerUnit extends BaseUnit {

    protected int delivery;

    public WolkerUnit(int attack, int protection, int damage, float hp, int speed, int delivery, String name, int x, int y) {
        super(attack, protection, damage, hp,speed, name, x, y);
        this.delivery = delivery;
    }

    @Override // метод переопределен в супер классе
    public void step(ArrayList<BaseUnit> list1, ArrayList<BaseUnit> list2) {
        // if (!state.equals("Die") && delivery == 0) {
        //     System.out.println("Работа");
        // }
        System.out.println("Работа");
    }

    



}

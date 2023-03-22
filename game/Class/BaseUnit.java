package game.Class;

import java.util.ArrayList;

import game.Position;

public abstract class BaseUnit implements UnitInterface { // этот класс не могут наследовать персонажи (abstract)
    protected int attack; // атака // protected- виден только внутри пакета
    protected int protection; // защита
    protected int damage; // урон
    private float hp; // здоровье
    protected float maxHp;
    protected int speed; // скорость
    protected final String NAME; // имя
    protected String state; // статус
    public Position position;

    public String getName() {
        return "v";
    }

    public float getHp() {
        return hp;
    }

    public void setHp(float hp) {
        this.hp = hp;
    }

    public BaseUnit(int attack, int protection, int damage, float hp, int speed, String name, int x, int y) {
        this.attack = attack;
        this.protection = protection;
        this.damage = damage;
        this.setHp(hp);
        this.maxHp = hp;
        this.speed = speed;
        NAME = name;
        state = "Stand";
        position = new Position(x, y);
    }

    public int getSpeed() { // для сортировки по скоросити
        return speed;
    }

    @Override // прописываем заглушку
    public void step(ArrayList<BaseUnit> list1, ArrayList<BaseUnit> list2) {
        System.out.println("Шаг");
    }
    // System.out.printf("sum: %s + %s = %s ", num1, num2, num1 + num2);
    @Override
    public String getInfo() {
        String outStr = String.format("%t, %t, %t" ,  attack, maxHp, damage);
        return outStr;
    }
    // @Override
    // public String getInfo() {
    //     String outStr = String.format("\t%-3s\t⚔️ %-3d\t\uD83D\uDEE1 %-3d\t♥️%-3d%%\t☠️%-3d\t    
    //         " , 0,0 , armor,(int) hp * 100/maxHp, damage);
    //     return outStr;

    // }

    public Position getPosition() {
        return position;
    }

}

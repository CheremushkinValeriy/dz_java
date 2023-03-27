package game.Class;

import java.util.ArrayList;
import java.util.Random;

import game.Position;

public abstract class BaseUnit implements UnitInterface { // этот класс не могут наследовать персонажи (abstract)
    protected int attack; // атака                        // protected- виден только внутри пакета
    protected int protection; // защита
    protected int damage; // урон
    private float hp; // здоровье
    protected float maxHp;
    protected int speed; // скорость
    protected final String NAME; // имя
    protected String state; // статус
    public Position position;
    private int maxDamage;

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
        this.maxDamage = damage;
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

    public Position getPosition() {
        return position;
    }

    public void attack(BaseUnit target, int damage) {
        int causedDamage;
        if (damage < target.protection) causedDamage = damage;
        else {
            switch (new Random().nextInt(4)){
                case 0:
                    causedDamage = maxDamage;
                    break;
                default:
                    causedDamage = damage;
                    break;
            }
        }
        target.getDamage(causedDamage);
    }

    private void getDamage(int causedDamage) {
    }

}

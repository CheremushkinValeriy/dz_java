package game.Class;

import java.util.ArrayList;

import game.Position;

public abstract class BaseUnit implements UnitInterface { // этот класс не могут наследовать персонажи (abstract)
    protected int attack;        //атака                  // protected- виден только внутри пакета
    protected int protection;    //защита
    protected int damage;        //урон
    protected float hp;          //здоровье
    protected int speed;         //скорость
    protected final String NAME; //имя
    protected String state;      //статус
    public Position position;

    public void getName(){
        System.out.println(NAME);
    }

    public BaseUnit(int attack, int protection, int damage, float hp, int speed, String name, int x, int y) {
        this.attack = attack;
        this.protection = protection;
        this.damage = damage;
        this.hp = hp;
        this.speed = speed;
        NAME = name;
        state = "Stand";
        position = new Position(x, y);
    }

    public int getSpeed() { //для сортировки по скоросити
        return speed;
    }

    @Override // прописываем заглушку
    public void step(ArrayList<BaseUnit> list1, ArrayList<BaseUnit> list2) {
        System.out.println("Шаг");
    }

    
    // public void getDamage(int damage) {
    //     if (this.hp - damage > 0) {
    //         this.hp -= damage;
    //     } else
    //         this.hp = 0;
    // }

    // protected Random rnd = new Random();
    // public void attack(BaseUnit target, int damage) {
    //     int causedDamage = rnd.nextInt(1, damage);
    //     System.out.printf("%s attack %s\t", this.getClass().getSimpleName(), target.getClass().getSimpleName());
    //     System.out.printf("Power of knock = %d\n", causedDamage);
    //     System.out.printf("%s hp= %.2f\n", target.getClass().getSimpleName(), target.hp);
    //     target.getDamage(causedDamage);
    // }



    @Override
    public String getInfo() {
        return "";
    }




    
    

}

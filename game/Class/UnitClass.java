package game.Class;
import java.util.ArrayList;
import java.util.Random;;

public abstract class UnitClass implements UnitInterface { // этот класс не могут наследовать персонажи
    protected float hp;
    protected int speed;
    protected int damage;
    protected int target;



    public UnitClass(float hp, int speed, int damage, int target) {
        this.hp = hp;
        this.speed = speed;
        this.damage = damage;
        this.target = target;
    }

    @Override // предпологает что метод объявлен выше (unitinterface) ..анотация
    public void step(ArrayList<UnitClass> team) {
        System.out.println("Шаг");
    }

    
    public void getDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        } else
            this.hp = 0;
    }

    protected Random rnd = new Random();
    public void attack(UnitClass target, int damage) {
        int causedDamage = rnd.nextInt(1, damage);
        System.out.printf("%s attack %s\t", this.getClass().getSimpleName(), target.getClass().getSimpleName());
        System.out.printf("Power of knock = %d\n", causedDamage);
        System.out.printf("%s hp= %.2f\n", target.getClass().getSimpleName(), target.hp);
        target.getDamage(causedDamage);
    }



    @Override
    public String getInfo() {
        return "";
    }

    public int getSpeed() {
        return speed;
    }


    
    

}

package game.Class;

public abstract class UnitClass implements UnitInterface { // этот класс не могут наследовать персонажи
    protected float hp;
    protected int speed;
    protected int damage;

    public UnitClass(float hp, int speed, int damage) {
        this.hp = hp;
        this.speed = speed;
        this.damage = damage;
    }

    @Override // предпологает что метод объявлен выше (unitinterface) ..анотация
    public void step() {
        System.out.println("Шаг");

    }

    @Override
    public String getInfo() {
        return "";
    }
    

}

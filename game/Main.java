/**       
 СЕМЕНАР №1            
 Для каждого сформировать список свойств и возможных действий.
 Напрнимер свойство скорость, действие нанести удар.   
 Проанализировать получившиеся свойства и действия персонажей и создать 
 Обобщённый класс описывающий свойства и действия имеющиеся у всех персонажей. 
 Создать этот класс. 
 Создать классы для каждого типа персонажей наследующие и расширяющие абстрактный(обобщённый) класс.
 В основной программе создать по одному экземпляру каждого типа персонажей.

 СЕМЕНАР №2
 Добавить файл с описанием интерфейса.
 В котором описать два метода, void step(); и String getInfo();
 Реализовать интерфейс в абстрактном классе и в наследниках так, чтобы getInfo
 возвращал тип персонажа.
 Создать два списка в классе main. В кадый из списков добавить по десять
 экземнляров наследников BaseHero.
 Удалить ненужные методы из абстрактного класса, если такие есть.
 В main пройти по спискам и вызвать у всех персонажей getInfo.

 СЕМЕНАР №3
 В материалы добавил xml с полями и параметрами по умолчанию. Убедиться что у вас все поля описанны. 
 Создать в основной программе два списка. Положить в них по 10 случайных персонажей. 
 В первом только крестьянин, разбойник, снайпер или колдун. Во втором крестьянин, копейщик, арбалетчик, монах. 
 Вывести в консоль информацию обо всех персонажах не зависимо от списка, очередь должна определяться скоростью 
 каждого персонажа.
 Начать реализацию метода step у лучников.
 1. Если жизнь равна нулю или стрел нет, завершить обработку.
 2. Поиск среди противников наиболее приближённого.
 3. Нанести среднее повреждение найденному противнику.
 4. Найти среди своих крестьянина.
 5. Если найден завершить метод иначе уменьшить запас стрел на одну.
 Степ лучника будет доделовать на следующем саминаре!)

 СЕМЕНАР №4
 Создать класс с описанием координат, x и y.
 Добавить в абстрактный класс поле с координатами и пробросить его инициализацию до конструкторов персонажей. 
 Farmer farmer = new Farmer(getName(), x, y);
 Реализовать метод step() лучников. 
 3.1 Если жизнь равна нулю или стрел нет, завершить обработку. 
 3.2 Поиск среди противников наиболее приближённого. 
 3.3 Нанести среднее повреждение найденному противнику. 
 3.4 Найти среди своих крестьянина. 
 3.5 Если найден завершить метод иначе уменьшить запас стрел на одну.
**/

package game;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

import game.Class.BaseUnit;
import game.Units.Crossbow;
import game.Units.Mag;
import game.Units.Monk;
import game.Units.Peasant;
import game.Units.Robber;
import game.Units.Sniper;
import game.Units.Spear;

public class Main {

    public static final int GANG_SIZE = 10;
    public static ArrayList<BaseUnit> whiteSide = new ArrayList<>(); // В первом только крестьянин, разбойник, снайпер
                                                                     // или колдун
    public static ArrayList<BaseUnit> darkSide = new ArrayList<>(); // Во втором крестьянин, копейщик, арбалетчик,
                                                                    // монах.

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // Init();

    // while(true){
    // ConsoleView.view();
    // sc.nextLine();
    // step();
    // }
    // }
    public static void main(String[] args) {

        ArrayList<BaseUnit> allList = new ArrayList<>(); // общий список для сортирвки по скорости

        for (int i = 0; i < GANG_SIZE; i++) { // заполнение whiteSide
            switch (new Random().nextInt(4)) {
                case 0:
                    whiteSide.add(new Peasant(getName(), 1, i + 1));
                    break;
                case 1:
                    whiteSide.add(new Robber(getName(), 1, i + 1));
                    break;
                case 2:
                    whiteSide.add(new Sniper(getName(), 1, i + 1));
                    break;
                default:
                    whiteSide.add(new Mag(getName(), 1, i + 1));
                    break;
            }
            switch (new Random().nextInt(4)) { // заполнение darkSide
                case 0:
                    darkSide.add(new Peasant(getName(), 10, i + 1));
                    break;
                case 1:
                    darkSide.add(new Spear(getName(), 10, i + 1));
                    break;
                case 2:
                    darkSide.add(new Crossbow(getName(), 10, i + 1));
                    break;
                default:
                    darkSide.add(new Monk(getName(), 10, i + 1));
                    break;
            }
        }
        ConsoleView.view();

        System.out.println("-------------\n   LIST 1:");
        for (BaseUnit unit : whiteSide) {
            System.out.printf(String.format("%s --- ", unit.getInfo()));
            unit.getName();
        }

        System.out.println("-------------\n   LIST 2:");
        for (BaseUnit unit : darkSide) {
            System.out.printf(String.format("%s --- ", unit.getInfo()));
            unit.getName();
        }

        allList.addAll(whiteSide);
        allList.addAll(darkSide);

        System.out.println(allList); // list до сортировки

        allList.sort(new Comparator<BaseUnit>() { // реализация сортировки
            @Override
            public int compare(BaseUnit u1, BaseUnit u2) {
                if (u1.getSpeed() == u2.getSpeed())
                    return 0;
                else if (u1.getSpeed() > u2.getSpeed())
                    return 1;
                else
                    return -1;
            }
        });
        System.out.println(allList); // list после сортировки

        whiteSide.forEach(u -> u.step(darkSide, whiteSide));

        for (BaseUnit unit : whiteSide) {
            System.out.printf("%d, %d\n", unit.position.x, unit.position.y);
        }

        for (BaseUnit unit : darkSide) {
            System.out.printf("%d, %d\n", unit.position.x, unit.position.y);
        }

    }

    private static String getName() {
        return Names.values()[new Random().nextInt(Names.values().length)].toString();
        // рандомно выбираем имя из списка

    }

}

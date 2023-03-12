/**       
 * СЕМЕНАР №1               опыт скорость урон
 * крестьянин   //
 * разбойник    // wolker             выносливость 
 * 
 * монах        //  
 * колдун       // mages              магия
 * 
 * снайпер      //
 * копейщик     // shoter             снаряды
 * арбалетчик   //
 * 
 * Для каждого сформировать список свойств и возможных действий.
 * Напрнимер свойство скорость, действие нанести удар.   
 * Проанализировать получившиеся свойства и действия персонажей и создать 
 * Обобщённый класс описывающий свойства и действия имеющиеся у всех персонажей. 
 * Создать этот класс. 
 * Создать классы для каждого типа персонажей наследующие и расширяющие абстрактный(обобщённый) класс.
 * В основной программе создать по одному экземпляру каждого типа персонажей.
 */

/**
 * СЕМЕНАР №2
 * Добавить файл с описанием интерфейса.
 * В котором описать два метода, void step(); и String getInfo();
 * Реализовать интерфейс в абстрактном классе и в наследниках так, чтобы getInfo
 * возвращал тип персонажа.
 * Создать два списка в классе main. В кадый из списков добавить по десять
 * экземнляров наследников BaseHero.
 * Удалить ненужные методы из абстрактного класса, если такие есть.
 * В main пройти по спискам и вызвать у всех персонажей getInfo.
 */

 /**
 СЕМЕНАР №3
 В материалы добавил xml с полями и параметрами по умолчанию. Убедиться что у вас все поля описанны. Создать в основной программе два списка. Положить в них по 10 случайных персонажей. В первом только крестьянин, разбойник, снайпер или колдун. Во втором крестьянин, копейщик, арбалетчик, монах. Вывести в консоль информацию обо всех персонажах не зависимо от списка, очередь должна определяться скоростью каждого персонажа.
Начать реализацию метода step у лучников.
1. Если жизнь равна нулю или стрел нет, завершить оьработку.
2. Поиск среди противников наиболее приближённого.
3. Нанести среднее повреждение найденному противнику.
4. Найти среди своих крестьянина.
5. Если найден завершить метод иначе уменьшить запас стрел на одну.
Степ лучника будет доделовать на следующем саминаре!)*/

package game;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

import game.Class.UnitClass;
import game.Units.Crossbow;
import game.Units.Mag;
import game.Units.Monk;
import game.Units.Peasant;
import game.Units.Robber;
import game.Units.Sniper;
import game.Units.Spear;

public class Main {
    public static void main(String[] args) {
        // Crossbow crossbow = new Crossbow();
        // Mag mag = new Mag();
        // Monk monk = new Monk();
        // Peasant peasant = new Peasant();
        // Robber robber = new Robber();
        // Sniper sniper = new Sniper();
        // Spear spear = new Spear();

        ArrayList<UnitClass> list1 = new ArrayList<>();
        ArrayList<UnitClass> list2 = new ArrayList<>();
        ArrayList<UnitClass> list3 = new ArrayList<>();
        ArrayList<UnitClass> list4 = new ArrayList<>();
        ArrayList<UnitClass> list5 = new ArrayList<>();
        ArrayList<UnitClass> list6 = new ArrayList<>();
        ArrayList<UnitClass> list7 = new ArrayList<>();

        // list.add(new Crossbow());
        // list.add(new Mag());
        // list.add(new Monk());
        // list.add(new Peasant());
        // list.add(new Robber());
        // list.add(new Sniper());
        // list.add(new Spear());

        for (int i = 0; i < 6; i++) {
            switch (new Random().nextInt(7)) {
                case 0:
                    list1.add(new Crossbow());
                    break;
                case 1:
                    list1.add(new Mag());
                    break;
                case 2:
                    list1.add(new Monk());
                    break;
                case 3:
                    list1.add(new Peasant());
                    break;
                case 4:
                    list1.add(new Robber());
                    break;
                case 5:
                    list1.add(new Sniper());
                    break;
                case 6:
                    list1.add(new Spear());
                    break;
            }
            switch (new Random().nextInt(7)) {
                case 0:
                    list2.add(new Crossbow());
                    break;
                case 1:
                    list2.add(new Mag());
                    break;
                case 2:
                    list2.add(new Monk());
                    break;
                case 3:
                    list2.add(new Peasant());
                    break;
                case 4:
                    list2.add(new Robber());
                    break;
                case 5:
                    list2.add(new Sniper());
                    break;
                case 6:
                    list2.add(new Spear());
                    break;
            }
            switch (new Random().nextInt(7)) {
                case 0:
                    list3.add(new Crossbow());
                    break;
                case 1:
                    list3.add(new Mag());
                    break;
                case 2:
                    list3.add(new Monk());
                    break;
                case 3:
                    list3.add(new Peasant());
                    break;
                case 4:
                    list3.add(new Robber());
                    break;
                case 5:
                    list3.add(new Sniper());
                    break;
                case 6:
                    list3.add(new Spear());
                    break;
            }
            switch (new Random().nextInt(7)) {
                case 0:
                    list4.add(new Crossbow());
                    break;
                case 1:
                    list4.add(new Mag());
                    break;
                case 2:
                    list4.add(new Monk());
                    break;
                case 3:
                    list4.add(new Peasant());
                    break;
                case 4:
                    list4.add(new Robber());
                    break;
                case 5:
                    list4.add(new Sniper());
                    break;
                case 6:
                    list4.add(new Spear());
                    break;
            }
            switch (new Random().nextInt(7)) {
                case 0:
                    list5.add(new Crossbow());
                    break;
                case 1:
                    list5.add(new Mag());
                    break;
                case 2:
                    list5.add(new Monk());
                    break;
                case 3:
                    list5.add(new Peasant());
                    break;
                case 4:
                    list5.add(new Robber());
                    break;
                case 5:
                    list5.add(new Sniper());
                    break;
                case 6:
                    list5.add(new Spear());
                    break;
            }
            switch (new Random().nextInt(7)) {
                case 0:
                    list6.add(new Crossbow());
                    break;
                case 1:
                    list6.add(new Mag());
                    break;
                case 2:
                    list6.add(new Monk());
                    break;
                case 3:
                    list6.add(new Peasant());
                    break;
                case 4:
                    list6.add(new Robber());
                    break;
                case 5:
                    list6.add(new Sniper());
                    break;
                case 6:
                    list6.add(new Spear());
                    break;
            }
            switch (new Random().nextInt(7)) {
                case 0:
                    list7.add(new Crossbow());
                    break;
                case 1:
                    list7.add(new Mag());
                    break;
                case 2:
                    list7.add(new Monk());
                    break;
                case 3:
                    list7.add(new Peasant());
                    break;
                case 4:
                    list7.add(new Robber());
                    break;
                case 5:
                    list7.add(new Sniper());
                    break;
                case 6:
                    list7.add(new Spear());
                    break;
            }
        }

        // list1.forEach(u -> u.step());
        // list2.forEach(u -> u.step());
        // list3.forEach(u -> u.step());
        // list4.forEach(u -> u.step());
        // list5.forEach(u -> u.step());
        // list6.forEach(u -> u.step());

        ArrayList<UnitClass> allUnits = new ArrayList<>();

        allUnits.addAll(list1);
        allUnits.addAll(list2);
        allUnits.addAll(list3);
        allUnits.addAll(list4);
        allUnits.addAll(list5);
        allUnits.addAll(list6);
        allUnits.addAll(list7);

        allUnits.sort(new Comparator<UnitClass>() {
            @Override 
            public int compare (UnitClass u1, UnitClass u2){
                if(u1.getSpeed() == u2.getSpeed())
                    return 0;
                else if (u1.getSpeed() > u2.getSpeed())
                    return 1;
                else return -1;
            }
        });
        System.out.println(allUnits);

        list6.forEach(u -> u.step(allUnits));




    }






}

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

import game.Class.BaseUnit;
import game.Units.Crossbow;
import game.Units.Mag;
import game.Units.Monk;
import game.Units.Peasant;
import game.Units.Robber;
import game.Units.Sniper;
import game.Units.Spear;

public class Main {

    public static final int UNIT = 10;
    public static void main(String[] args) {
        ArrayList<BaseUnit> list1 = new ArrayList<>(); // В первом только крестьянин, разбойник, снайпер или колдун
        ArrayList<BaseUnit> list2 = new ArrayList<>(); // Во втором крестьянин, копейщик, арбалетчик, монах.
        ArrayList<BaseUnit> allList = new ArrayList<>(); // общий список для сортирвки по скорости

        for (int i = 0; i < UNIT; i++) { // заполнение list1
            switch (new Random().nextInt(4)) {
                case 0:
                    list1.add(new Peasant(getName(), i+1, 1));
                    break;
                case 1:
                    list1.add(new Robber(getName(), i+1, 1));
                    break;
                case 2:
                    list1.add(new Sniper(getName(), i+1, 1));
                    break;
                default:
                    list1.add(new Mag(getName(), i+1, 1));
                    break;
            }
            switch (new Random().nextInt(4)) {  // заполнение list2
                case 0:
                    list2.add(new Peasant(getName(), i+1, 10));
                    break;
                case 1:
                    list2.add(new Spear(getName(), i+1, 10));
                    break;
                case 2:
                    list2.add(new Crossbow(getName(), i+1, 10));
                    break;
                default:
                    list2.add(new Monk(getName(), i+1, 10));
                    break;
            }
        }

        allList.addAll(list1);
        allList.addAll(list2);

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

        list2.forEach(u -> u.step(list1, allList));
        list1.forEach(u -> u.step(list2, allList));


    }

    private static String getName() {
        return Names.values()[new Random().nextInt(Names.values().length)].toString(); 
        // рандомно выбираем имя из списка
                                                                                    
    }

}


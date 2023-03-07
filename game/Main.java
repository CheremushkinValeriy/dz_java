/**                                   опыт скорость урон
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
 * 
 * Проанализировать получившиеся свойства и действия персонажей и создать 
 * Обобщённый класс описывающий свойства и действия имеющиеся у всех персонажей. 
 * 
 * Создать этот класс. 
 * Создать классы для каждого типа персонажей наследующие и расширяющие абстрактный(обобщённый) класс.
 * 
 * В основной программе создать по одному экземпляру каждого типа персонажей.
 */

package game;

import game.Units.Mag;
import game.Units.Monk;
import game.Units.Peasant;
import game.Units.Robber;
import game.Units.Sniper;
import game.Units.Spear;

public class Main {
    public static void main(String[] args) {
        Mag mag = new Mag(10, 10, 10, 10);
        Monk monk = new Monk(15, 15, 15, 15);
        Peasant peasant = new Peasant(20, 20, 20, 20);
        Robber robber = new Robber(20, 20, 20, 20);
        Sniper sniper = new Sniper(25, 25, 25, 25);
        Spear spear = new Spear(30, 30, 30, 30);
    }


    
}

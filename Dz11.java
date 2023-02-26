// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.LinkedList;
import java.util.Random;

public class Dz11 {
    private static LinkedList<Integer> list = new LinkedList<Integer>();

    public static void main(String[] args) {
        Random rnd = new Random();

        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-100, 100);
            list.add(val);
        }
        System.out.printf("Первоначальный список %s\n", list);

        int temp = 0;
        while (temp != list.size() - 1) {
            list.add(list.size() - temp, list.getFirst());
            list.removeFirst();
            temp++;
        }
        System.out.printf("Перевернутый список   %s\n", list);
    }
}

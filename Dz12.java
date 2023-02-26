/*Реализуйте очередь с помощью LinkedList со следующими методами:
  enqueue() - помещает элемент в конец очереди, 
  dequeue() - возвращает первый элемент из очереди и удаляет его, 
  first() - возвращает первый элемент из очереди, не удаляя.*/

import java.util.LinkedList;
import java.util.Random;

public class Dz12 {
    private static LinkedList<Integer> list = new LinkedList<Integer>();

    public static void main(String[] args) {
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            int val = rnd.nextInt(-100, 100);
            list.add(val);
        }

        System.out.printf("Первоначальный список %s\n", list);

        enqueue(list, 88);
        System.out.printf("Помещает элемент в конец очереди %s\n", list);

        System.out.printf("--> %s\n", dequeue(list));
        System.out.printf("Возвращает первый элемент из очереди и удаляет его %s\n", list);

        System.out.printf("Возвращает первый элемент из очереди, не удаляя: %s\n", first(list));
    }

    public static void enqueue(LinkedList<Integer> list, int num) {
        list.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        list.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> list) {
        int num = 0;
        num = list.get(0);
        return num;
    }
}

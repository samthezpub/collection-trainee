import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) {

        Long from = System.currentTimeMillis();

        /*
         *THEORY
         * LinkedList отличается от ArrayList тем, что у ArrayList'a в основе лежит массив
         * А у LinkedList - контейнеры, в которых находятся данные
         * При добавлении элемента в ArrayList, если его capacity недостаточно создаётся новый
         * В то время как LinkedList просто добавляет в конец ещё один контейнер
         * В LinkedList элементы связаны последовательно
         * В LinkedList сложность алгоритма O(1) для вставки, удаления. O(n) для получения
         * В ArrayList сложность алгоритма O(n) для вставки, удаления. O(1) для получения
         * Таким образом можно понять, что ArrayList через n-ое количество операций пересоздаётся,
         * что негативно сказывается на производительности
         * LinkedList не пересоздаётся, но получение становится для него тяжкой задачей
         * Пример хорошего использования LinkedList на мой взгляд - логирование ходов шахматной игры
         * В этом примере в постоянно добавляюется история, а получение может не происходить вовсе,
         * если реализовать это таким образом, чтобы сразу после совершения хода
         * это отрисовывалось на ui или в браузере, сам ход, а не последний полученный ход из списка
         *
        */

//        HashMap<Integer, User> userHashMap = new HashMap<>();
//        userHashMap.put(0, new User("Oleg", 10, 100));
//        userHashMap.put(1, new User("Vasiliy", 12, 1002));
//        userHashMap.put(2, new User("Kira", 14, 1003));
//        userHashMap.put(null, new User("Dadya", 41, 20000));
//
//        userHashMap.forEach((integer, user) -> System.out.println("" +integer + user));

//        HashMap<Integer,User> userHashMap = new HashMap<>();
//        User user = new User("Володя", 10, 2500);
//        User userSecond = new User("Володя", 10, 2500);
//
//        for (int i = 0; i < 1000000000; i++) {
//            boolean equals = user.equals(userSecond);
//            if (!equals){
//                System.out.printf("НЕ РАВНЫ");
//                System.out.printf("Hashcode %s \n", user.hashCode());
//
//                System.out.printf("Hashcode %s \n", userSecond.hashCode());
//            }
//        }


        Long to = System.currentTimeMillis();
        System.out.println(to - from);
    }
}
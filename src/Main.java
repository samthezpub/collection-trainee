import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;

public class Main {
    public static void main(String[] args) {



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


        /*
        *THEORY
        * HashMap имеет структуру ключ-значение.
        * HashMap сортирует элементы по хеш-коду
        * Ключ может быть чем угодно что наследуется от Object
        * Ключ должен быть уникальным, может быть null
        * Наиболее часто применяемые типы ключа - Integer, String
        * Что интересно, я могу написать HashMap даже такого формата
        * HashMap<User, User>
        * И два объекта при выводе в System.out.println HashMap будут преобразовываться в toString
        * {User{name='В', age=10, salary=200}=User{name='Oleg', age=10, salary=100}}
        * И иметь такую странную запись.
        * Думаю, можно использовать это как список для ЗАГСА в очень извращённой форме
        * */
//        HashMap<User, User> userHashMap = new HashMap<>();
//        userHashMap.put(new User("A",10, 200), new User("Oleg", 10, 100));
//        userHashMap.put(new User("B",10, 200), new User("Oleg", 10, 100));
//        System.out.println(userHashMap);
//        userHashMap.forEach((integer, user) -> System.out.println("" +integer + user));



        Long from = System.currentTimeMillis();


        /*
        *THEORY
        * HashSet может содержать только уникальные элементы
        * HashSet может содержать null
        * HashSet не имеет get
        * HashSet не гарантирует сохранение порядка элементов
        * HashSet не имеет индексации элементов
        *
        * Эти наблюдения дают понять что лучше использовать HashSet в целях когда вывести все значения
        * Например: вывести все типы газов существующих на нашей планете
        * */

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(null);
        hashSet.add(null);
        hashSet.add("Айфон");
        hashSet.add("LG");
        hashSet.add("Айфон");
        hashSet.add("Realme");


        // nullАйфонLGRealme2
        hashSet.stream().forEach(System.out::print);

        Long to = System.currentTimeMillis();
        System.out.println(to - from);
    }
}
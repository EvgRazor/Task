package Chapter_2;

import java.util.HashSet;
import java.util.Set;

public class Main_46 {

    public static void main(String[] args) {

        Main_46_Player p1 = new Main_46_Player(1, "Nick");
        Main_46_Player p2 = new Main_46_Player(1, "Nick");

        /*
            System.out.println(Main_46.class);

            System.out.println(p1.equals(p2)); // Falshe т.к. по умолчанию мы сравниваем по тем же ==, а == сравнивает ссылки на один источик памяти
            System.out.println("хеш код p1 " + p1.hashCode()); // хеш код p1 1072408673
            System.out.println("хеш код p2 " + p2.hashCode()); // хеш код p2 1854731462
        */
        // Переопределяем Equals
        System.out.println(p1.equals(p2)); // После переопределения equals теперь True

        // Добавим наш Main_46_Player в SET. В SET отсуствует дубли
        Set<Main_46_Player> playerSet = new HashSet<>();
        playerSet.add(p1);
        playerSet.add(p2);

        System.out.println("хеш код p1 " + p1.hashCode()); // хеш код p1 1072408673
        System.out.println("хеш код p2 " + p2.hashCode()); // хеш код p2 1854731462
        System.out.println("Размер коллекции " + playerSet.size());

        // Проверяем наличия нашего объекта при помощи метод contains проверяет, есть ли указанный элемент в Set.
        // Он возвращает true, если элемент найден, и false, если нет.

        // System.out.println(playerSet.contains(new Main_46_Player(1, "Nick"))); // Выводит false. Т.е. такого объекта нет

        // После переопределения hashCode все отрабатывает на ура
        System.out.println(playerSet.contains(new Main_46_Player(1, "Nick"))); // Выводит true.

    }

}

package Chapter_5;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Main_113 {

    public static void main(String[] args) {
        // Замена элементов в отображении Мар

        Map<Integer, Main_113_Test> map = new HashMap<>();

        map.put(1, new Main_113_Test(23, "Maks"));
        map.put(2, new Main_113_Test(46, "Ten"));
        map.put(3, new Main_113_Test(19, "Lila"));
        map.put(4, new Main_113_Test(19, "Lila"));

        // замена занчение при помощи replace. Важно! Если замена произошла успешна то будет возвращено значение старое.
        Main_113_Test test = map.replace(2, new Main_113_Test(99, "Stas"));
        System.out.println(test); // тут будет 46, "Ten"

        System.out.println(map.get(2)); // а при выводе самого значения будет вывод новых данных 99, "Stas"


        // Если нам надо заменить ряд значений, то воспользуемся BiFunction

        BiFunction<Integer, Main_113_Test, Main_113_Test> biFunction = ((k, v) -> v.getName().equals("Lila") || v.getName().equals("Maks") ? new Main_113_Test(v.getAge(), "Stasic") : v);

        map.replaceAll(biFunction);

        System.out.println(map);



    }

}

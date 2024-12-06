package Chapter_5;

/*. Создание немодифицируемых/немутируемых коллекций */
// создаются посредством методов Collections.unmodifiableFoo()
// С JDK 9 посредством набора методов of ()

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main_109 {

    public static void main(String[] args) {

        // Создание списка с примитивов
        List<Integer> list = Collections.unmodifiableList(Arrays.asList(1,2,3,4,5,6,7));
/*
        // 1. Cоздадим СПИСОК объектов MutableMelon посредством метода Collections.unmodifiableList():
        Main_109_MutableMelon main109MutableMelon = new Main_109_MutableMelon("Maks", 100);
        Main_109_MutableMelon main109MutableMelon2 = new Main_109_MutableMelon("Den", 70);

        List<Main_109_MutableMelon> melons = Collections.unmodifiableList(Arrays.asList(main109MutableMelon, main109MutableMelon2));

        System.out.println(melons.get(0).getName());
        melons.get(0).setName("MMMMMMaks"); // можно менять данные. Но нельзя в сам список добавить еще один класс

        melons.add(new Main_109_MutableMelon()); // Тут будет ошибка. Нельзя добавлять ничего в спикок
*/
        // Задача 2 Немутируемое

        Main_109_MutableMelon MELON_1 = new Main_109_MutableMelon("1", 111);
        Main_109_MutableMelon MELON_2 = new Main_109_MutableMelon("2", 222);
        Main_109_MutableMelon MELON_3 = new Main_109_MutableMelon("2", 222);


        List<Main_109_MutableMelon> melons1 = Collections.unmodifiableList(Arrays.asList(MELON_1, MELON_2));
        List<Main_109_MutableMelon> melons2 = List.of(MELON_1, MELON_2);

        //melons1.add(MELON_3); // тут будешь ошибка java.lang.UnsupportedOperationException - мы не можем ничего добавить
       // melons2.add(MELON_3); // тут будешь ошибка java.lang.UnsupportedOperationException  - мы не можем ничего добавить


    }

}

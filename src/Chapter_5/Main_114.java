package Chapter_5;

//  Сравнение двух отображений Мар

import java.util.HashMap;
import java.util.Map;

public class Main_114 {

    public static void main(String[] args) {

        Map<Integer, Main_114_User> map1 = new HashMap<>();

        map1.put(1, new Main_114_User(18, "Jom"));
        map1.put(2, new Main_114_User(22, "Tom"));


        Map<Integer, Main_114_User> map2 = new HashMap<>();

        map2.put(1, new Main_114_User(18, "Jom"));
        map2.put(2, new Main_114_User(22, "Tom"));

        // Сравнение. Во время сравнения двух отображений мар этот метод сопоставляет их ключи И значения, используя метод Object.equals ().
        // Наличие в классах equals и hashCode обезательно
        boolean rezult = map1.equals(map2); // тут будет true
        System.out.println(rezult);

        //Важно!  Но так не сработает с массивами.
        // Проблема заключается в том, что метод equals() массива сравнивает не содержимое массива, а идентичность (что две переменные ссылаются на один и тот же объект в памяти.)

        Main_114_User[] arr1 = {new Main_114_User(18, "Jom"), new Main_114_User(22, "Tom")};
        Main_114_User[] arr2 = {new Main_114_User(18, "Jom"), new Main_114_User(22, "Tom")};

        Map<Integer, Main_114_User[] > map3 = new HashMap<>();
        map3.put(1, arr1);

        Map<Integer, Main_114_User[] > map4 = new HashMap<>();
        map4.put(1, arr2);

        boolean itog = map3.equals(map4); // Будет false


    }

}

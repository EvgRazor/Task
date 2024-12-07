package Chapter_5;

import java.util.HashMap;
import java.util.Map;

public class Main_112 {

    public static void main(String[] args) {
        //  Удаление элемента из отображения Map

        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        // При удалении метод возвращет удаляемое значение или null если такого значение нет
        int one = map.remove("c");
        Integer two = map.remove("ccc");

        System.out.println(one);
        System.out.println(two);


       // C 8 java есть метод который удаляет значение если совпадает и ключи значение
       boolean r1 = map.remove("a", 1); // ключ и значение совпадает - значит будет уделено и вернет true
       boolean r2 = map.remove("b", 1); // ключ и значение не совпадает - будет false


    }

}

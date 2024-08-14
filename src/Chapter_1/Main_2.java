package Chapter_1;

import java.util.LinkedHashMap;
import java.util.Map;

public class Main_2 {

    public static void main(String[] args) {

        String str = "qwertyopqw";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            map.compute(c, (k, v) -> v == null ? 1 : v + 1); // ключ + значение. q=2 ....
        }
        System.out.println(map);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }

    }

}

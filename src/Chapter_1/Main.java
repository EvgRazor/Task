package Chapter_1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        String str = "Hello World";
        Set<String> stringSet  = new HashSet<>();

        char [] chars = str.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int counter = i;
            stringSet.add(str.chars().filter(value -> value == chars[counter]).count()+ " -> " + chars[counter]);
        }
        System.out.println(stringSet);

        // 2 решение
        Map<Character, Long> characterLongMap =
                str.chars()
                        .mapToObj(value -> (char)value)
                        .collect(Collectors.groupingBy(character -> character, Collectors.counting()));


        System.out.println(characterLongMap);

    }


}

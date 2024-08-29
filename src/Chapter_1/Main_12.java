package Chapter_1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main_12 {

    public static void main(String[] args) {

        String string = "HelloMakss".toLowerCase();

        System.out.println(string);
        System.out.println("-----");

        Set<String> stringSet = new LinkedHashSet<>();

        for (int i = 0; i < string.length(); i++) {
            stringSet.add(String.valueOf(string.charAt(i)));
        }

        System.out.println(stringSet.stream().collect(Collectors.joining()));

        // Второе решение

        String str = string.chars()
                .mapToObj(value -> (char) value)
                .map(character -> String.valueOf(character))
                .distinct()
                .collect(Collectors.joining());

        System.out.println(str);
    }

}

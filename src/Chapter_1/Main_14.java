package Chapter_1;

import java.util.Map;
import java.util.stream.Collectors;

public class Main_14 {

    public static void main(String[] args) {
        System.out.println(getStr("asdfghhhhhdgaa"));
    }

    public static String getStr(String str) {

        return String.valueOf(str
                .chars()
                .mapToObj(value -> (char) value)
                .collect(Collectors.groupingBy(character -> character, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue()));



    }

}

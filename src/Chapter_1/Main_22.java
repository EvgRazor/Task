package Chapter_1;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

public class Main_22 {

    public static void main(String[] args) {
        String[] texts = {"abc", "abed", "abode", "aba", "abed", "abedef" };
        System.out.println(getStr(texts));
    }

    public static String getStr(String[] str) {

        Arrays.sort(str, Comparator.comparingInt(String::length));
        int count = 0;

        char[] arrL = str[str.length - 1].toCharArray();
        Set<Character> map = new HashSet<>();


        for (int i = 0; i < arrL.length; i++) {
            for (int x = 0; x < str.length - 1; x++) {
               if (i < str[x].length()) {
                  char[] ch = str[x].toCharArray();
                  if (ch[i] == arrL[i]) {
                      count++;
                  }
               }
            }
            if (count == str.length - 1) {
                map.add(arrL[i]);
            }
            count = 0;
        }

        return map.stream().map(String::valueOf).collect(Collectors.joining());
    }


}

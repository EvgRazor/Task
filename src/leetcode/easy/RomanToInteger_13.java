package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger_13 {

    public static void main(String[] args) {

        System.out.println(romanToInt("LVIII"));
    }

    public static int romanToInt(String s) {

        int rezult = 0;

        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (i < chars.length - 1 && map.get(String.valueOf(chars[i])) < map.get(String.valueOf(chars[i + 1]))) {
                rezult -= map.get(String.valueOf(chars[i]));
            } else {
                rezult += map.get(String.valueOf(chars[i]));
            }
        }


        return rezult;

    }





}

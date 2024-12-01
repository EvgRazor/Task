package leetcode.easy;

/* Write a function to find the longest common prefix string amongst an array of strings. */

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Comparator;

public class LongestCommonPrefix_14 {

    public static void main(String[] args) {
        String [] arrStr = {"aa","aa"};

        System.out.println(longestCommonPrefix(arrStr));

    }



    public static String longestCommonPrefix(String[] strs) {

        String rezult = "";
        int count = 0;
        int it = 0;

        Arrays.sort(strs, Comparator.comparingInt(String::length));

        byte[] maxLineStr = strs[strs.length - 1].getBytes();

        System.out.println(Arrays.toString(strs));

        for (int i = 0; i < strs.length - 1; i++) {
            byte[] test = strs[i].getBytes();
            for (byte b : maxLineStr) {
                it = 0;
                for (int y = 0; y < test.length; y++) {
                    String str = new String(new byte[]{b}, StandardCharsets.UTF_8);
                    if (b == test[y] && rezult.indexOf(str) == -1) {
                        rezult += str;
                        count++;
                        it++;
                    }
                }
                if (it == 0 || count == 0) return rezult;
            }
        }

        if (strs.length == 1) {
            return strs[strs.length - 1];
        }

        if (count != 0) {
            return rezult;
        }


        return "";
    }


}

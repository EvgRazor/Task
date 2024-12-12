package leetcode.easy;

import java.util.Arrays;

public class LengthOfLastWord_58 {

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
    }

    public static int lengthOfLastWord(String s) {


        String x = s.trim();

        String [] arr = x.split(" ");


        return arr[arr.length - 1].length();
    }

}

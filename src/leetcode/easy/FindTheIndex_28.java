package leetcode.easy;

public class FindTheIndex_28 {

    public static void main(String[] args) {

        String haystack = "leetcode";
        String needle = "leet";
        System.out.println(getInt(haystack, needle));
    }


    public static int getInt (String haystack, String needle) {

        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        } else {
            return -1;
        }

    }


}

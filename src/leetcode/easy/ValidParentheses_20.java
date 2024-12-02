package leetcode.easy;

/* Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid. */

public class ValidParentheses_20 {

    public static void main(String[] args) {

        String x = "(){";


        System.out.println(isValid(x) + " <<<");

    }

    public static boolean isValid(String ss) {

        char [] arrZag1 = {'(', ')'};
        char [] arrZag2 = {'{', '}'};
        char [] arrZag3 = {'[', ']'};

        char[] chars = ss.toCharArray();
        int i = 0;

        for (char c : arrZag1) {
            if (ss.indexOf(c) != -1){
                i++;
            }
        }

        if (!(i % 2 == 0)) return false;

        for (char c : arrZag2) {
            if (ss.indexOf(c) != -1) {
                i++;
            }
        }

        if (!(i % 2 == 0)) return false;

        for (char c : arrZag3) {
            if (ss.indexOf(c) != -1) {
                i++;
            }
        }

        if (!(i % 2 == 0)) return false;

        return true;
    }

}

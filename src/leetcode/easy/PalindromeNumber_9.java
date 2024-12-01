package leetcode.easy;

/*
Palindrome Number
* */

public class PalindromeNumber_9 {

    public static void main(String[] args) {
        System.out.println(isPalindrome(101));
    }

    public static boolean isPalindrome(int x) {
        return new StringBuffer(String.valueOf(x)).reverse().toString().equals(String.valueOf(x));
    }

}

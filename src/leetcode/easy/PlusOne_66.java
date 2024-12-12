package leetcode.easy;

import java.util.Arrays;

public class PlusOne_66 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{9,9})));
    }

    public static int[] plusOne(int[] digits) {
        int [] arrNew = new int[digits.length];

        if (digits.length == 1) {
            if (digits[0] == 9) {
                return new int[]{1,0};
            }
            if (digits[0] >= 0 && digits[0] <= 8) {
                return new int[]{digits[0]+1};
            }
        }

        for (int i = 0; i < digits.length; i++) {
            if (i == digits.length - 1) {
                arrNew[i] = digits[i]+1;
            } else {
                arrNew[i] = digits[i];
            }

        }

        return arrNew;
    }

}

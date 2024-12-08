package leetcode.easy;

import java.util.Arrays;

public class RemoveElement_27 {

    public static void main(String[] args) {

        int[] arr = {0,1,2,2,3,0,4,2};

        int xxx = removeElement(arr, 2);

    }

    public static int removeElement(int[] nums, int val) {

        int rezult = 0;

        for (int x : nums) {
            if (x != val) {
                rezult++;
            }
        }

       for (int i = 0; i < nums.length; i++) {
           if (nums[i] == val) {
               nums[i] = -1;
           }
       }

        System.out.println(Arrays.toString(nums));
        System.out.println(rezult);


    }

}

package leetcode.easy;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.
You can return the answer in any order.
*/

import java.util.Arrays;

public class TwoSum_1 {

    public static void main(String[] args) {


        int[] arrTest = {0,4,3,0};
        int pr = 0;

        int[] arr = twoSum(arrTest, pr);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] twoSum(int[] nums, int target) {

        int [] test = new int[]{};


        for (int i = 0; i < nums.length-1; i++) {

            for (int x = i+1; x < nums.length; x++) {
                if (nums[i] + nums[x] == target){
                    System.out.println(i +" "+ x);
                    return test = new int[]{i, x};
                }
            }

        }

        return test;

    }

}

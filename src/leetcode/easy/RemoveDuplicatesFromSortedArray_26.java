package leetcode.easy;

// Remove Duplicates from Sorted Array

import java.util.Arrays;
import java.util.stream.IntStream;

public class RemoveDuplicatesFromSortedArray_26 {

    public static void main(String[] args) {

        //int [] nums = {0,0,1,1,1,2,2,3,3,4};
        int [] nums = {1,1,2};

        int [] un = Arrays.stream(nums).distinct().toArray();

        IntStream.range(0, nums.length).forEach(value -> nums[value] = 0);


        IntStream.range(0, un.length).forEach(i -> nums[i] = un[i]);








    }

}

package leetcode.easy;

import java.util.Arrays;

public class MergeSortedArray_88 {

    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int massLength = m + n;

        int[] arr = new int[massLength];

        for (int i = 0; i < m; i++) {
            if (nums1[i] > 0) {
                arr[i] = nums1[i];
            }
        }


        for (int i = 0, j = m; i < nums2.length; i++, j++) {
            if (nums2[i] > 0) {
                arr[j] = nums2[i];
            }
        }

        nums1 = Arrays.copyOf(arr, massLength);


    }

}

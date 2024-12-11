package leetcode.easy;


public class SearchInsertPosition_35 {

    public static void main(String[] args) {

        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 0));

    }

    public static int searchInsert(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }


        for (int i = 0; i < nums.length; i++) {
            if (target >= nums[i]) {
                if (i == nums.length-1) {
                    return i+1;
                }
            } else {
                System.out.println(i);
                return i;
            }
        }


        return -1;

    }

}

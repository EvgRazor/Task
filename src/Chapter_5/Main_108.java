package Chapter_5;

import java.util.Arrays;

public class Main_108 {

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5, 6, 7]

        int [] arrNew = Arrays.copyOf(arr, arr.length+3);
        arrNew[arrNew.length-1] = -1;
        System.out.println(Arrays.toString(arrNew)); // [1, 2, 3, 4, 5, 6, 7, 0, 0, -1]

    }

}

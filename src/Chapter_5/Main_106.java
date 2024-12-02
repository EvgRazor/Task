package Chapter_5;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main_106 {

    public static void main(String[] args) {

        int [] arr = new int[10];
        System.out.println(arr.hashCode());

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        System.out.println(Arrays.toString(arr));

        // 2 вариант
        Arrays.fill(arr,0);
        System.out.println(Arrays.toString(arr));


    }

}

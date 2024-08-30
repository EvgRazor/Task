package Chapter_1;

import java.util.Arrays;

public class Main_15 {

    public static void main(String[] args) {
        String [] arr = new String[5];

        arr[0] = "A";
        arr[1] = "AAAAA";
        arr[2] = "AAA";
        arr[3] = "AAAAAAAA";
        arr[4] = "AA";

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(getArr(arr)));
    }

    public static String [] getArr (String [] arrs) {
        Arrays.sort(arrs);
        return arrs;
    }



}

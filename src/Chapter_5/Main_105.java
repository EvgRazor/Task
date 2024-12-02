package Chapter_5;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main_105 {

    public static void main(String[] args) {

        int arrInt [] = {-2,1,5,3,7,5,8,9,0,20,21,32};

        int[] arrRevert = IntStream.rangeClosed(1, arrInt.length)
                .map(i -> arrInt[arrInt.length - i]) .toArray () ;

        System.out.println(Arrays.toString(arrRevert));

    }

}

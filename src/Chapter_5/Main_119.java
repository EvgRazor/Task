package Chapter_5;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Колекцию в массив
public class Main_119 {

    public static void main(String[] args) {

        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer [] arrInt = integerList.toArray(new Integer[integerList.size()]);
        System.out.println(Arrays.toString(arrInt)); // [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]


    }

}

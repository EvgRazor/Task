package Chapter_2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Main_40 {
    public static void main(String[] args) {

        List<Integer> integers = Arrays.asList(1,2,3,null,5,6,null,null);

        // Проверка саммой колекции на null
        if (integers == null){
            System.out.println(Collections.EMPTY_LIST);
        }

        // Проверка элементов на null
        for (Integer i : integers) {
            if (i == null) {
                System.out.println("Есть null");
            }
        }

        System.out.println("---");

        //  Есть спец. методы которые обертывают проверки на null, основанные на двух указанных операторах:
        //  object == null был обернут в метод objects.isNull(), a object != null был обернут в метод Objects.nonNull()


        String x = null;

        if (Objects.isNull(x)) {
            System.out.println("Строка имеет null");
        }

        if (Objects.nonNull(x)) {
            System.out.println("Строка не имеет null");
        }


    }
}

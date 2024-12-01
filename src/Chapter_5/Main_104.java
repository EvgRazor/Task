package Chapter_5;

import java.util.Arrays;

public class Main_104 {

    public static void main(String[] args) {

        /* Вычисление максимума и минимума */

        int [] arrInt = new int[]{1,2,3,4,5,6,7,8};


        // Макс
        int max = 0;
        for (int i : arrInt) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);

        // 2 вариант
        int max1 = 0;
        for (int i : arrInt) {
            max1 = Math.max(max1, i);
        }
        System.out.println(max1);

        // 3 вариант
        int max3 = Arrays.stream(arrInt).max().getAsInt();
        System.out.println(max3);



        // Мин
        int min = Integer.MAX_VALUE;
        for (int i : arrInt) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println(min);

        // 2 вариант
        int min2 = Integer.MAX_VALUE;
        for (int i : arrInt) {
            min2 = Math.min(min2, i);
        }
        System.out.println(min2);

        // 3 вариант
        // 3 вариант
        int min3 = Arrays.stream(arrInt).min().getAsInt();
        System.out.println(min3);




        /* Вычисление среднего значения */
        double avg = 0;

        for (int i : arrInt) {
            avg += i;
        }
        double x = avg / arrInt.length;
        System.out.println("Среднее значение: " + x);

        // 2 вариант
        double avg2 = Arrays.stream(arrInt).average().getAsDouble();
        System.out.println(avg2);

    }

}

package Chapter_5;

import java.util.Arrays;

public class Main_101 {

    public static void main(String[] args) {

        /* Проверка эквивалентности двух массивов */
        int [] arr1 = {1,2,3,4,5,6,7,8};
        int [] arr2 = {1,5,6,1,2,6,9,8};
        int [] arr3 = {1,2,3,4,5,6,7,8};

        // Есть метод Arrays.equals()
        boolean rezult = Arrays.equals(arr1, arr2);
        System.out.println(rezult);
        System.out.println(Arrays.equals(arr1, arr3));


        // Пример с объектами
        Main_101_User [] arrUser1  = {new Main_101_User("Stas", 23), new Main_101_User("Max", 25), new Main_101_User("Mary", 18)};
        Main_101_User [] arrUser2  = {new Main_101_User("Stas", 23), new Main_101_User("Max", 25), new Main_101_User("Mary", 18)};
        Main_101_User [] arrUser3  = {new Main_101_User("Stas1", 33), new Main_101_User("Max", 25), new Main_101_User("Mary", 18)};

        System.out.println(Arrays.equals(arrUser1, arrUser2));
        System.out.println(Arrays.equals(arrUser1, arrUser3));


        System.out.println("---");
        // Проверка массива в заданном интервале
        System.out.println(Arrays.equals(arrUser1, 1,2, arrUser2, 1,2));
        System.out.println("---");

        // Проверка несовпадения двух массивах
        int x = Arrays.mismatch(arr1, arr2); // если они ровны, то значение будет возвращать -1. Если не ровны, то вернется индекс первого несовподающего элементы.
        System.out.println(x);






    }

}

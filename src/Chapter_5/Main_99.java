package Chapter_5;

import java.net.CookieHandler;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main_99 {

    public static void main(String[] args) {

        // Сортировка массива алгоритм сортировки под названием быстрой сортировки с двойным опорным элементом (dual-pivot quicksort).
        int[] ints = new int[]{2, 5, 4, 7, 8, 1, 10};

        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        // Сортировка по убыванию (c примитивами не сработает) встроенное решение для сортировки массива примитивов в убывающем порядке отсутствует.
        Integer[] ints2 = new Integer[]{2, 5, 4, 7, 8, 1, 10};
        Arrays.sort(ints2, Collections.reverseOrder());
        System.out.println(Arrays.toString(ints2));

        //  Отсортировать массив объектов.
        Main_99_User main99User_1 = new Main_99_User(30, "Стас");
        Main_99_User main99User_2 = new Main_99_User(19, "Максим");
        Main_99_User main99User_3 = new Main_99_User(45, "Аким");
        Main_99_User main99User_4 = new Main_99_User(18, "Леонид");


        Main_99_User[] usersArr = {main99User_1, main99User_2, main99User_3, main99User_4};

        // Сортируем при помощи компоратора по ВОЗРАСТАНИЮ (ASC)
        Arrays.sort(usersArr, new Comparator<Main_99_User>() {
            @Override
            public int compare(Main_99_User o1, Main_99_User o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        System.out.println(Arrays.toString(usersArr));


        // При помощи лямбда выражения по ВОЗРАСТАНИЮ (ASC)
        Arrays.sort(usersArr, (Main_99_User o1, Main_99_User o2) -> Integer.compare(o1.getAge(), o2.getAge()));
        // Или
        Arrays.sort(usersArr, Comparator.comparingInt(Main_99_User::getAge));
        System.out.println(Arrays.toString(usersArr));
        System.out.println("-------------------------------");


        // Сортируем при помощи компоратора по УБЫВАНИЮ (DESC)
        // Через компоратор, надо  множить на -1
        Arrays.sort(usersArr, new Comparator<Main_99_User>() {
            @Override
            public int compare(Main_99_User main99User, Main_99_User main99User2) {
                return (-1) * Integer.compare(main99User.getAge(),
                        main99User2.getAge());
            }
        });
        System.out.println(Arrays.toString(usersArr));
        System.out.println("------------------------");

        /* Сортировка пузырьком */
        // Сортировка пузырьком — это простой алгоритм, который выталкивает элементы массива вверх.
        // Это означает, что он обходит массив в цикле несколько раз и меняет местами соседние элементы,
        // если они расположены в неправильном порядке.

        int[] intArr = {3, 2, 5, 7, 4, 1, 9, 3, 0};

        System.out.println(Arrays.toString(intArr));

        for (int i = 0; i < intArr.length - 1; i++) {
            for (int y = i + 1; y < intArr.length; y++) {
                if (intArr[i] > intArr[y]) {
                    int temp = intArr[i];
                    intArr[i] = intArr[y];
                    intArr[y] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(intArr));
        System.out.println("---------------------");


        /* Сортировка вставками */
        // Алгоритм сортировки вставками основан на простом процессе управления.
        // Он начинается со второго элемента и сравнивает его с предыдущим элементом. Если
        // предыдущий элемент больше текущего, то алгоритм меняет местами элементы.
        // Этот процесс продолжается до тех пор, пока предыдущий элемент не станет меньше текущего элемента

        int [] arrInt = {4,3,6,5,8,9,-1,0};

        for (int i = 1; i < arrInt.length; i++) {

            int key = arrInt[i];
            int y = i - 1;

            while (y >= 0 && arrInt[y] > key) {
                arrInt[y + 1] = arrInt[y];
                y = y - 1;
            }

            arrInt[y+1] = key;
        }

        System.out.println(Arrays.toString(arrInt));





    }

}

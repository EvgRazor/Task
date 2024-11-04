package Chapter_5;

import java.util.Arrays;

public class Main_100 {

    public static void main(String[] args) {

        /* Проверка только присутствия элемента */

        int [] number = {3,2,1,4,7,6,8,9,0,11,123,-4};
        int x = 0;

        // 1 - способ (перебор массива)
        for (int i : number) {
            if (i == x) {
                System.out.println("Элемент " + x + " найден");
            }
        }
        System.out.println("--------------------------------");


        // 2 - способ при помощи Arrays.binarysearch(). Но для корректной работы нужен отсортированнный массив
        // Указанный метод будет искать заданный ключ в заданном массиве и возвращать соответствующий индекс или отрицательное значени
        int [] number1 = {3,2,1,4,7,6,8,9,0,11,123,-4};
        Arrays.sort(number1);

        int rezult = Arrays.binarySearch(number1, -4);
        if (rezult != -1) {
            System.out.println("Значение есть в массиве");
        } else {
            System.out.println("Значение отсуствует ");
        }


        // 3 - способ при помощи функционального программирования. Например метод anyMatch().
        // Возвращает true, если хоть один элемент потока удовлетворяют условию в предикате
        int [] number2 = {3,2,1,4,7,6,8,9,0,11,123,-4};
        int testNumber = 123;

        boolean rezultBoolean = Arrays.stream(number2).anyMatch(value -> value == testNumber);
        System.out.println(rezultBoolean);
        System.out.println("----------------------------------------");


        /* Работа с объектами */

        Main_100_User main100User_1 = new Main_100_User(30, "Стас");
        Main_100_User main100User_2 = new Main_100_User(19, "Максим");
        Main_100_User main100User_3 = new Main_100_User(45, "Аким");
        Main_100_User main100User_4 = new Main_100_User(18, "Леонид");

        Main_100_User [] main100UsersArr = {main100User_1, main100User_2, main100User_3, main100User_4};


        // 1 - способ Нам надо найти напрмер "Аким";. Например через equals()
        for (Main_100_User main100User : main100UsersArr) {
            if (main100User.getName().equals("Аким") && main100User.getAge() == 45) {
                System.out.println("Есть такое имя");
            }
        }

        boolean name = Arrays.stream(main100UsersArr).anyMatch(main100User -> main100User.getName().equals("Аким"));
        System.out.println(name);




    }

}

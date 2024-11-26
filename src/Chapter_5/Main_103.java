package Chapter_5;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main_103 {

    public static void main(String[] args) {

        /* Создание потока их массива */

        String [] arr = {"Maks", "Den", "Jon"};

        Stream<String> stringStream = Arrays.stream(arr);

        // Можем достать элементы с нужным нам интервалом
        Stream<String> stringStream1 = Arrays.stream(arr, 0, 1);


        // Тоже через лист можно сделать
        Stream<String> stringStream2 = Arrays.asList(arr).stream();
        Stream<String> stringStream3 = Arrays.asList(arr).subList(0,1).stream();


        // Тоже через Stream.of()
        Stream<String> stringStream4 = Stream.of(arr);
        Stream<String> stringStream5 = Stream.of("Maks", "Den", "Jon");


        // Создать массив из объекта stream можно посредством метода stream.toArray()
        String[] arr2 = stringStream5.toArray(String[]::new);



        // Цифровой пример
        int [] arr3 = new int[]{1,2,3,4,5,6,7,8,9};

        // Создаем стрим из int
        IntStream intStream = Arrays.stream(arr3);

        // Так же ест метод of
        IntStream intStream1 = IntStream.of(arr3);

        // Создаем массив из стрима интов
        int [] arr4 = intStream.toArray();

        System.out.println(Arrays.toString(arr4));


    }

}

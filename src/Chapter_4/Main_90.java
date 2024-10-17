package Chapter_4;

import java.util.stream.Stream;

public class Main_90 {

    public static void main(String[] args) {

        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        integerStream.filter(integer -> integer % 2 == 0).forEach(System.out::println);

        // C VAR
        var  integerStream2 = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        integerStream2.filter(integer -> integer % 2 == 0).forEach(System.out::println);
    }

}

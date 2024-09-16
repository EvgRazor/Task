package Chapter_2;

import java.util.Objects;

public class Main_44 {

    public static void main(String[] args) {

        int a = 0;
        int b = 30;

        int x = 33;

        if (b > x && x > a) {
           // throw  new IndexOutOfBoundsException("Число в индексе");
        }

        System.out.println("-----");
        // Второй способ с помощью objects.checkFromToIndex() проверяет, чтобы заданный индекс находился в интервале [0; длина)
        try {
            Objects.checkFromToIndex(a,x,b);
        }  catch (IndexOutOfBoundsException  e) {
            System.out.println(e.getMessage() + " Число не в интервале");
        }
    }

}

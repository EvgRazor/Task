package Chapter_4;

import java.util.ArrayList;
import java.util.List;

public class Main_89 {

    public static void main(String[] args) {

        // Пример 1 цикла for
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // Пример 2 цикла for
        List<Object> list = List.of(new Object(), new Object(), new Object(), new Object());
        for (Object o : list) {
            System.out.println(o);
        }

        System.out.println("-------");

        // Пример 1 цикла for -> var
        for (var i = 0; i < 10; i++) {
            System.out.println(i);
        }

        // Пример 2 цикла for -> var
        for(var ob : list) {
            System.out.println(ob);
        }


        // Когда полезен var? Когда тип обходимого в цикле массива, коллекции и других конструкций изменяется


    }

}

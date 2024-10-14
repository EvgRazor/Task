package Chapter_4;

import java.util.ArrayList;
import java.util.List;

public class Main_83 {

    public static void main(String[] args) {

        // переменная var не может предоставить нам обстракцию, пример
        List<Integer> list = new ArrayList<>();

        // если мы заменим List<Integer> list на var, то в var будет ArrayList<Integer>,а не List<Integer> list
        var list1 = new ArrayList<Integer>();

    }

}

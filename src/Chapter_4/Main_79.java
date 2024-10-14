package Chapter_4;

public class Main_79 {


    public static void main(String[] args) {

        boolean valid = true;
        char c = 'c';

        // Теперь давайте заменим явный примитивный тип на LVTI (var)

        var valid1 = true;
        var c1 = 'c';



        int intNumber = 10; // эта переменная имеет тип int
        long longNumber = 10; // эта переменная имеет тип long
        float floatNumber = 10; // эта переменная имеет тип float, 10.0
        double doubleNumber = 10; // эта переменная имеет тип double, 10.0

        // Теперь давайте заменим явный примитивный тип на LVTI (var)

        var intNumber1 = 10; // логически выводится как int
        var longNumber1 = 10L; // логически выводится как long
        var floatNumber1 = 10F; // логически выводится как float, 10.0
        var doubleNumber1 = 10D; // логически выводится как double, 10.0





    }


}

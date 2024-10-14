package Chapter_4;

public class Main_85 {

    public static void main(String[] args) {
        // 1. При работе с масивами и типом var, скобки [] не ставим

        // Стандартный подход
        int [] ints = new int[5];

        // Пример
        var int1 = new int[5];
        System.out.println(int1[0]);

        // 2. При объявлении массива ввида = {1,2,3,4} -> var не отработает

        int [] int2 = {1,2,3,4,5};
        System.out.println(int2.length);

        // С var так не пойдет. Получим ошибку   cannot infer type for local variable int3  (array initializer needs an explicit target-type)
       // var int3 = {1,2,3,4,5};
       // System.out.println(int3.length);

    }

}

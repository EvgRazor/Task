package Chapter_2;

public class Main_56 {

    public static void main(String[] args) {

        // До JDK 12 инструкция switch допускала только одну метку для каждого варианта case.
        // Начиная с 12 JDK выражений switch, вариант case может иметь несколько меток, через запятую

        int xxx = 34;

        switch (xxx) {
            case 1, 2, 3, 4, 5, 6 -> System.out.println(xxx + " 1 case");
            case 134, 24, 543, 555 -> System.out.println(xxx + " 2 case");
            case 143, 56765, 234, 34-> System.out.println(xxx + " 3 case");
            default -> System.out.println("Нет такого числа");
        }

    }

}

package Chapter_1;

public class Main_34 {

    public static void main(String[] args) {

        Long lg = (long)Integer.MAX_VALUE;
        System.out.println(lg);

        int x = Long.valueOf(lg).intValue();
        System.out.println(x);

        /////
        Long l = Long.MAX_VALUE;
        System.out.println(l);

        int xx = Long.valueOf(l).intValue();
        System.out.println(xx); // -1

        // Для решение данной проблемы есть  метод етод Math.tointExact(). Он пытается произвести конвертацию.
        // Этот метод получает аргумент типа long и пытается конвертировать его в int.
        // Если получаемое  значение переполняет тип int, то этот метод будет выбрасывать исключение ArithmeticException

        int test = Math.toIntExact(l);
        System.out.println("Число переполняет int ");


    }

}

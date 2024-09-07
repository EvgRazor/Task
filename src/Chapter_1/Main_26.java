package Chapter_1;

public class Main_26 {

    public static void main(String[] args) {

        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;

        int c = a+b;
        System.out.println(c); // -2

        long l = a+b;
        System.out.println(l); // -2

        int i = Math.addExact(a,b);
        System.out.println(i); // при переполнении будет ошибка - ArithmeticException

    }

}

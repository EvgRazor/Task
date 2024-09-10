package Chapter_1;

import java.math.BigInteger;

public class Main_33 {

    public static void main(String[] args) {

        BigInteger bigInteger = BigInteger.valueOf(Long.MAX_VALUE);
        System.out.println(bigInteger);

        Long aLong = bigInteger.longValue();
        System.out.println(aLong);

        int i = bigInteger.intValue();
        System.out.println(i); //  -1 тоже  будет при приведении к short и long

        // Дабы поймать данный момент, есть
        // методы longValueExact(), intValueExact(), shortValueExact() И byteValueExact()
        System.out.println(bigInteger.longValueExact()); // тут все ок
        System.out.println(bigInteger.intValueExact()); // тут вместо -1 будед проброшена ошибка ArithmeticException.

    }

}

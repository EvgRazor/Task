package Chapter_1;

import java.util.stream.IntStream;

public class Main_11 {

    public static void main(String[] args) {

        String str = "atatata";



        StringBuffer stringBuffer = new StringBuffer(str);

        if (stringBuffer.reverse().toString().equals(str)) {
            System.out.println("Строка палиндромом");
        } else {
            System.out.println("Строка не палиндромом");
        }


        // Второй спопсоб

        boolean xxx = IntStream.range(0, str.length() / 2)
                .noneMatch(value -> {
                    return str.charAt(value) != str.charAt(str.length() - value - 1);
                });


        if (xxx) {
            System.out.println("Строка палиндромом");
        } else {
            System.out.println("Строка не палиндромом");
        }

    }

}

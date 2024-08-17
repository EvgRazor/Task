package Chapter_1;

public class Main_6 {

    public static void main(String[] args) {

        String str = "HelloWorwlddd".toLowerCase();
        char s = 'd'; // ищем данный символ

        long l = str.chars().filter(value -> value == s).count();

        System.out.println(l);

        // Решение 2

        int count = str.length() - str.replaceAll(String.valueOf(s),"").length();
        System.out.println(count);
    }

}

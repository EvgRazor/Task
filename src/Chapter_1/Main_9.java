package Chapter_1;

import java.util.StringJoiner;

public class Main_9 {

    public static void main(String[] args) {
        char razd = '_';
        String [] arr = new String[]{"Hello", "World", ":)"};

        getString(razd, arr);

    }

    public static void getString (char c, String ... strings) {
        StringBuilder stringBuilder = new StringBuilder();

        for (String s : strings) {
            stringBuilder.append(s).append(c);
        }

        System.out.println(stringBuilder.deleteCharAt(stringBuilder.length()-1));

        // Решение 2
        StringJoiner stringJoiner = new StringJoiner(String.valueOf(c));

        for (String s : strings) {
            stringJoiner.add(s);
        }
        System.out.println(stringJoiner);

    }

}

package Chapter_1;

import java.util.stream.Collectors;

public class Main_13 {

    public static void main(String[] args) {
        String str = "Auto";
        String strChar = "w";
        System.out.println(getStr(str, strChar));
        System.out.println(getStrTwo(str, strChar));


    }

    public static String getStr (String str, String charB) {
        if (str.contains(charB)) {
            return str.replace(charB, "");
        } else {
            return "Нет такого символа";
        }
    }

    // Второй способ

    public static String getStrTwo (String str, String charB) {

        System.out.println("------------------------------------");

        if (str.contains(charB)) {
          return str.chars()
                    .mapToObj(value -> String.valueOf((char) value))
                    .filter(string -> !string.equals(charB))
                    .collect(Collectors.joining());
        } else {
            return "Нет такого символа";
        }
    }
}

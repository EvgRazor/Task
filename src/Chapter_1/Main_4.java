package Chapter_1;

public class Main_4 {

    public static void main(String[] args) {

        String str = "194754830a5";
        String strNumber = "1234567890";

        boolean flag = true;

        for (char st : str.toCharArray()) {
            if (!strNumber.contains(String.valueOf(st)))
                flag = false;
        }

        System.out.println(flag ? "Только цифры" : "Есть буквы");

        //// Решение 2
        System.out.println(getNooleanFun(str));

        // Решение 3
        System.out.println(str.matches("[0-9]+") ? "Только цифры" :  "Есть буквы!");
    }

    //// Решение 2
    public  static boolean getNooleanFun (String str) {
        return !str.chars().anyMatch(value -> !Character.isDigit(value));
    }






}

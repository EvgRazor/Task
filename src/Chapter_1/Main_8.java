package Chapter_1;

public class Main_8 {

    public static void main(String[] args) {
        System.out.println(getStrNoProbel("H e l l o Worl d "));
    }

    public static String getStrNoProbel (String str) {
        return str.trim().replaceAll(" ", "");
    }

}

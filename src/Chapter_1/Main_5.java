package Chapter_1;


public class Main_5 {

    public static void main(String[] args) {

        String str = "separatettt";
        int strL = str.length();
        int count = 0;

        char [] chars = new char[]{'a', 'e', 'i', 'o', 'u', 'y'}; // Гласные

        for (Character c : chars) {
            count += str.chars().filter(value -> (char)value == c).count();
        }

        System.out.println("Гласных -> " + count);
        System.out.println("Согласных -> " + (strL - count));

    }

}

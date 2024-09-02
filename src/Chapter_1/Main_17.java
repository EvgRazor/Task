package Chapter_1;

public class Main_17 {

    public static void main(String[] args) {
        String namber = "111111";
        String namberTwo = "111";

        System.out.println(countStringlnString(namber, namberTwo));
        System.out.println(getCounter(namber, namberTwo));
    }

    public static int countStringlnString(String string, String toFind) {
        int position = 0;
        int count = 0;
        int n = toFind.length();

        while ((position = string.indexOf(toFind, position)) != -1) {
            position += n;
            count++;
        }
        return count;
    }

    // Второй способ
    public static int getCounter (String string, String toFind) {
        return string.split(toFind, -1).length - 1;
    }
}

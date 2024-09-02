package Chapter_1;

public class Main_16 {

    public static void main(String[] args) {
        String str = "Helloworld";
        String strPod = "or";

        System.out.println(getStr(str, strPod));

        System.out.println("---");

        System.out.println(getStr2(str, strPod));

    }

    public static boolean getStr (String str, String podStr) {
        return str.contains(podStr);
    }

    // Второй способ
    public static boolean getStr2 (String str, String podStr) {
        return str.indexOf(podStr) != -1;
    }

}

package Chapter_1;

public class Main_20 {

    public static void main(String[] args) {


     String st = "Hello";
     System.out.println(concatRepiat(st, 10));

     // 2
     System.out.println(st.repeat(9));
    }

    public static String concatRepiat (String str, int i) {

        StringBuffer stringBuffer = new StringBuffer();

        for (int x = 1; x < i; x++) {
            stringBuffer.append(str);
        }

        return stringBuffer.toString();
    }

}

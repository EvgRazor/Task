package Chapter_1;

public class Main_18 {

    public static void main(String[] args) {

        String one = "H e l l o ".trim().toLowerCase().replaceAll(" ", "");
        String two = "o l L e H".trim().toLowerCase().replaceAll(" ", "");

        StringBuffer sb = new StringBuffer(one);

        System.out.println(sb.reverse().toString().equals(two));

    }

}

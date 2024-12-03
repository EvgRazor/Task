package Chapter_5;

public class Main_107 {

    public static void main(String[] args) {

        int [] integers = {1, 2, 3, 4, 12, 2, 1, 4};
        String rezult = "";

        for (int i = 0; i < integers.length - 1; i++) {

            for (int j = i +1; j < integers.length; j++) {
                if (integers[i] < integers[j]) {
                    rezult += integers[i] + " " + integers[j]+",";
                    break;
                } else if (integers[i] > integers[j]){
                    rezult += integers[i] + " " + "-1"+",";
                    break;
                }
            }

        }

        System.out.println(rezult);

    }

}

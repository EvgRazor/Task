package Chapter_1;

public class Main_7 {

    private static final String TO_INT = "453";
    private static final String TO_LONG = "45234223233";
    private static final String TO_FLOAT = "45.823F";
    private static final String TO_DOUBLE = "13.83423D";


    public static void main(String[] args) {

        // В примимтив
        int x_1 = Integer.parseInt(TO_INT);
        long x_2 = Long.parseLong(TO_LONG);
        float x_3 = Float.parseFloat(TO_FLOAT);
        double x_4 = Double.parseDouble(TO_DOUBLE);

        // В ссылочный тип
        Integer xx_1 = Integer.valueOf(TO_INT);
        Long xx_2 = Long.valueOf(TO_LONG);
        Float xx_3 = Float.valueOf(TO_FLOAT);
        Double xx_4 = Double.valueOf(TO_DOUBLE);

    }

}

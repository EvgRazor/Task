package Chapter_1;

public class Main_32 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //  если (s > m && m < 50)
        if (Boolean.logicalAnd(b > a, 30 > b)){ // Boolean.logicalAnd () -> &&
            System.out.println("Верное");
        }

        // если (s > m || m < 50)
        if (Boolean.logicalOr(b < a, 30 > b)){ // Boolean.logicalAnd () -> ||
            System.out.println("Верное2");
        }

        // если (s > m ^ m < 50)
        if (Boolean.logicalOr(b < a, 30 > b)){ // Boolean.logicalOr () -> ||
            System.out.println("Верное3");
        }

    }

}

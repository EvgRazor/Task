package Chapter_2;

public class Main_57 {

    public static void main(String[] args) {
        // Стрелка метки может указывать на одну инструкцию или на блок в фигурных скобках.
        // Похоже на лямбду

        int x = 100;

        switch (x) {
            case 1, 2, 3, 123 ->
            {
                System.out.println("case 1 -> ");
                System.out.println(x);
            }
            case 34, 20, 100 ->
            {
                System.out.println("case 2 -> ");
                System.out.println(x);
            }
            default -> {
                System.out.println(" default блок ");
                System.out.println("блок ");
            }
        }

    }

}

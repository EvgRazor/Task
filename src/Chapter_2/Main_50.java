package Chapter_2;

public class Main_50 {

    public static void main(String[] args) {

        Main_50_Radius main50Radius = new Main_50_Radius();
        main50Radius.setStart(0);
        main50Radius.setEnd(120);

        Main_50_Point main50Point = new Main_50_Point(1.23, 4.12, main50Radius);

        System.out.println("Radius start -> " + main50Point.getMain50Radius().getStart()); // 0
        main50Radius.setStart(5);
        System.out.println("Radius start -> " + main50Point.getMain50Radius().getStart()); // 5
    }

}

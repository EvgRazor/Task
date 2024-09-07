package Chapter_1;

public class Main_31 {

    public static void main(String[] args) {

        Float f1 = 4.5f;
        boolean f1f = Float.isFinite(f1); // f1 = 4.5 является конечным
        System.out.println(f1f);

        Float f2 = f1 / 0;
        boolean f2f = Float.isFinite(f2);  // f2 = Infinity, не является конечным
        System.out.println(f2f);

        Float f3 = 0f / 0f;
        boolean f3f = Float.isFinite(f3); // f3 = NaN, не является конечным
        System.out.println(f3);


        ////

        Double dl = 0.000333411333d;
        boolean dlf = Double.isFinite(dl); // dl = 3.33411333E-4, является конечным
        System.out.println(dlf);

        Double d2 = dl / 0;
        boolean d2f = Double.isFinite(d2); // d2 = Infinity, не является конечным
        System.out.println(d2f);

        Double d3 = Double.POSITIVE_INFINITY * 0;
        boolean d3f = Double.isFinite(d3); // d3 = NaN, не является конечным
        System.out.println(d3f);




    }

}

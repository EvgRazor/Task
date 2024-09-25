package Chapter_2;

// Немутируемый объект
public final class Main_50_Point {

    private final double x;
    private final double y;
    private final Main_50_Radius main50Radius;

    public Main_50_Point(double x, double y, Main_50_Radius main50Radius) {
        this.x = x;
        this.y = y;
        this.main50Radius = main50Radius;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Main_50_Radius getMain50Radius() {
        Main_50_Radius clone = new Main_50_Radius();
        clone.setStart(this.main50Radius.getStart());
        clone.setEnd(this.main50Radius.getEnd());

        return main50Radius;
    }

}

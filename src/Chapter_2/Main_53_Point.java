package Chapter_2;

public class Main_53_Point implements Cloneable{

    private double x;
    private double y;

    public Main_53_Point() {

    }

    public Main_53_Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // 1. Клонирование ручное
    public Main_53_Point cloneMain_53_Point () {
        Main_53_Point clone = new Main_53_Point(this.x, this.y);
        return clone;
    }

    // 2. Клонирование методом clone()
    @Override
    protected Main_53_Point clone() throws CloneNotSupportedException {
        return (Main_53_Point) super.clone();
    }

    // 3. Клонирование посредством конструктора
    public Main_53_Point (Main_53_Point point) {
        this.x = point.getX();
        this.y = point.getY();
    }


}

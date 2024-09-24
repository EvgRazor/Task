package Chapter_2;

// Немутируемый класс должен удовлетворять нескольким требованиям, а именно:
// 1 - класс должен быть помечен как final, чтобы подавить расширяемость
// 2 - все ПОЛЯ ДОЛЖНЫ быть объявлены приватными (private) И финальными (final)
// 3 - класс должен содержать параметризованный публичный (public) конструктор (или приватный (private)
// 4 - класс должен предоставлять геттеры, т. е. методы чтения, для полей
// 5 - класс не должен выставлять наружу сеттеры, т. е. методы записи/мутации.

public class Main_49_Unmutated {

    private final double a;
    private final double b;

    public Main_49_Unmutated(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }
}

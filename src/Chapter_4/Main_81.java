package Chapter_4;

public class Main_81 {

    public static void main(String[] args) {

        byte byteNumber = 25; // тип byte
        short shortNumber = 1456; // тип short

        // Если мы заменим на тип var, то в обоих случаях получм int
        var byteNumber1 = 25; // тип int
        var shortNumber1 = 1456; // тип int

        // Дабы помочь компилятору, мы можем сделать явное приведение типов
        var byteNumber2 = (byte) 25; // тип byte
        var shortNumber2 = (short) 1456; // тип short

        // Итог: не всегда удобно использовать тип var :)

    }

}

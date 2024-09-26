package Chapter_2;

import java.util.Objects;


public class Main_53 {

    public static void main(String[] args) throws CloneNotSupportedException {

        Main_53_Point main_53_point = new Main_53_Point(1.0D, 10.0D);

        // 1. Клонирование ручное - добавляем метод, который копирует текущую точку Point в новую точку Point вручную (эта копия является мелкой)
        Main_53_Point pointClone = main_53_point.cloneMain_53_Point();
        System.out.println(pointClone.getX());
        System.out.println(pointClone.getY());
        System.out.println(Objects.hashCode(pointClone));
        System.out.println("---");

        // 2. Клонирование методом clone()
        /*
        1. Имплементировать интерфейс cloneable (если этот интерфейс не имплементирован, будет выброшено исключение CloneNotSupportedException);
        2. Переопределить метод clone о (object.clone о является защищенным, т. е. protected);
        3. Вызвать super.clone().
        * */
        Main_53_Point main_53_pointClone = main_53_point.clone();
        System.out.println(main_53_pointClone.getX());
        System.out.println(main_53_pointClone.getY());
        System.out.println(Objects.hashCode(main_53_pointClone));
        System.out.println("---");

        // 3. Клонирование посредством конструктора
        Main_53_Point main_53_pointConst = new Main_53_Point(main_53_point);
        System.out.println(main_53_pointConst.getX());
        System.out.println(main_53_pointConst.getY());
        System.out.println(Objects.hashCode(main_53_pointConst));
        System.out.println("---");

        // 4. Клонирование посредством библиотеки Cloning
        // Глубокое копирование необходимо, когда объект зависит от другого объекта.
        // Выполнение глубокого копирования означает копирование объекта, включая его цепочку

        // Cloner cloner = new Cloner();
        //Main_53_Point pointCloneCloner = cloner.deepClone(point);


    }

}

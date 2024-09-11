package Chapter_2;

import java.util.Objects;

public class Main_41_Car {

    private final String name;
    private final String color;

    // Выбрасываем сами исключение, если какой то пораметримеет null
    /*
    public Main_41_Car(String name, String color) {
        if (Objects.isNull(name)) {
            throw new NullPointerException("name is null");
        }
        if (Objects.isNull(color)) {
            throw new NullPointerException("color is null");
        }

        this.name = name;
        this.color = color;
    }
    */

    // Перепишем на более современный стиль :) Так же словим Exception in thread "main" java.lang.NullPointerException: color is null
    public Main_41_Car(String name, String color) {
        this.name = Objects.requireNonNull(name, "name is null");
        this.color = Objects.requireNonNull(color, "color is null");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Main_41_Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

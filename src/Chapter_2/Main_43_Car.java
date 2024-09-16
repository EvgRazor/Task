package Chapter_2;

import java.util.Objects;

public class Main_43_Car {

    private final String name;
    private final String color;
/*
    // 1-й вариант
    public Main_43_Car(String name, String color) {
        if (name == null)  {
            this.name = "Нет имени";
        } else {
            this.name = name;
        }

        if (color == null) {
            this.color = "Цвет на задан";
        } else {
            this.color = color;
        }
    }
*/
    // C 9 JDK можно упростить данный подход. Есть методы objects: requireNonNullElse и requireNonNullElseGet
    // Оба метода берут два аргумента — ссылку для проверки на null и непустую ссылку,
    // заданную по умолчанию, для возврата в случае, если проверяемая ссылка равна null.
    public Main_43_Car(String name, String color) {
        this.name = Objects.requireNonNullElse(name, "No name"); //  если ссылка NULL то вернем No name
        this.color = Objects.requireNonNullElseGet(color, () -> "No color"); //  если ссылка NULL то вернем No color
    }

    @Override
    public String toString() {
        return "Main_43_Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}

package Chapter_2;

import java.util.Objects;

public class Main_46_Player {

    private int id;
    private String name;

    public Main_46_Player(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        // Проверка ссылок и тип класса
        if (this == obj) return true;
        if (obj == null) return false;
        if (this.getClass() != obj.getClass()) return false;

        // Проверяем наполнение
        final Main_46_Player main_46_player = (Main_46_Player) obj;

        if (this.id != main_46_player.id) return false; // Сравнения по ID
        if (!Objects.equals(this.name, main_46_player.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.id;
        hash = 79 * hash + Objects.hashCode(this.name);
            // Метод Objects.hashCode(this.name) возвращает 0, если объект равен null
            // Метод name.hashCode() при вызове на null вызовет NullPointerException.
        return  hash;
    }

}

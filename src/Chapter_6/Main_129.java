package Chapter_6;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main_129 {

    // Создание путей к файлам
    public static void main(String[] args) {
        // Создание путь относительно корня хранилища файлов. Т.е. от диска d:\
        Path path = Path.of("/Users/ser/Desktop/test.txt");

        System.out.println(path.toString());          // Выводит: \Users\ser\Desktop\test.txt
        System.out.println(path.toAbsolutePath());    // Выводит абсолютный путь -> C:\Users\ser\Desktop\test.txt


        // Создание абсолютного пути
        Path path1 = Paths.get("C:/Users/ser/Desktop", "test.txt");
        System.out.println(path1);

    }

}

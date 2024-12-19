package Chapter_6;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main_132 {

    // Cоздания маршрута, который соединяет два конкретных места. За это отвечает метод - relativize
    public static void main(String[] args) {

        // Наши файлы лежат на одном уровне
        Path path1 = Paths.get("text1.pdf");
        Path path2 = Paths.get("text2.pdf");

        Path path3 = path1.relativize(path2); // означает: "подняться на уровень вверх и затем перейти к text2.pdf".
        System.out.println(path3); // ..\text2.pdf

        Path path4 = path2.relativize(path1); // означает: "подняться на уровень вверх и затем перейти к text1.pdf".
        System.out.println(path4); // ..\text1.pdf

    }

}

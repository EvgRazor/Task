package Chapter_6;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main_133 {

    // Сравнение путей к файлам
    public static void main(String[] args) throws IOException {

        Path pathl = Paths.get("/learning/packt/JavaModernChallenge.pdf");
        Path path2 = Paths.get("/LEARNING/PACKT/JavaModernChallenge.pdf");
        Path path3 = Paths.get("D:/learning/packt/JavaModernChallenge.pdf");

        // 1 вариант - Метод Path.equalsf()
        boolean path1EqualsPath2 = pathl.equals(path2); // TRUE
        System.out.println(path1EqualsPath2);

        boolean path2EqualsPath3 = path2.equals(path3); // FALSE
        System.out.println(path2EqualsPath3);

        System.out.println("----------------------------------------------");

        // 2 вариант - Метод Files.isSameFile() -> в нем отрабатывают два метода
        boolean path1IsFilePatch2 = Files.isSameFile(pathl, path2); // ture
        System.out.println(path1IsFilePatch2);

        boolean path1IsFilePatch3 = Files.isSameFile(pathl, path3);  // ture
        System.out.println(path1IsFilePatch3);

        boolean path2IsFilePatch3 = Files.isSameFile(path2, path3);  // ture
        System.out.println(path2IsFilePatch3);

        // 3 вариант - Частичное сравнение - Path.startswith() и Path.endswith() -> можем проверить, что текущий путь начинается/заканчивается заданным путем
        boolean sw = pathl.startsWith("/learning/packt"); // true
        System.out.println(sw);

        boolean ew = pathl.endsWith("JavaModernChallenge.pdf"); // true
        System.out.println(ew);




    }

}

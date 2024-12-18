package Chapter_6;


import java.nio.file.Path;
import java.nio.file.Paths;

public class Main_131_1 {
    // Присоединение путей к именам файлов
    public static void main(String[] args) {

        // Пример
        Path pathTest = Paths.get("D:/learning/packt");
        System.out.println(pathTest); // D:\learning\packt

        // Получаем пути для двух разных книг
        String [] arrString = {"Book_one.pdf", "Book_two.pdf"};

        for (String str : arrString) {
            Path books = pathTest.resolve(str);
            System.out.println(books);
            // 1- D:\learning\packt\Book_one.pdf;
            // 2 - D:\learning\packt\Book_two.pdf
        }

        /* Так же можем заменить имя файла.  */
        Path base = Paths.get("D:/learning/packt/JavaModernChallenge.pdf");

        // меняем JavaModernChallenge.pdf на  -> my_test.txt
        Path base1 = base.resolveSibling("my_test.txt");
        System.out.println(base1); // D:\learning\packt\my_test.txt


    }

}

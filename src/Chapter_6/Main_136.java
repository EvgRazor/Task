package Chapter_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Main_136 {

    // Потоковая передача содержимого файла. Пример Files.lines() И BufferedReader.lines().
    public static void main(String[] args) {

        String file = "C:/Users/e.gud/Desktop/test.txt";

        try(Stream<String> filesStream = Files.lines(Paths.get(file), StandardCharsets.UTF_8) ) {

            filesStream.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Исключение которое может выпасть");
            throw new RuntimeException(e);
        }

        // Второй способ через BufferedReader.lines().
        System.out.println("----");

        try(BufferedReader filesStream = Files.newBufferedReader(Paths.get(file), StandardCharsets.UTF_8) ) {

            filesStream.lines().forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Исключение которое может выпасть");
            throw new RuntimeException(e);
        }


    }

}

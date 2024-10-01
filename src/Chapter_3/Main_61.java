package Chapter_3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main_61 {

    public static void main(String[] args) {
        // В класс LocalDateTime можно положить год, месяц, день, часа, минуты, секунды или наносекунды, пример
        LocalDateTime ldt = LocalDateTime.of(2020, 4, 1, 12, 33, 21, 675);

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        System.out.println(localDate); // 2024-10-01
        System.out.println(localTime); // 09:20:07.451147900

        System.out.println("-------");

        // Объекты (localDate, localTime) помещаем в LocalDateTime
        LocalDateTime ldt2 = LocalDateTime.of(localDate, localTime);
        System.out.println(ldt2); // 2024-10-01T09:20:07.451147900
    }

}

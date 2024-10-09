package Chapter_3;

import java.time.Instant;
import java.time.LocalDateTime;

public class Main_65 {

    public static void main(String[] args) {

       // С 8 java  есть api для работы с которые предназначены для сложения или вычитания количества времени.
       // LocalDate, LocalTime, LocalDateTime, ZonedDateTime, OffsetDateTime, Instant, Period, Duration и многие другие
       // делаем через метод plusFoo () - где FOO это могут быть минуты и т.д. Есть PLUS and MINUS

        LocalDateTime localDateTime = LocalDateTime.now(); // 2024-10-02T13:31:09.543939100
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = localDateTime.plusMinutes(10);
        System.out.println(localDateTime1);




    }

}

package Chapter_3;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class Main_69 {

    public static void main(String[] args) {

        Long unixTime = 1573768800L;

        // Для того чтобы конвертировать временную метку UNIX в дату и время, важно знать,
        // что разрешающая способность временных меток UNIX равна секундам, тогда как класс java.util.Date требует миллисекунд.
        // Поэтому решение задачи получения объекта Date из временной метки UNIX требует конверсии
        // из секунд в миллисекунды путем умножения временной метки UNIX на 1000

        Date date = new Date(unixTime * 1000); // Fri Nov 15 00:00:00 EET 2019 - в часовом поясе по умолчани
        System.out.println(date);
        System.out.println("");

        // C 8 JDK класс Date использует метод from(Instant instant). Кроме того,
        // класс Instant идет В комплекте С методом ofEpochSecond(long epochSecond), КОТОРЫЙ
        // возвращает экземпляр класса instant, используя заданные секунды из эпохи, 1970 - 01-01T00:00:00Z:

        Instant instant = Instant.ofEpochSecond(unixTime);
        System.out.println(instant);

        // Объект instant, полученный в приведенном выше примере,
        // можно использовать для создания объектов LocalDateTime или ZonedDateTime.

        LocalDateTime localDateTime = LocalDateTime.ofInstant(instant, ZoneId.of("Australia/Perth"));
        System.out.println(localDateTime);


        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, ZoneId.of("Europe/Bucharest"));
        System.out.println(zonedDateTime);
    }

}

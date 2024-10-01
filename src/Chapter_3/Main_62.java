package Chapter_3;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Main_62 {

    public static void main(String[] args) {

        // Класс Instant представляет собой мгновенную точку на временной шкале, начиная с первой секунды 1 января 1970 года (эпоха),
        // в часовом поясе UTC с разрешающей способностью в наносекунду.

        Instant instant = Instant.now();
        System.out.println(instant);


        //  String в объект Instant
        // 2019-02-24Т14:31:33.197021300Z
        Instant timestampFromString = Instant.parse("2019-02-24T14:31:33.197021300Z");
        System.out.println(timestampFromString);


        // Прибавление времени к объекту Instant или вычитание времени из объекта Instant
        // Пример + 2 часа. Кроме plus() есть и другие методы. Так же есть минуc - minus()
        Instant instant1 = Instant.now().plus(2, ChronoUnit.HOURS);
        System.out.println(instant1);


        // Сравнение объектов Instant
        //  Сравнить два объекта instant можно посредством методов instant.isAfter() и  instant.isBefore()
        Instant instant11 = Instant.now();
        Instant instant21 = instant11.plusSeconds(2);

        boolean isAfter = instant11.isAfter(instant21); // метка instant11 показывает время после метки instant21,
        System.out.println(isAfter); // false

        boolean isBefore = instant11.isBefore(instant21); // метка instant11 показывает время перед меткой timestamp2
        System.out.println(isBefore); // true

        // Разница во времени между двумя объектами instant может быть вычислена посредством метода instant.until()
        Long rezult = instant11.until(instant21, ChronoUnit.SECONDS);
        System.out.println(rezult);


        /* Конвертирование из объекта Instant в LocalDateTime, ZonedDateTime и OffsetDateTime и обратно  */

        //  Конвертирование между Instant И LocalDateTime.
        //  LocalDateTime не имеет представления о часовом поясе, следует использовать нулевое смещение UTC+0

        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.now(), ZoneOffset.UTC);
        System.out.println(localDateTime);

        // Конвертирование c LocalDateTime в Instant
        Instant instant2 = LocalDateTime.now().toInstant(ZoneOffset.UTC);
        System.out.println(instant2);

        // Конвертирование между Instant и ZonedDateTime.
        // Конвертирование instant UTC+0 в ZonedDateTime UTC+1 часового пояса Парижа:
        ZonedDateTime zonedDateTime = Instant.now().atZone(ZoneId.of("Europe/Paris"));
        System.out.println(zonedDateTime);

        // Конвертирование c ZonedDateTime в Instant
        Instant instantZDT = LocalDateTime.now().atZone(ZoneId.of("Europe/Paris")).toInstant(); //
        System.out.println(instantZDT);

        // Уточнение - atZone () преобразует LocalDateTime в ZonedDateTime, который включает информацию о временной зоне.
        // Уточнение - ZoneId.of("Europe/Paris") указывает, что вы хотите использовать временную зону «Европа/Париж».

    }

}

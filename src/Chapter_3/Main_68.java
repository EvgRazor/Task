package Chapter_3;

import java.time.*;

public class Main_68 {

    public static void main(String[] args) {

        // Полет из Перта (Австралия) в Бухарест (Европа) продолжительностью 15 часов 30 минут

        // 1. Дата-время вылета и прилета UTC
        // 2. Дата-время вылета и прилета в Бухарест по местному времени Перта;
        // 3. Дата-время вылета и прилета в Бухарест по местному времени Бухареста


        // 1. Время вылета из  Перта (Австралия) -> 26 февраля 2019 года 16:00 (или 4:00 вечера)
        LocalDateTime localDateTimePetra = LocalDateTime.of(2019, Month.FEBRUARY, 26, 16, 00);
        System.out.println("Время вылета из  Перта (Австралия)  -> " + localDateTimePetra);
        System.out.println();

        // 2. Совмещаем это время и дату с часовым поясам Австралии + 08:00 получам -> 2019-02-26T16:00+08:00[Australia/Perth]
        ZonedDateTime zonedDateTimeAustralia = localDateTimePetra.atZone(ZoneId.of("Australia/Perth"));
        System.out.println("Привязываем время вылета к часовому поясу Перта (Австралия) ->" + zonedDateTimeAustralia);
        System.out.println();

        // 3. Время прилета в Бухарест по Австралийскому времени
        ZonedDateTime zonedDateTimeBucharest = zonedDateTimeAustralia.plusHours(15).plusMinutes(30);
        System.out.println("Время прилета в Бухарест по Австралийскому времени -> " + zonedDateTimeBucharest);
        System.out.println();


        // 4. Теперь рассчитаем дату и время вылета из Перта по местному времени Бухареста.
        // код выражает дату и время вылета из часового пояса (Австралия) Перта в часовой пояс (Европа) Бухареста:
        ZonedDateTime euBucharestDepart = zonedDateTimeAustralia.withZoneSameInstant (ZoneId.of("Europe/Bucharest"));
        System.out.println(" Дата и время вылета из Перта по местному времени Бухареста -> " + euBucharestDepart);
        System.out.println();

        // 5. Рассчитаем дату и время прилета по местному времени Бухареста.
        // Следующий ниже фрагмент кода выражает дату и время прилета из часового пояса
        // Перта в часовой пояс Бухареста:
        ZonedDateTime euBucharestArrive = zonedDateTimeBucharest.withZoneSameInstant(ZoneId.of("Europe/Bucharest"));
        System.out.println("Время прилета в Бухарест -> " + euBucharestArrive);
        System.out.println();

        // 6. Вывод времени

        // Время вылета из  Перта (Австралия) UTC
        OffsetDateTime UTCAustralia = zonedDateTimeAustralia.withZoneSameInstant(ZoneId.of("UTC")).toOffsetDateTime();
        System.out.println("Время вылета из  Перта (Австралия) UTC " + UTCAustralia);

        // Время вылета из  Перта (Австралия) UTC
        OffsetDateTime UTCABucharest = zonedDateTimeBucharest.withZoneSameInstant(ZoneId.of("UTC")).toOffsetDateTime();
        System.out.println("Время прилета в (Европу) Бухарест UTC " + UTCABucharest);


    }

}

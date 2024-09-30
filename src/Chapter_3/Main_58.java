package Chapter_3;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Main_58 {

    // LocalDate - дата без часового пояса в календарной системе ISO-8601
    // LocalTime - время без часового пояса в календарной системе ISO-8601
    // LocalDateTime - дата-время без часового пояса в календарной системе ISO-8601
    // ZonedDateTime - дата-время с часовым поясом в календарной системе ISO-8601
    // DateTimeFormatter - задаем шаблон для перевода врмени со строки в дату/время
    public static void main(String[] args) {

        // LocalDate
        // 1. Строку (String) ложим в LocalDate.
        // Строка должна быть формата -> DateTimeFormatter.ISO_LOCAL_DATE  "2024-09-29"
        // LocalDate предусматривает метод parse(), который можно использовать следующим образом:
        String dateDate = "2022-03-30";
        LocalDate date = LocalDate.parse(dateDate, DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(date);

        // LocalTime
        // 2. Строку (String) ложим в LocalTime.
        // Строка должна быть формата -> DateTimeFormatter.ISO_LOCAL_TIME  "12:23:44"
        // LocalTime предусматривает метод parse(), который можно использовать следующим образом:
        String timeTime = "12:23:44";
        LocalTime time = LocalTime.parse(timeTime, DateTimeFormatter.ISO_LOCAL_TIME);
        System.out.println(time);

        // 3. LocalDateTime
        // Cтрока должна совпадать с шаблоном DateTimeFormatter.ISO_LOCAL_DATE_TIME "2020-06-01Т11:20:15"
        // LocalDateTime предусматривает метод parse(), который можно использовать следующим образом:
        String dateTime = "2018-12-30T19:34:50";
        LocalDateTime localDateTime = LocalDateTime.parse(dateTime, DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        System.out.println(localDateTime);

        // 4. ZonedDateTime
        // Строка должна совпадать с шаблоном DateTimeFormatter.ISO_ZONED_DATE_TIME например, 2020-06-01T10:15:30+09:00[Asia/Tokyo]
        String zonedDateTimeStr = "2020-06-01T10:15:30+09:00[Asia/Tokyo]";
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(zonedDateTimeStr, DateTimeFormatter.ISO_ZONED_DATE_TIME);
        System.out.println(zonedDateTime);


        /*Если не совпадает String формат, может задать свой через - DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("...")*/

        // Date
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDate1 = LocalDate.parse("01.09.1999", dateFormatter);
        System.out.println(localDate1); // Вывод 1999-09-01

        // Time
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH|mm|ss");
        LocalTime localTime1 = LocalTime.parse("13|23|27", timeFormatter);
        System.out.println(localTime1); // Вывод 13:23:27

        // LocalDateTime
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm:ss");
        LocalDateTime localDateTime1 = LocalDateTime.parse("01.10.1987, 19:29:12", dateTimeFormatter);
        System.out.println(localDateTime1); // 1987-10-01T19:29:12

        // ZonedDateTime
        DateTimeFormatter zonedDateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy, HH:mm:ssXXXXX '['VV']'");
        ZonedDateTime zonedDateTime1 = ZonedDateTime.parse("01.06.2020, 11:20:15+09:00 [Asia/Tokyo]", zonedDateTimeFormatter);
        System.out.println(zonedDateTime1);

        /* Пеервод даты в строку */

        // 1. Метод .toString()
        // Обратите внимание, что метод tostring() всегда будет печатать дату посредством соответствующего предопределенного формата
        System.out.println(zonedDateTime1 instanceof ZonedDateTime); // будет true, т.к. тип ZonedDateTime
        System.out.println(zonedDateTime1.toString() instanceof String); // будет true, т.к. тип String




    }

}

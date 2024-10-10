package Chapter_3;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class Main_71 {

    public static void main(String[] args) {

        ZoneOffset zoneOffset = ZoneOffset.UTC;
        System.out.println(zoneOffset); // это +00:00, представленное в Java символом z


        // Системный часовой пояс, заданный по умолчанию, также можно получить с помощью Класса ZoneOffset
        ZoneId defaultZoneId =  ZoneOffset.systemDefault();
        System.out.println(defaultZoneId);

        // Для того чтобы учесть поясное смещение с переходом на летнее/зимнее время, исходный код должен связать с ним дату и время.
        // Например, свяжем класс LocalDateTime  - он регулирует переход на летнее/зимнее время по умолчанию.
        // Следующим образом:
        LocalDateTime ldt = LocalDateTime.of(2019, 6, 15, 0, 0);
        ZoneId zoneid = ZoneId.of("Europe/Bucharest");
        System.out.println(zoneid);

        ZoneOffset zoneoffset = zoneid.getRules().getOffset(ldt);
        System.out.println(zoneoffset);

    }

}

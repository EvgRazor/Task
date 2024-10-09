package Chapter_3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class Main_64 {

    public static void main(String[] args) {
        // C 8 Java есть 2 метода - getFoo() и метод get(TemporaiFieid field)
        // Пример
        LocalDateTime localDateTime = LocalDateTime.now();

        int year = localDateTime.getYear();
        int month = localDateTime.getMonthValue();
        int day = localDateTime.getDayOfMonth();
        int hour = localDateTime.getHour();
        int minute = localDateTime.getMinute();
        int second = localDateTime.getSecond();
        int nano = localDateTime.getNano();

        System.out.println("year " +  year);
        System.out.println("month " +month);
        System.out.println("day " + day);
        System.out.println("hour " +hour);
        System.out.println("minute " +minute );
        System.out.println("second " + second);
        System.out.println("nano " + nano);

        // AND
        int yearLDT = localDateTime.get(ChronoField.YEAR);
        int monthLDT = localDateTime.get(ChronoField.MONTH_OF_YEAR);
        int dayLDT = localDateTime.get(ChronoField.DAY_OF_MONTH);
        int hourLDT = localDateTime.get(ChronoField.HOUR_OF_DAY);
        int minuteLDT = localDateTime.get(ChronoField.MINUTE_OF_HOUR);
        int secondLDT = localDateTime.get(ChronoField.SECOND_OF_MINUTE);
        int nanoLDT = localDateTime.get(ChronoField.NANO_OF_SECOND);


        /////////////////////////////////////////////
        LocalDate date = LocalDate.now();
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));


    }

}

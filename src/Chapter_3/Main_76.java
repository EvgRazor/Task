package Chapter_3;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Main_76 {

    public static void main(String[] args) {
        LocalDate ldl = LocalDate.of(2018, 1, 1);
        LocalDate ld2 = LocalDate.of (2019, 9, 10);


        // Найти разниу можем при помощи класса СhronoUnit

        Long day = Math.abs(ChronoUnit.DAYS.between(ldl, ld2));
        System.out.println(day);

        Long month = Math.abs(ChronoUnit.MONTHS.between(ldl, ld2));
        System.out.println(month);

        Long year = Math.abs(ChronoUnit.YEARS.between(ldl, ld2));
        System.out.println(year);


        /* Второй вариант  */
        // У LocalDate етсь два метода.
        // 1 возвращает значение типа Period как разницу между двумя датами
        // 2 возвращает значение типа long как разницу между двумя датами в указанной единице времени

        Period period = ldl.until(ld2);
        System.out.println(period); // P8M19D

        System.out.println(period.getYears());
        System.out.println(period.getDays());
        System.out.println(period.getMonths());

        System.out.println("-----");

        long untillnDays = Math.abs(ldl.until(ld2, ChronoUnit.DAYS));
        System.out.println(untillnDays);

        long untillnMonths = Math.abs(ldl.until(ld2, ChronoUnit.MONTHS));
        System.out.println(untillnMonths);

        long untillnYears = Math.abs(ldl.until(ld2, ChronoUnit.YEARS));
        System.out.println(untillnYears);


    }

}

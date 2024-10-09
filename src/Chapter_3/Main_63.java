package Chapter_3;

import java.time.LocalDate;
import java.time.Period;

public class Main_63 {

    public static void main(String[] args) {

        // Период времени с использованием значений на основе даты
        //

        LocalDate startLocalDate = LocalDate.of (2018, 3, 12);
        LocalDate endLocalDate = LocalDate.of(2019, 7, 20);
        Period periodBetween = Period.between(startLocalDate, endLocalDate);
        System.out.println(periodBetween.getYears()); // 1
        System.out.println(periodBetween.getMonths()); // 2
        System.out.println(periodBetween.getDays());  // 3

    }

}

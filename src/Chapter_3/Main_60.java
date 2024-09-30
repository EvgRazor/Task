package Chapter_3;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main_60 {

    public static void main(String[] args) {

        // C 8 JDK работаем через LocalDate и LocalTime
        System.out.println(LocalTime.now() + " <- время без привязки к час. поясу ");
        System.out.println(LocalDate.now() + " <- дата без привязки к час. поясу ");

    }

}

package pl.sda.ludwiczak.data_and_time181125.new_way181125;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class NewDateTimeExample181125 {

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalTime localTime1805 = LocalTime.of(18, 5);
        System.out.println(localTime1805);

        localTime1805.minusMinutes(5); // time/String is immutable, dlatego poniżej nie pokaże 18:00 tylko 18:05
        System.out.println(localTime1805);

        LocalTime localTime1800 = localTime1805.minusMinutes(5); // time/String is immutable
        System.out.println(localTime1800);

        LocalDate localDate = LocalDate.now();
        System.out.println("local Date: " + localDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime localDateTime1 = LocalDateTime.of(localDate, localTime);

        String formattedTime = localDateTime.format(DateTimeFormatter.ofPattern("YYYY _ MM:dd - HH:mm ")); // my decydujemy czy dajemy _ : itp
        System.out.println(formattedTime);

        Date maybeNow = new Date();
        // mamy starą datę, a chcemy mieć nową
        long time = maybeNow.getTime();

        Instant instant = Instant.ofEpochMilli(time);
        LocalDateTime maybeNowNewWay = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());

        System.out.println(maybeNow); // old
        System.out.println(maybeNowNewWay); // new



    }

}

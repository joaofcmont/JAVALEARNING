import javax.xml.crypto.Data;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        LocalDate d01 = LocalDate.parse("2022-07-20");
        LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d03 = Instant.parse("2022-07-20T01:30:06Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        // if we try the same with the Instant,
        // this does not work since there is no
        // time zone
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;

        System.out.println(d01.format(fmt1));
        //same output
        System.out.println(fmt1.format(d01));
        // garbage collector will delete after
        System.out.println(d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        System.out.println(d02.format(fmt2));
        System.out.println(fmt3.format(d03));
        System.out.println(fmt4.format(d02));

        //convert global to local
        //we need to inform the Time Zone

        LocalDate r1 = LocalDate.ofInstant(d03, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d03, ZoneId.of("Brazil/West"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d03, ZoneId.of("America/Chicago"));

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(d01.getDayOfMonth());
        System.out.println(d02.getMonthValue());

        //date and time are imutable
        // we have to create a new object after the first creation

        // Previous week
        LocalDate previousWeekLocalDate = d01.minusWeeks(1);
        System.out.println(previousWeekLocalDate);

        //next week, but adding days
        LocalDate nextWeekLocalDate = d01.plusDays(7);
        System.out.println(nextWeekLocalDate);

        LocalDateTime nextHourLocalDateTime = d02.plusHours(2);
        System.out.println(nextHourLocalDateTime);

        LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);


        Instant nextSeconds = d03.plus(7, ChronoUnit.DAYS);
        System.out.println(nextSeconds);

        Duration t1 = Duration.between(nextWeekLocalDateTime, d02);
        System.out.println(t1.toDays());

        // we have to use atTime to use hours and minutes or atStartOfDay
        Duration t2 = Duration.between(nextWeekLocalDate.atStartOfDay(), d01.atTime(0,0));
        System.out.println(t2.toDays());

        Duration t3 = Duration.between(nextSeconds, d03);
        System.out.println(t3.toDays());
        }
}
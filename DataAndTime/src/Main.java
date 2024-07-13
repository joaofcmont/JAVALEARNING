import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        //local date and time
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        //global time (GMT)
        Instant i01 = Instant.now();
        //ISO 8601 -> DATE HOUR
        LocalDate d03 = LocalDate.parse("2024-07-12");
        LocalDateTime d04 = LocalDateTime.parse("2024-07-12T12:34:26");
        //global GMT
        Instant d05 = Instant.parse("2024-07-12T12:34:26Z");
        //TIMEZOME PORTUGAL -> GMT
        Instant d06 = Instant.parse("2024-07-12T12:34:26+01:00");

        //customized text
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate d07 = LocalDate.parse("20/07/2024", fmt1);

        System.out.println(d01);
        System.out.println(d02);
        System.out.println(i01);
        System.out.println(d03);
        System.out.println(d04);
        System.out.println(d05);
        System.out.println(d06);
        System.out.println(d07);
    }
}
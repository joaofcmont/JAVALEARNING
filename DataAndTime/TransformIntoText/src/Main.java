import javax.xml.crypto.Data;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

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
    }
}
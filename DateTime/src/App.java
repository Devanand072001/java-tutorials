
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        LocalDate date = LocalDate.of(2001, Month.JULY, 1);
        LocalTime time = LocalTime.now();

        System.out.println(date);
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("hh:mm:ss: " + dateTime.format(formattedDate));// formated date

        DateTimeFormatter formattedTime = DateTimeFormatter.ofPattern("dd-mm-yy");
        System.out.println("dd-mm-yy: " + dateTime.format(formattedTime));

        System.out.println(dateTime.getHour()+" : "+ dateTime.getMinute() + ": " + dateTime.getSecond());
        System.out.println(dateTime.getMonth());
        System.out.println(dateTime.getDayOfWeek());

    }
}

import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class timeZone {
    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        LocalTime zoneTime = LocalTime.now(ZoneId.systemDefault());
        System.out.println(zoneTime);// system default time zone

        /* for (String string : ZoneId.getAvailableZoneIds()) {
         System.out.println(string);
         }
        */

        LocalTime etcTime = LocalTime.now(ZoneId.of("Etc/GMT+8"));
        System.out.println(etcTime.format(formatter));

        Instant i1 = Instant.now();

        System.out.println(i1.toString());// machine readable time
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
        Instant i2 = Instant.now();
        System.out.println(i2);
        System.out.println(i1.compareTo(i2));
    }
}
// Consolas, 'Courier New', monospace
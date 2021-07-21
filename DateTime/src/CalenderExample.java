
// import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
// import java.util.GregorianCalendar;

public class CalenderExample {

    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        System.out.println(cal.getTime());
        System.out.println(cal.get(Calendar.DAY_OF_MONTH) + "-" + (cal.get(Calendar.MONTH) + 1) + "-"
                + cal.get(Calendar.YEAR));/** january --> 0, febrary -->1, month = month + 1 */
        System.out.println(
                cal.get(Calendar.HOUR_OF_DAY) + " : " + cal.get(Calendar.MINUTE) + " : " + cal.get(Calendar.SECOND));

        System.out.println(cal.get(Calendar.DAY_OF_YEAR));
        System.out.println("Day: "+ LocalDateTime.now().getDayOfWeek());
        // SimpleDateFormat formatter = new SimpleDateFormat();

        // GregorianCalendar gregorianCalendar = new GregorianCalendar();
        // System.out.println(formatter.format(gregorianCalendar.getTime()));
    }
}
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class App {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println();

        System.out.println(cal.getTime());
        System.out.println(cal.get(Calendar.DATE) + "-" + (cal.get(Calendar.MONTH) + 1) + "-"
                + cal.get(Calendar.YEAR));/* january --> 0, February -->1, month = month + 1 */
        System.out.println(
                cal.get(Calendar.HOUR) + " : " + cal.get(Calendar.MINUTE) + " : " + cal.get(Calendar.SECOND));

        System.out.println(cal.get(Calendar.DAY_OF_YEAR));

        SimpleDateFormat formatter = new SimpleDateFormat();

        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        System.out.println(formatter.format(gregorianCalendar.getTime()));
    }
}

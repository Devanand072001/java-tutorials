import java.time.LocalDateTime;
import java.util.Calendar;

public class Greeting {
    public void displayMessage() {
        Calendar cal = Calendar.getInstance();
        int am_pm = cal.get(Calendar.AM_PM);
        if (am_pm == 1) {
            System.out.println("Good night");
        } else {
            System.out.println("good morning");
        }

    }
}

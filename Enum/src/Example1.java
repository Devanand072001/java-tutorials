import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Scanner;

enum Week {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
}

/*An enum is a special "class" that represents a group of
constants unchangeable variables, like final variables).
The must be in upper case only.*/
public class Example1 {
    public static void main(String[] args) {



        for (Week day : Week.values()) {
            System.out.println(day + " ordinal value: " + day.ordinal());
        }
        //definition
        Week monday = Week.MONDAY;
        System.out.println(Week.SUNDAY);//or
        System.out.println(Week.valueOf("SUNDAY"));
        System.out.println(Arrays.toString(Week.values()));
        System.out.println("Enter day to check leave: ");
        checkLeave(new Scanner(System.in).next().toUpperCase());
        checkLeaveToday();
    }

    private static void checkLeaveToday() {
        DayOfWeek dateTime = LocalDateTime.now().getDayOfWeek();
        String day = dateTime.toString();
        System.out.println(dateTime);
        Week sunday = Week.SUNDAY;
        System.out.println("Check by current day");
        if (Arrays.toString(Week.values()).contains(day)){
            if (day.equals(sunday.toString())){
                System.out.println("You can take leave");
            }else {
                System.out.println("Go to work");
            }
        }else {
            System.out.println("Invalid day");
        }
    }

    private static void checkLeave(String weekDay) {
        System.out.println(weekDay);
        Week sunday = Week.SUNDAY;
        System.out.println("Check by user input: ");
        if (Arrays.toString(Week.values()).contains(weekDay)){
            if (weekDay.equals(sunday.toString())){
                System.out.println("You can take leave");
            }else {
                System.out.println("Go to work");
            }
        }else {
            System.out.println("Invalid day");
        }

    }
}

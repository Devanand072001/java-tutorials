import java.text.NumberFormat;
import java.util.Scanner;

public class Employee {

    double baseSalary, extraHours, hourlyWage;
    String employeeName;



    public void Getsalary(String employeeName, double baseSalary, double extraHours, double hourlyWage) {

        Scanner salaryScanner = new Scanner(System.in);
        System.out.println("employee name: ");
        employeeName = salaryScanner.nextLine();
        System.out.println();
        System.out.println("base salary: ");
        baseSalary = salaryScanner.nextDouble();
        System.out.println("extra hours: ");
        extraHours = salaryScanner.nextDouble();
        System.out.println("hourly wage: ");
        hourlyWage = salaryScanner.nextDouble();

        this.employeeName = employeeName;
        this.baseSalary = baseSalary;
        this.extraHours = extraHours;
        this.hourlyWage = hourlyWage;
        salaryScanner.close();

        System.out.println("Hey " + this.employeeName.toUpperCase() + " your salary is "
                + NumberFormat.getCurrencyInstance().format(this.baseSalary + (this.extraHours * this.hourlyWage)));

    }
}

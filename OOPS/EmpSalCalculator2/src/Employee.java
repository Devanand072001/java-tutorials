import java.text.NumberFormat;
import java.util.Scanner;

public class Employee {

    double hourlyRate;

    Scanner employeeScanner = new Scanner(System.in);
    public void SalaryCalculate(Double hourlyRate) {

        System.out.println("Employee name: ");
        String employeeName = employeeScanner.nextLine();
        System.out.println();
        System.out.println("base salary: ");
        double baseSalary = employeeScanner.nextDouble();


        System.out.println("extra hours: ");
        double extraHours = employeeScanner.nextDouble();
        this.hourlyRate = hourlyRate;

        double salary = baseSalary + (extraHours * hourlyRate);
        System.out.println("salary of " + employeeName.toUpperCase() + " is " + NumberFormat.getCurrencyInstance().format(salary));

        // employeeScanner.close();


    }

}

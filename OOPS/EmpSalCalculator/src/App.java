import java.text.NumberFormat;

public class App {
    public static void main(String[] args)  {

        Employee employeeObject = new Employee((double)50000,(double)20);
        new Employee((double)20000);

        // employeeObject.baseSalary = 50_000;

        // employeeObject.hourlyRate = 20;

        employeeObject.setBaseSalary(5);
        employeeObject.getBaseSalary();

        employeeObject.setHourlyRate(5);

        employeeObject.getHourlyRate();

        double wage = employeeObject.calculateWage((double) 50);
        System.out.println(NumberFormat.getCurrencyInstance().format(wage));

    }
}

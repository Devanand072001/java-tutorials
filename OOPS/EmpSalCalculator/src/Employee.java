public class Employee {

    public double baseSalary;
    public double hourlyRate;
    // public double extraHours ;

    public Employee(double baseSalary) {
        // this.baseSalary = baseSalary;
        // this.hourlyRate = hourlyRate;
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);

    }



    public Employee(double baseSalary, double hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }



    public double calculateWage(double extraHours) {
        return baseSalary + (hourlyRate * extraHours);
        // return NumberFormat.getCurrencyInstance().format(wage);
    }
    public void calculateWage(double extraHours, double hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
    }
    public double calculateWage() {
        return baseSalary ;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0) {
            throw new IllegalArgumentException("salary must be greater than 0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) {
            throw new IllegalArgumentException("hourly rate must be greater than 0");
        }
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }
}

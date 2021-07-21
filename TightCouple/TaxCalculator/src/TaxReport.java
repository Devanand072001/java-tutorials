import java.text.NumberFormat;

public class TaxReport {
    private final TaxCalculator calculator;

    public TaxReport(TaxCalculator calculator) {
        this.calculator = calculator;
    }

    public void show() {
        var tax = calculator.calculateTax();
        NumberFormat currencyFormat =  NumberFormat.getCurrencyInstance();
        System.out.println(currencyFormat.format(tax));
    }

}
